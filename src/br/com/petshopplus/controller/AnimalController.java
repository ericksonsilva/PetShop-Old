package br.com.petshopplus.controller;

import java.util.List;

import br.com.petshopplus.dao.AnimalDao;
import br.com.petshopplus.model.Animal;

public class AnimalController {
	private AnimalDao animalController;
	
	public AnimalController() {
		animalController = new AnimalDao();
	}
	
	public void insereAnimal(Animal animal){
		animalController.insereAnimal(animal);
	}
	
	public void atualizarAnimal(Animal animal){
		animalController.atualizarAnimal(animal);
	}
	public void apagarAnimal(String rgDoAnimal){
		animalController.apagarAnimal(rgDoAnimal);
	}
	
	public Animal buscarAnimal(String rgDoAnimal){
		return animalController.buscarAnimal(rgDoAnimal);
	}
	public List<Animal> buscarTodosAnimais(){
		return animalController.buscarTodosAnimais();
	}
	
}