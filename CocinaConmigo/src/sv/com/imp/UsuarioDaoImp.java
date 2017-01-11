package sv.com.imp;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sv.com.dao.UsuarioDao;
import sv.com.model.Usuario;
import sv.com.util.HibernateUtil;

public class UsuarioDaoImp implements UsuarioDao{

	@Override
	public void nuevoUsuario(Usuario usuario) {
		Session session = null;
		try {
			session = HibernateUtil.sessionFactory.openSession();
			session.beginTransaction();
			session.save(usuario);
			session.getTransaction().commit();
		} catch(Exception e) {
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			if(session != null) {
				session.close();
			}
		}
	}

	@Override
	public void modificarUsuario(Usuario usuario) {
		Session session = null;
		try {
			session = HibernateUtil.sessionFactory.openSession();
			session.beginTransaction();
			session.update(usuario);
			session.getTransaction().commit();
		} catch(Exception e) {
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			if(session != null) {
				session.close();
			}
		}
	}

	@Override
	public void borrarUsuario(Usuario usuario) {
		Session session = null;
		try {
			session = HibernateUtil.sessionFactory.openSession();
			session.beginTransaction();
			session.delete(usuario);
			session.getTransaction().commit();
		} catch(Exception e) {
			session.getTransaction().rollback();
			System.out.println(e.getMessage());
		} finally {
			if(session != null) {
				session.close();
			}
		}
	}

	@Override
	public List<Usuario> listarUsuarios() {
		List<Usuario> listaUsuarios = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		String Hql = "FROM Usuario usu INNER JOIN FETCH usu.persona";
		try {
			listaUsuarios = session.createQuery(Hql).getResultList();
			transaction.commit();
		} catch(Exception e) {
			transaction.rollback();
			System.out.println(e.getMessage());
		} finally {
			if(session != null) {
				session.close();
			}
		}
		return listaUsuarios;
	}
}