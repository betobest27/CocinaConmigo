package sv.com.dao;

import java.util.List;
import sv.com.model.Usuario;

public interface UsuarioDao {
	
	public void nuevoUsuario(Usuario usuario);
	
	public void modificarUsuario(Usuario usuario);
	
	public void borrarUsuario(Usuario usuario);
	
	public List<Usuario> listarUsuarios();
}