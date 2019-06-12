package org.eclipsercp.hyperbola;

import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	private IWorkbenchAction exitAction;  
	private IWorkbenchAction aboutAction;
	
	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}
	
	@Override
	protected void makeActions(IWorkbenchWindow window) {
		super.makeActions(window);
		exitAction = ActionFactory.QUIT.create(window);   
		register(exitAction); 
		aboutAction = ActionFactory.ABOUT.create(window);  
		register(aboutAction);
	}
	
	@Override
	protected void fillMenuBar(IMenuManager menuBar) {
		MenuManager menuHyperbola = new MenuManager("&Hyperbola", "hyperbola");
		menuHyperbola.add(exitAction);
		MenuManager menuHelp = new MenuManager("&Help", "help");
		menuHelp.add(aboutAction);
		menuBar.add(menuHyperbola);
		menuBar.add(menuHelp);
		
		super.fillMenuBar(menuBar);
	}
	
	@Override
	protected void fillCoolBar(ICoolBarManager coolBar) {
		super.fillCoolBar(coolBar);
	}

}

