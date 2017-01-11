package sv.com.bean;

import java.util.List;
import sv.com.dao.UsuarioDao;
import sv.com.imp.UsuarioDaoImp;
import sv.com.model.Usuario;

public class UsuarioBean {

	private Usuario usuario;
	private List<Usuario> listaUsuarios;
	
	public UsuarioBean() {
		// TODO Auto-generated constructor stub
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	//listado de usuarios
	public List<Usuario> getListaUsuarios() {
		UsuarioDao usuarioDao = new UsuarioDaoImp();
		listaUsuarios = usuarioDao.listarUsuarios();
		return listaUsuarios;
	}
	
	//Nuevo Usuario
	public void nuevoUsuario() {
		UsuarioDao usuarioDao = new UsuarioDaoImp();
		usuarioDao.nuevoUsuario(usuario);
		this.usuario = new Usuario();
	}
	
	//Modificar Usuario
	public void actualizarUsuario() {
		UsuarioDao usuarioDao = new UsuarioDaoImp();
		usuarioDao.modificarUsuario(usuario);
		this.usuario = new Usuario();
	}
	
	//Borrar Usuario
	public void eliminarUsuario() {
		UsuarioDao usuarioDao = new UsuarioDaoImp();
		usuarioDao.borrarUsuario(usuario);
		this.usuario = new Usuario();
	}
}