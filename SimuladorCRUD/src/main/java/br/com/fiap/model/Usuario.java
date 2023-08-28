package br.com.fiap.model;

import java.util.Date;

public class Usuario {

	private int id;
	private String nome, email, telefone, senha;
	private Date dataCadastro;

	public Usuario(String nome, String email, String telefone, String senha) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.dataCadastro = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
