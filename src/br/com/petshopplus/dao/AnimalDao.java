package br.com.petshopplus.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.petshopplus.model.Animal;
import br.com.petshopplus.persistence.HibernateUtil;

public class AnimalDao {
	
	private final Session session;
	
	public AnimalDao(){
		session = HibernateUtil.getInstance().getSession();
	}

	public void salva(Animal animal) {
		Transaction tx = session.beginTransaction();
		this.session.save(animal);
		tx.commit();
	}
	
	public void atualiza(Animal animal) {
		Transaction tx = session.beginTransaction();
		this.session.update(animal);
		tx.commit();
	}
	
	public void remove(Animal animal) {
		Transaction tx = session.beginTransaction();
		this.session.delete(animal);
		tx.commit();
	}
	
	public Animal carrega(int registro) {
		return (Animal) this.session.get(Animal.class, registro);
	}
	
	public Animal carrega(Animal animal) {
		return (Animal) session.createCriteria(Animal.class)
		.add(Restrictions.eq("registro", animal.getRegistro()))
		.uniqueResult();
	}
	
	public boolean existeAnimal(Animal animal) {
		Animal encontrado = (Animal) session.createCriteria(Animal.class)
				.add(Restrictions.eq("url", animal.getRegistro()))
				.uniqueResult();
				return encontrado != null;
	}	
	
	@SuppressWarnings("unchecked")
	public List<Animal> lista(String nome) {
		return this.session.createCriteria(Animal.class)
		.add(Restrictions.eq("nome", nome)).list();
	}
	
	@SuppressWarnings("unchecked")
	public List<Animal> lista() {
		return this.session.createCriteria(Animal.class).list();
	}
}
