package com.ecommerce.models;

import java.time.Instant;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Document(collection = "clientes")
public class Cliente {

	@Id
	private String _id;

	private String nome;

	@Indexed(unique = true)
	private String telefone;

	@Indexed(unique = true)
	private String email;

	@JsonIgnore
	private String senha;

	private Instant cadastradoEm;

	private Instant atualizadoEm;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(String _id, String nome, String telefone, String email, String senha, Instant cadastradoEm,
			Instant atualizadoEm) {
		super();
		this._id = _id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.senha = senha;
		this.cadastradoEm = cadastradoEm;
		this.atualizadoEm = atualizadoEm;
	}

	@Override
	public String toString() {
		return "Cliente [_id=" + _id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", senha="
				+ senha + ", cadastradoEm=" + cadastradoEm + ", atualizadoEm=" + atualizadoEm + "]";
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Instant getCadastradoEm() {
		return cadastradoEm;
	}

	public void setCadastradoEm(Instant cadastradoEm) {
		this.cadastradoEm = cadastradoEm;
	}

	public Instant getAtualizadoEm() {
		return atualizadoEm;
	}

	public void setAtualizadoEm(Instant atualizadoEm) {
		this.atualizadoEm = atualizadoEm;
	}

	
	
}