package sv.com.model;
// Generated 11-ene-2017 9:17:44 by Hibernate Tools 4.3.1.Final

/**
 * Parametro generated by hbm2java
 */
public class Parametro implements java.io.Serializable {

	private int idParametro;
	private String nombre;
	private String valor;
	private String activo;

	public Parametro() {
	}

	public Parametro(int idParametro) {
		this.idParametro = idParametro;
	}

	public Parametro(int idParametro, String nombre, String valor, String activo) {
		this.idParametro = idParametro;
		this.nombre = nombre;
		this.valor = valor;
		this.activo = activo;
	}

	public int getIdParametro() {
		return this.idParametro;
	}

	public void setIdParametro(int idParametro) {
		this.idParametro = idParametro;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

}
