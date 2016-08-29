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
import bowling.Game;
import bowling.Matchup;

public abstract class MatchupDialog extends Dialog {

	private static final int _ADDGAME = 1;
	 
	protected MatchupDialog(Shell parentShell) {
		super(parentShell);
	}

	private Matchup matchup;
	private ComposedAdapterFactory composedAdapterFactory;
	private Resource resource;
	
	
	private NumberofGamesListener numberofGamesListener;
	private AdapterFactoryLabelProvider adapterFactoryLabelProvider;
	private AdapterFactoryContentProvider adapterFactoryContentProvider;
	protected Label numberOfGames;

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite root = (Composite) super.createDialogArea(parent);
		root.setLayout(new FillLayout(SWT.VERTICAL));

		
		ListViewer listViewer = new ListViewer(root, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL);
		listViewer.setContentProvider(new AdapterFactoryContentProvider(getAdapterFactory()));
		listViewer.setLabelProvider(new AdapterFactoryLabelProvider(getAdapterFactory()));
		listViewer.setInput(getMatchup());
		listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				if(selection instanceof IStructuredSelection){
					IStructuredSelection iStructuredSelection = (IStructuredSelection) selection;
					setActiveGame((Game)iStructuredSelection.getFirstElement());
				}
				
			}
		});
		
		Composite labelComposite = new Composite(root, SWT.None);
		labelComposite.setLayout(new GridLayout(2, false));
		Label text = new Label(labelComposite, SWT.None);
		text.setText("Number of Games: ");
		numberOfGames = new Label(labelComposite, SWT.None);
		TreeViewer treeViewer = new TreeViewer(root, SWT.SINGLE | SWT.H_SCROLL
				| SWT.V_SCROLL);
		initializeTreeviewer(treeViewer);
		initializeListener();
		updateNumberOfGames();
		root.layout();
		parent.pack();
		return parent;
	}


	protected abstract void setActiveGame(Game firstElement);

 
	protected void loadContent(IFile file) throws IOException {
		AdapterFactoryEditingDomain editingDomain = new AdapterFactoryEditingDomain(
				getAdapterFactory(), new BasicCommandStack());
		resource = editingDomain.createResource(file.getFullPath().toString());
		resource.load(null);
		EObject eObject = resource.getContents().get(0);
		setMatchup((Matchup) eObject);
	}

	protected void save() throws IOException {
		resource.save(null);
	}

	public Matchup getMatchup() {
		return matchup;
	}

	public void setMatchup(Matchup matchup) {
		this.matchup = matchup;
	}


	@Override
	protected void buttonPressed(int buttonId) {
		switch (buttonId) {
		case _ADDGAME:
			EList<Game> games = matchup.getGames();
			if (games.size()==0){
			addGame();
			}
			break;
		default:
			super.buttonPressed(buttonId);
		}
	}

	

	protected void addGame(){
		Game game = BowlingFactory.eINSTANCE.createGame();
		EditingDomain editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(getMatchup());
		Command command = AddCommand.create(editingDomain, getMatchup(),
				BowlingPackage.eINSTANCE.getMatchup(), game);
		editingDomain.getCommandStack().execute(command);
		
		
		
		Game game2 = BowlingFactory.eINSTANCE.createGame();
		EditingDomain editingDomain2 = AdapterFactoryEditingDomain
				.getEditingDomainFor(getMatchup());
		Command command2 = AddCommand.create(editingDomain2, getMatchup(),
				BowlingPackage.eINSTANCE.getMatchup(), game2);
		editingDomain2.getCommandStack().execute(command2);
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, _ADDGAME, "Add 2 Games", true);
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
					"Something went wrong on save", status);
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
		numberofGamesListener = new NumberofGamesListener();
		getMatchup().eAdapters().add(numberofGamesListener);
	}

	 
	protected void updateNumberOfGames() {
		if (matchup != null) {
			EList<Game> games = matchup.getGames();
			if (games != null) {
				numberOfGames.setText(games.size() + "");
				return;
			}
		}
		numberOfGames.setText("");
		return;
	}
	 

	private final class NumberofGamesListener extends AdapterImpl {
		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getFeature().equals(
					BowlingPackage.eINSTANCE.getMatchup_Games())) {
				updateNumberOfGames();
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
		treeViewer.setInput(getMatchup());
	}



}
