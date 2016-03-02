package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the resultado database table.
 * 
 */
@Entity
@NamedQuery(name="Resultado.findAll", query="SELECT r FROM Resultado r")
public class Resultado implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Column(name="id_resultado")
	private Integer idResultado;

	@Id
	private Integer cedulae;

	private String resultado;

	//bi-directional many-to-one association to Estudiante
	@ManyToOne
	@JoinColumn(name="id_estudiante")
	private Estudiante estudiante;

	public Resultado() {
	}

	public Integer getIdResultado() {
		return this.idResultado;
	}

	public void setIdResultado(Integer idResultado) {
		this.idResultado = idResultado;
	}

	public Integer getCedulae() {
		return this.cedulae;
	}

	public void setCedulae(Integer cedulae) {
		this.cedulae = cedulae;
	}

	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public Estudiante getEstudiante() {
		return this.estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

}