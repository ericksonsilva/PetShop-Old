package br.com.petshopplus.daoInterfaces;

import java.util.List;

import br.com.petshopplus.model.Funcionario;

public interface FuncionarioInterfaceDao {
	
	void apagarFuncionario(String cpf);  
	  
	List<Funcionario> buscarTodosFuncionarios();  
	  
	void atualizarFuncionario(Funcionario funcionario);  
	  
	Funcionario buscarFuncionario(String cpf);  
	  
	void insereFuncionario(Funcionario funcionario); 
}
