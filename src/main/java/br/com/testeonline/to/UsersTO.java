package br.com.testeonline.to;

import java.util.ArrayList;
import java.util.List;

import br.com.testeonline.dao.UsersDAO;
import br.com.testeonline.entity.Users;

public class UsersTO {
	
	private String nome;
	private String senha;
	private String email;
	private String telefone;
	
	List<Users> listUsers = new ArrayList<Users>();
	Users users = new Users();
	UsersDAO usuarioDAO = new UsersDAO();
	
	public Users getUsuario(Users users) {
		return usuarioDAO.getUsuario(users.getNome(), users.getSenha());
	}
	
	public List<Users> getAllUsers() {
		this.listUsers = this.usuarioDAO.findAll();
		return this.listUsers;
	}

	public Users getUsers()  {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public void persist(Users usuarioVO) {
		this.usuarioDAO.inserirUsuario(usuarioVO);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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
	
}
