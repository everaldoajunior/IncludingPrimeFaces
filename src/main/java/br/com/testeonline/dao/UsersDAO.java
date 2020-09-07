package br.com.testeonline.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;

import br.com.testeonline.entity.Users;

public class UsersDAO {

	static Logger log = Logger.getLogger(UsersDAO.class.getName());
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("users");
	private EntityManager em = factory.createEntityManager();

	public Users getUsuario(String usuario, String senha) {
		
		try {
			Users users = (Users) em
			         .createQuery(
			             "SELECT u from Users u where u.nome = :name and u.senha = :senha")
			         .setParameter("name", usuario)
			         .setParameter("senha", senha).getSingleResult();
			log.info("Busca realizada com sucesso!");
			return users;
			
		} catch (NoResultException e ){
			e.getMessage();
			log.info("Não foram encontrados resultados para o Usuário passado!");
			return null;
		}
	}

	public boolean inserirUsuario(Users usuario) {
		try {
			em.persist(usuario);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deletarUsuario(Users usuario) {
		try {
			em.remove(usuario);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Users> findAll() {
		return this.obterTodos(999, 0);
	}

	private List<Users> obterTodos(int limit, int offset) {
		String jpql = "SELECT u from Users u";
		TypedQuery<Users> query = em.createQuery(jpql, Users.class);
		query.setMaxResults(limit);
		query.setFirstResult(offset);
		return query.getResultList();
	}

}
