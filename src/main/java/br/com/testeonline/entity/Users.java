package br.com.testeonline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users", schema = "public")
public class Users {
	
	@Id
	@GeneratedValue
    @Column(name="id")
	private int id;

	@Column(name ="NOME", nullable = false)
	private String nome;
	
	@Column(name ="EMAIL", nullable = false)
	private String email;
	
	@Column(name ="SENHA", nullable = false)
	private String senha;
	
	@Column(name ="TELEFONE")
	private String telefone;

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	
}
