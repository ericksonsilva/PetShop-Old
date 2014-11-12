package br.com.PetShopPlus.DaoInterfaces;

import java.util.List;

import br.com.PetShopPlus.model.Animal;

public interface DaoAnimalInterface {
	void apagarAnimal(String rgDoAnimal);  
	   
	List<Animal> buscarTodosAnimais();
	  
	void atualizarAnimal(Animal animal);
	  
	List<Animal> buscarAnimal(String rgDoAnimal);  
	  
	void insereAnimal(Animal animal);
}
