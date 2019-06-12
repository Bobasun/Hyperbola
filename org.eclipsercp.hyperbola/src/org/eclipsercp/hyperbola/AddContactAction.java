package org.eclipsercp.hyperbola;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class AddContactAction extends Action implements ISelectionListener, ActionFactory.IWorkbenchAction {

	private final IWorkbenchWindow window;
	public final static String ID = "org.eclipsercp.hyperbola.addContact";
	private IStructuredSelection selection;

	public AddContactAction(IWorkbenchWindow window) {
		this.window = window;
		setId(ID);
		setText("&Add Contact...");
		setToolTipText("Add a contact to your contacts list.");
		setImageDescriptor(
				AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipsercp.hyperbola", IImageKeys.ADD_CONTACT));
		window.getSelectionService().addSelectionListener(this);
	}

	public void dispose() {
		window.getSelectionService().removeSelectionListener(this);
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub

	}

}
