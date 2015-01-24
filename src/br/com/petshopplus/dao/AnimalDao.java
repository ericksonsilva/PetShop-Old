package br.com.petshopplus.dao;

import java.util.List;

import org.hibernate.Session;

import br.com.petshopplus.model.Animal;
import br.com.petshopplus.persistence.HibernateUtil;

public class AnimalDao {
	
	Session session;
	HibernateUtil hu;
	
	public AnimalDao(){
		hu = hu.getInstance();
		session = hu.getSession();
	}

	public void apagarAnimal(String rgDoAnimal) {
		// TODO Auto-generated method stub

	}

	public List<Animal> buscarTodosAnimais() {
		// TODO Auto-generated method stub
		return null;
	}

	public void atualizarAnimal(Animal animal) {
		// TODO Auto-generated method stub

	}

	public Animal buscarAnimal(String rgDoAnimal) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insereAnimal(Animal animal) {
		session.beginTransaction();
		session.save(animal);

	}

}
