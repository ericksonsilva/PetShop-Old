package br.com.PetShopPlus.DaoInterfaces;

import java.util.List;

import br.com.PetShopPlus.model.Cliente;

public interface ClienteInterfaceDao {
	void apagarCliente(String cpf);  
	  
	List<Cliente> buscarTodosClientes();
	  
	void atualizarCliente(Cliente cliente);  
	  
	List<Cliente> buscarCliente(String cpf);  
	  
    void insereCliente(Cliente cliente);  
}
