package albi.bowling.actions.popup.actions;

import org.eclipse.core.databinding.Binding;
import org.eclipse.swt.widgets.Shell;
import bowling.Game;


public class ImplementationMatchupDialog extends MatchupDialog {

	private Binding bindValue;

	protected ImplementationMatchupDialog(Shell parentShell) {
		super(parentShell);
	}
 

	@Override
	protected void setActiveGame(Game firstElement) {
		if(bindValue!=null){
			bindValue.dispose();
		}	 
	}
}