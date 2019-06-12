package org.eclipsercp.hyperbola;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public static final String ID =  "org.eclipsercp.hyperbola.perspective";
	public Perspective() {
		// TODO Auto-generated constructor stub
		System.err.println();
	}
	
	@Override	
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
//		layout.addView(ContactsView.ID, IPageLayout.LEFT, 1.0f, layout.getEditorArea());

		layout.addStandaloneView(ContactsView.ID, true ,IPageLayout.LEFT, 0.5f, layout.getEditorArea());
	}
}
