package br.com.petshopplus.controller;

import java.util.List;

import br.com.petshopplus.dao.FuncionarioDao;
import br.com.petshopplus.model.Funcionario;

public class FuncionarioController {
	private FuncionarioDao funcionarioController;
	
	public FuncionarioController() {
		funcionarioController = new FuncionarioDao();
	}
	
	public void insereAnimal(Funcionario funcionario){
		funcionarioController.insereFuncionario(funcionario);
	}
	
	public void atualizarAnimal(Funcionario funcionario){
		funcionarioController.atualizarFuncionario(funcionario);
	}
	public void apagarAnimal(String cpf){
		funcionarioController.apagarFuncionario(cpf);
	}
	
	public Funcionario buscarAnimal(String cpf){
		return funcionarioController.buscarFuncionario(cpf);
	}
	public List<Funcionario> buscarTodosAnimais(){
		return funcionarioController.buscarTodosFuncionarios();
	}

}
