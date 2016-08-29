package albi.bowling.actions.popup.actions;

import org.eclipse.core.databinding.Binding;
 
import org.eclipse.swt.widgets.Shell;
 
import bowling.Player;

public class ImplementationLeagueDialog extends LeagueDialog {
 
	private Binding bindValue;	
	
	protected ImplementationLeagueDialog(Shell parentShell) {
		super(parentShell);
	}
 
	@Override
	protected void setActivePlayer(Player firstElement) {
		if(bindValue!=null){
			bindValue.dispose();
		}
	}
	}