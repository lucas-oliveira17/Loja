package com.lucas.loja.dto;

import java.util.Calendar;

import com.lucas.loja.entities.Cliente;
import com.lucas.loja.entities.Endereco;

public class ClienteDTO {
	
	private String id;
	private String nome;
	private Calendar dataNascimento;
	private String cpf;
	private String rg;
	private String email;
	private String telefone;
	private Endereco endereco;

	public ClienteDTO(Cliente cliente) {
		id = cliente.getId();
		nome = cliente.getNome();
		dataNascimento = cliente.getDataNascimento();
		cpf = cliente.getCPF();
		cpf = cliente.getRG();
		email = cliente.getEmail();
		telefone = cliente.getTelefone();
		endereco = cliente.getEndereco();
	}

	public ClienteDTO() {
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
	
	
}
