package sv.com.model;
// Generated 11-ene-2017 9:17:44 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario implements java.io.Serializable {

	private Integer idUsuario;
	private Persona persona;
	private String usuario;
	private String password;
	private String activo;
	private Set<Contacto> contactos = new HashSet<Contacto>(0);
	private Set<Tips> tipses = new HashSet<Tips>(0);
	private Set<Receta> recetas = new HashSet<Receta>(0);

	public Usuario() {
	}

	public Usuario(Persona persona) {
		this.persona = persona;
	}

	public Usuario(Persona persona, String usuario, String password, String activo, Set<Contacto> contactos,
			Set<Tips> tipses, Set<Receta> recetas) {
		this.persona = persona;
		this.usuario = usuario;
		this.password = password;
		this.activo = activo;
		this.contactos = contactos;
		this.tipses = tipses;
		this.recetas = recetas;
	}

	public Integer getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public Set<Contacto> getContactos() {
		return this.contactos;
	}

	public void setContactos(Set<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Set<Tips> getTipses() {
		return this.tipses;
	}

	public void setTipses(Set<Tips> tipses) {
		this.tipses = tipses;
	}

	public Set<Receta> getRecetas() {
		return this.recetas;
	}

	public void setRecetas(Set<Receta> recetas) {
		this.recetas = recetas;
	}

}