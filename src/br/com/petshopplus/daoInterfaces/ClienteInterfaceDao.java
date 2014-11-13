package br.com.petshopplus.daoInterfaces;

import java.util.List;

import br.com.petshopplus.model.Cliente;

public interface ClienteInterfaceDao {
	void apagarCliente(String cpf);  
	  
	List<Cliente> buscarTodosClientes();
	  
	void atualizarCliente(Cliente cliente);  
	  
	Cliente buscarCliente(String cpf);  
	  
    void insereCliente(Cliente cliente);  
}
