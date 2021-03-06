package sv.com.model;
// Generated 11-ene-2017 9:17:44 by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Receta generated by hbm2java
 */
public class Receta implements java.io.Serializable {

	private RecetaId id;
	private Categoria categoria;
	private TipoComida tipoComida;
	private Usuario usuario;
	private String nombre;
	private String procedimiento;
	private String imagen;
	private int publico;
	private Date fechaRegistro;
	private Date fechaActualizacion;
	private Set<RecetaFavorita> recetaFavoritas = new HashSet<RecetaFavorita>(0);
	private Set<IngredienteReceta> ingredienteRecetas = new HashSet<IngredienteReceta>(0);

	public Receta() {
	}

	public Receta(RecetaId id, Categoria categoria, TipoComida tipoComida, Usuario usuario, String nombre,
			String procedimiento, String imagen, int publico, Date fechaRegistro) {
		this.id = id;
		this.categoria = categoria;
		this.tipoComida = tipoComida;
		this.usuario = usuario;
		this.nombre = nombre;
		this.procedimiento = procedimiento;
		this.imagen = imagen;
		this.publico = publico;
		this.fechaRegistro = fechaRegistro;
	}

	public Receta(RecetaId id, Categoria categoria, TipoComida tipoComida, Usuario usuario, String nombre,
			String procedimiento, String imagen, int publico, Date fechaRegistro, Date fechaActualizacion,
			Set<RecetaFavorita> recetaFavoritas, Set<IngredienteReceta> ingredienteRecetas) {
		this.id = id;
		this.categoria = categoria;
		this.tipoComida = tipoComida;
		this.usuario = usuario;
		this.nombre = nombre;
		this.procedimiento = procedimiento;
		this.imagen = imagen;
		this.publico = publico;
		this.fechaRegistro = fechaRegistro;
		this.fechaActualizacion = fechaActualizacion;
		this.recetaFavoritas = recetaFavoritas;
		this.ingredienteRecetas = ingredienteRecetas;
	}

	public RecetaId getId() {
		return this.id;
	}

	public void setId(RecetaId id) {
		this.id = id;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public TipoComida getTipoComida() {
		return this.tipoComida;
	}

	public void setTipoComida(TipoComida tipoComida) {
		this.tipoComida = tipoComida;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProcedimiento() {
		return this.procedimiento;
	}

	public void setProcedimiento(String procedimiento) {
		this.procedimiento = procedimiento;
	}

	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getPublico() {
		return this.publico;
	}

	public void setPublico(int publico) {
		this.publico = publico;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaActualizacion() {
		return this.fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public Set<RecetaFavorita> getRecetaFavoritas() {
		return this.recetaFavoritas;
	}

	public void setRecetaFavoritas(Set<RecetaFavorita> recetaFavoritas) {
		this.recetaFavoritas = recetaFavoritas;
	}

	public Set<IngredienteReceta> getIngredienteRecetas() {
		return this.ingredienteRecetas;
	}

	public void setIngredienteRecetas(Set<IngredienteReceta> ingredienteRecetas) {
		this.ingredienteRecetas = ingredienteRecetas;
	}

}
