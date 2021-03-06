package sv.com.model;
// Generated 11-ene-2017 9:17:44 by Hibernate Tools 4.3.1.Final

/**
 * IngredienteRecetaId generated by hbm2java
 */
public class IngredienteRecetaId implements java.io.Serializable {

	private int idIngredienteReceta;
	private int idIngrediente;
	private int idTipoMedida;
	private int idReceta;
	private int idCategoria;
	private int idUsuario;
	private int idTipoComida;

	public IngredienteRecetaId() {
	}

	public IngredienteRecetaId(int idIngredienteReceta, int idIngrediente, int idTipoMedida, int idReceta,
			int idCategoria, int idUsuario, int idTipoComida) {
		this.idIngredienteReceta = idIngredienteReceta;
		this.idIngrediente = idIngrediente;
		this.idTipoMedida = idTipoMedida;
		this.idReceta = idReceta;
		this.idCategoria = idCategoria;
		this.idUsuario = idUsuario;
		this.idTipoComida = idTipoComida;
	}

	public int getIdIngredienteReceta() {
		return this.idIngredienteReceta;
	}

	public void setIdIngredienteReceta(int idIngredienteReceta) {
		this.idIngredienteReceta = idIngredienteReceta;
	}

	public int getIdIngrediente() {
		return this.idIngrediente;
	}

	public void setIdIngrediente(int idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public int getIdTipoMedida() {
		return this.idTipoMedida;
	}

	public void setIdTipoMedida(int idTipoMedida) {
		this.idTipoMedida = idTipoMedida;
	}

	public int getIdReceta() {
		return this.idReceta;
	}

	public void setIdReceta(int idReceta) {
		this.idReceta = idReceta;
	}

	public int getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdTipoComida() {
		return this.idTipoComida;
	}

	public void setIdTipoComida(int idTipoComida) {
		this.idTipoComida = idTipoComida;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof IngredienteRecetaId))
			return false;
		IngredienteRecetaId castOther = (IngredienteRecetaId) other;

		return (this.getIdIngredienteReceta() == castOther.getIdIngredienteReceta())
				&& (this.getIdIngrediente() == castOther.getIdIngrediente())
				&& (this.getIdTipoMedida() == castOther.getIdTipoMedida())
				&& (this.getIdReceta() == castOther.getIdReceta())
				&& (this.getIdCategoria() == castOther.getIdCategoria())
				&& (this.getIdUsuario() == castOther.getIdUsuario())
				&& (this.getIdTipoComida() == castOther.getIdTipoComida());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdIngredienteReceta();
		result = 37 * result + this.getIdIngrediente();
		result = 37 * result + this.getIdTipoMedida();
		result = 37 * result + this.getIdReceta();
		result = 37 * result + this.getIdCategoria();
		result = 37 * result + this.getIdUsuario();
		result = 37 * result + this.getIdTipoComida();
		return result;
	}

}
