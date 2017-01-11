package sv.com.model;
// Generated 11-ene-2017 9:17:44 by Hibernate Tools 4.3.1.Final

import java.util.Date;

/**
 * IngredienteReceta generated by hbm2java
 */
public class IngredienteReceta implements java.io.Serializable {

	private IngredienteRecetaId id;
	private Ingrediente ingrediente;
	private Receta receta;
	private TipoMedida tipoMedida;
	private String cantidad;
	private Date fechaRegistro;
	private Date fechaActualizacion;

	public IngredienteReceta() {
	}

	public IngredienteReceta(IngredienteRecetaId id, Ingrediente ingrediente, Receta receta, TipoMedida tipoMedida) {
		this.id = id;
		this.ingrediente = ingrediente;
		this.receta = receta;
		this.tipoMedida = tipoMedida;
	}

	public IngredienteReceta(IngredienteRecetaId id, Ingrediente ingrediente, Receta receta, TipoMedida tipoMedida,
			String cantidad, Date fechaRegistro, Date fechaActualizacion) {
		this.id = id;
		this.ingrediente = ingrediente;
		this.receta = receta;
		this.tipoMedida = tipoMedida;
		this.cantidad = cantidad;
		this.fechaRegistro = fechaRegistro;
		this.fechaActualizacion = fechaActualizacion;
	}

	public IngredienteRecetaId getId() {
		return this.id;
	}

	public void setId(IngredienteRecetaId id) {
		this.id = id;
	}

	public Ingrediente getIngrediente() {
		return this.ingrediente;
	}

	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}

	public Receta getReceta() {
		return this.receta;
	}

	public void setReceta(Receta receta) {
		this.receta = receta;
	}

	public TipoMedida getTipoMedida() {
		return this.tipoMedida;
	}

	public void setTipoMedida(TipoMedida tipoMedida) {
		this.tipoMedida = tipoMedida;
	}

	public String getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
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

}