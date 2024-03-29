package br.com.petshopplus.controller;

import java.util.List;

import br.com.petshopplus.dao.FuncionarioDao;
import br.com.petshopplus.model.Funcionario;

public class FuncionarioController {
	private FuncionarioDao dao;
	
	public FuncionarioController() {
		dao = new FuncionarioDao();
	}
	
	public void adiciona(Funcionario funcionario){
		dao.salva(funcionario);
	}
	
	public void atualiza(Funcionario funcionario){
		dao.atualiza(funcionario);
	}
	
	public void apaga(Funcionario funcionario){
		dao.remove(funcionario);
	}
	
	public Funcionario busca(String cpf){
		return dao.carrega(cpf);
	}
	
	public Funcionario busca(Funcionario funcionario){
		return dao.carrega(funcionario);
	}
		
	public List<Funcionario> lista(){
		return dao.lista();
	}
	
	public List<Funcionario> lista(String nome){
		return dao.lista(nome);
	}

}
