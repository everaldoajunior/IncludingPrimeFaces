package br.com.testeonline.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;

import br.com.testeonline.entity.Users;
import br.com.testeonline.to.UsersTO;

@ManagedBean( name = "UsersMB")
@ViewScoped
public class UsersBean {
	
	private Users usuario = new Users();
	private UsersTO usersTO = new UsersTO();
	private List<Users> listUsers = new ArrayList<Users>();
	
	static Logger log = Logger.getLogger(UsersBean.class.getName());
	
	public String envia() {

		usuario = usersTO.getUsuario(usuario);
		if (usuario == null) {
			usuario = new Users();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!", "Erro no Login!"));
			log.info("LoginMB - login() - Usuário não encontrado!");
			return null;
		} else {
			log.info("LoginMB - login() - OK");
			this.listUsers = this.usersTO.getAllUsers();
			return "index?faces-redirect=true";
		}
	}

	public Users getUsuario() {
 		return usuario;
	}

	public void setUsuario(Users usuario) {
		this.usuario = usuario;
	}

	public List<Users> getListUsers() {
		return listUsers;
	}

	public void setListUsers(List<Users> listUsers) {
		this.listUsers = listUsers;
	}

	public UsersTO getUsersTO() {
		return usersTO;
	}

	public void setUsersTO(UsersTO usersTO) {
		this.usersTO = usersTO;
	}

}
