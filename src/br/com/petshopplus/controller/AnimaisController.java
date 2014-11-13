package br.com.petshopplus.controller;

import br.com.petshopplus.dao.AnimalDao;
import br.com.petshopplus.model.Animal;

public class AnimaisController {
	
	public static void main (String args[]){
		Animal a = new Animal();
		a.setNome("Teste");
		AnimalDao dao = new AnimalDao();
		dao.insereAnimal(a);
	}
	

}
