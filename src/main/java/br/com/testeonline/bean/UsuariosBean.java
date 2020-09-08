package br.com.testeonline.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.testeonline.entity.Users;
import br.com.testeonline.to.UsersTO;

@ManagedBean(name ="UsuariosBean")
@ViewScoped
public class UsuariosBean {

	
	private List<Users> listUsers = new ArrayList<Users>();
	private UsersTO usuario = new UsersTO();
	private Users usuarioVO = new Users();
	
	public void init() {
		List<Users> listUsersTO = new ArrayList<Users>();
		listUsersTO.addAll(usuario.getAllUsers());
		listUsers.addAll(listUsersTO);
	}
	
	public void cadastrarUsuario() {
		this.usuario.persist(this.usuarioVO);
	}
	
	public List<Users> getAllUsers() {
		return this.usuario.getAllUsers();
	}
	
	public List<Users> getListUsers() {
		return listUsers;
	}

	public void setListUsers(List<Users> listUsers) {
		this.listUsers = listUsers;
	}

	public UsersTO getUsersTO() {
		return usuario;
	}

	public void setUsersTO(UsersTO usersTO) {
		this.usuario = usersTO;
	}

	public Users getUsuarioVO() {
		return usuarioVO;
	}

	public void setUsuarioVO(Users usuarioVO) {
		this.usuarioVO = usuarioVO;
	}

	public UsersTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsersTO usuario) {
		this.usuario = usuario;
	}

	
}
