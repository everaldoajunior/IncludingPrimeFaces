package br.com.testeonline.to;

import java.util.ArrayList;
import java.util.List;

import br.com.testeonline.dao.UsersDAO;
import br.com.testeonline.entity.Users;

public class UsersTO {
	
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

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
}
