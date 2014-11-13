package br.com.petshopplus.daoInterfaces;

import java.util.List;

import br.com.petshopplus.model.Animal;

public interface AnimalInterfaceDao {
	void apagarAnimal(String rgDoAnimal);  
	   
	List<Animal> buscarTodosAnimais();
	  
	void atualizarAnimal(Animal animal);
	  
	Animal buscarAnimal(String rgDoAnimal);  
	  
	void insereAnimal(Animal animal);
}
