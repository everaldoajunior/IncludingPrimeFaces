package br.com.testeonline.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.apache.log4j.Logger;

import br.com.testeonline.entity.Users;
import br.com.testeonline.to.UsersTO;

@ManagedBean( name = "UsersMB")
@SessionScoped
public class UsersBean {
	
	private Users usuario = new Users();
	private UsersTO usersTO = new UsersTO();
	
	static Logger log = Logger.getLogger(UsersBean.class.getName());
	
	public String envia() {

		usuario = usersTO.getUsuario(usuario);
		if (usuario == null) {
			usuario = new Users();
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário não encontrado!", "Erro no Login!"));
			log.info("LoginMB - login() - Usuário não encontrado!");
			return null;
		} else {
			return "index?faces-redirect=true";
		}
	}

	public Users getUsuario() {
 		return usuario;
	}

	public void setUsuario(Users usuario) {
		this.usuario = usuario;
	}

	public UsersTO getUsersTO() {
		return usersTO;
	}

	public void setUsersTO(UsersTO usersTO) {
		this.usersTO = usersTO;
	}

}
