package org.eclipsercp.hyperbola;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipsercp.hyperbola.model.ContactsGroup;

public class ContactContentProvider implements ITreeContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		ContactsGroup group = (ContactsGroup) inputElement;
		return group.getEntries();//?
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		ContactsGroup group = (ContactsGroup) parentElement;
		return group.getEntries();
	}

	@Override
	public Object getParent(Object element) {
		ContactsGroup group = (ContactsGroup) element;
		return group.getParent();
	}

	@Override
	public boolean hasChildren(Object element) {
		ContactsGroup group = (ContactsGroup) element;
		if(group.getParent().getEntries()!=null) {
			return true;
		}
		return false;
	}

}
