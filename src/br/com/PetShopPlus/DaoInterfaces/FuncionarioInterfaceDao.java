package br.com.PetShopPlus.DaoInterfaces;

import java.util.List;

import br.com.PetShopPlus.model.Funcionario;

public interface FuncionarioInterfaceDao {
	void apagar(String cpf);  
	  
	List<Funcionario> buscarTodosFuncionarios();  
	  
	void atualizarFuncionario(Funcionario funcionario);  
	  
	List<Funcionario> buscarFuncionario(String cpf);  
	  
	void insereFuncionario(Funcionario funcionario); 
}
