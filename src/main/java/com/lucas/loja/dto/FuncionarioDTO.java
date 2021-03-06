package com.lucas.loja.dto;

import java.util.Calendar;

import com.lucas.loja.entities.Endereco;
import com.lucas.loja.entities.Funcionario;

public class FuncionarioDTO{

	private String id;
	private String nome;
	private Calendar dataNascimento;
	private String cpf;
	private String rg;
	private String email;
	private String telefone;
	private Endereco endereco;
	private String cargo;

	public FuncionarioDTO() {
	}
	
	public FuncionarioDTO(Funcionario funcionario) {
		this.id = funcionario.getId();
		this.nome = funcionario.getNome();
		this.dataNascimento = funcionario.getDataNascimento();
		this.cpf = funcionario.getCPF();
		this.setRg(funcionario.getRG());
		this.email = funcionario.getEmail();
		this.telefone = funcionario.getTelefone();
		this.endereco = funcionario.getEndereco();
		this.cargo = funcionario.getCargo();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
