package albi.bowling.actions.popup.actions;

import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import bowling.BowlingFactory;
import bowling.BowlingPackage;
import bowling.League;
import bowling.Player;
import bowling.SpecialPlayer;

 

public abstract class LeagueDialog extends Dialog {

	private static final int _ADDPLAYER = 1;//the fastest way to use a switch case I could recall, came from exampoles with number cases
	
	protected LeagueDialog(Shell parentShell) {
		super(parentShell);
	}
	//make reference to the classes generated from the model
	private League league;
	private Player player;
	
	private ComposedAdapterFactory composedAdapterFactory;
	private Resource resource;
	
	private NumberofPlayersListener numberofPlayersListener;//internal class
	
	private AdapterFactoryLabelProvider adapterFactoryLabelProvider;
	private AdapterFactoryContentProvider adapterFactoryContentProvider;
	protected Label numberOfPlayers;
	@Override
	//the area where the user can see the model 
	protected Control createDialogArea(Composite parent) {
		Composite root = (Composite) super.createDialogArea(parent);
		root.setLayout(new FillLayout(SWT.VERTICAL));

		
		ListViewer listViewer = new ListViewer(root, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL);
		listViewer.setContentProvider(new AdapterFactoryContentProvider(getAdapterFactory()));
		listViewer.setLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));
		listViewer.setInput(getLeague());
		listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				if(selection instanceof IStructuredSelection){
					IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
					setActivePlayer((Player)iStructuredSelection.getFirstElement());
				}
				
			}
		});
		
	 
		Composite labelComposite = new Composite(root, SWT.None);
		labelComposite.setLayout(new GridLayout(2, false));
		Label text = new Label(labelComposite, SWT.None);
		text.setText("Number of Players: ");
		numberOfPlayers = new Label(labelComposite, SWT.None);
		TreeViewer treeViewer = new TreeViewer(root, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL);
		initializeTreeviewer(treeViewer);//tree viewer in order to see the model in a good way
		initializeListener();
		updateNumberOfPlayers();
		root.layout();
		parent.pack();
		return parent;
	}


	protected abstract void setActivePlayer(Player firstElement);


	//load EObjects from a file and be able to work on them
	protected void loadContent(IFile file) throws IOException {
		AdapterFactoryEditingDomain editingDomain = new AdapterFactoryEditingDomain(
				getAdapterFactory(), new BasicCommandStack());
		resource = editingDomain.createResource(file.getFullPath().toString());
		resource.load(null);
		EObject eObject = resource.getContents().get(0);
		setLeague((League) eObject);
	}

	protected void save() throws IOException {
		resource.save(null);
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	@Override
	protected void buttonPressed(int buttonId) {
		switch (buttonId) {
		case _ADDPLAYER:
			EList<Player> player = league.getPlayers();
			if (player.size()==0)//needed in order to do the check for fulfilling the request: add one object (of each class) to an existing model if it
				//does not already exist in the model
			{
			addPlayer();
			}
			break;
		default:
			super.buttonPressed(buttonId);
		}
	}

	

	protected void addPlayer(){
		Player player = BowlingFactory.eINSTANCE.createPlayer();
		EditingDomain editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(getLeague());//as we are working under it
		Command command = AddCommand.create(editingDomain, getLeague(),
				BowlingPackage.eINSTANCE.getLeague_Players(), player);//since there is a relation between them
		editingDomain.getCommandStack().execute(command);//nedded for the command executation 
		
		
		SpecialPlayer specialplayer = BowlingFactory.eINSTANCE.createSpecialPlayer();
		EditingDomain editingDomain2 = AdapterFactoryEditingDomain
				.getEditingDomainFor(getLeague());
		Command command2 = AddCommand.create(editingDomain2, getLeague(),
				BowlingPackage.eINSTANCE.getSpecialPlayer(), specialplayer);
		editingDomain2.getCommandStack().execute(command2);
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, _ADDPLAYER, "Add Player + Special", true);//notify the user what the button will do
		super.createButtonsForButtonBar(parent);
	}

	@Override
	protected void okPressed() {
		try {
			save();
		} catch (IOException e) {
			Status status = new Status(IStatus.ERROR,
					"albi.bowling.actions", 0, e.getMessage(),
					null);
			ErrorDialog.openError(this.getShell(), "Error on save",
					"Something went wrong on save", status);// if errors are present
		}
		super.okPressed();
	}




	/**
	 * Return an ComposedAdapterFactory for all registered models
	 * 
	 * @return a ComposedAdapterFactory
	 */
	protected AdapterFactory getAdapterFactory() {
		if (composedAdapterFactory == null) {
			composedAdapterFactory = new ComposedAdapterFactory(
					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		}
		return composedAdapterFactory;
	}

	protected void initializeListener() {
		numberofPlayersListener = new NumberofPlayersListener();
		getLeague().eAdapters().add(numberofPlayersListener);
	}

	 
	protected void updateNumberOfPlayers() {
		if (league != null) {
			EList<Player> players = league.getPlayers();
			if (players != null) {
				numberOfPlayers.setText(players.size() + "");//created just for informative purposes
				return;
			}
		}
		numberOfPlayers.setText("");//default value
		return;
	}
	 

	private final class NumberofPlayersListener extends AdapterImpl {
		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getFeature().equals(
					BowlingPackage.eINSTANCE.getLeague_Players())) {//for what to listen at
				updateNumberOfPlayers();//what to do with that
			}
			super.notifyChanged(msg);
		}
	}
	
	
	protected void initializeTreeviewer(TreeViewer treeViewer) {
		adapterFactoryLabelProvider = new AdapterFactoryLabelProvider(
				getAdapterFactory());
		treeViewer.setLabelProvider(adapterFactoryLabelProvider);
		adapterFactoryContentProvider = new AdapterFactoryContentProvider(
				getAdapterFactory());
		treeViewer.setContentProvider(adapterFactoryContentProvider);
		treeViewer.setInput(getLeague());
		//from the examples given from eclipse tutorial given in the lab,
		//we gave the treeviewer just for a better view of model http://help.eclipse.org/mars/index.jsp
	}


}
