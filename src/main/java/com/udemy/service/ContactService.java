package com.udemy.service;

import java.util.List;

import com.udemy.entity.Contact;
import com.udemy.model.ContactModel;

public interface ContactService {
	
	// todos los métodos de una interface son por defecto public y abstract; se puede explicitarlo o no
	public abstract ContactModel addContact(ContactModel contactModel);
	List<ContactModel> listAllContacts();
	Contact findContactById(int id);
	public abstract void removeContact(int id);
	ContactModel findContactByIdModel(int id);

}
