package br.com.petshopplus.controller;


import java.util.List;

import br.com.petshopplus.dao.ClienteDao;
import br.com.petshopplus.model.Cliente;

public class ClienteController {
	private ClienteDao clienteController;
	public ClienteController() {
		clienteController = new ClienteDao();
	}

	public void insereCliente(Cliente cliente){
		clienteController.insereCliente(cliente);
	}
	
	public void atualizarAnimal(Cliente cliente){
		clienteController.atualizarCliente(cliente);
	}
	public void apagarAnimal(String cpf){
		clienteController.apagarCliente(cpf);
	}
	
	public Cliente buscarAnimal(String cpf){
		return clienteController.buscarCliente(cpf);
	}
	public List<Cliente> buscarTodosClientes(){
		return clienteController.buscarTodosClientes();
	}
}