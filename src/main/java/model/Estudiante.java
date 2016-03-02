package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the estudiante database table.
 * 
 */
@Entity
@NamedQuery(name="Estudiante.findAll", query="SELECT e FROM Estudiante e")
public class Estudiante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_estudiante")
	private Integer idEstudiante;

	private String apellidos;

	private Integer documento;

	private Integer edad;

	private Boolean estado;

	private String genero;

	private String nombres;

	private String programa;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumn(name="id_ciudad")
	private Ciudad ciudad;

	//bi-directional many-to-one association to Sede
	@ManyToOne
	@JoinColumn(name="id_sede")
	private Sede sede;

	//bi-directional many-to-one association to Log
	@OneToMany(mappedBy="estudiante")
	private List<Log> logs;

	//bi-directional many-to-one association to Resultado
	@OneToMany(mappedBy="estudiante")
	private List<Resultado> resultados;

	public Estudiante() {
	}

	public Integer getIdEstudiante() {
		return this.idEstudiante;
	}

	public void setIdEstudiante(Integer idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getDocumento() {
		return this.documento;
	}

	public void setDocumento(Integer documento) {
		this.documento = documento;
	}

	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Boolean getEstado() {
		return this.estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPrograma() {
		return this.programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Sede getSede() {
		return this.sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public List<Log> getLogs() {
		return this.logs;
	}

	public void setLogs(List<Log> logs) {
		this.logs = logs;
	}

	public Log addLog(Log log) {
		getLogs().add(log);
		log.setEstudiante(this);

		return log;
	}

	public Log removeLog(Log log) {
		getLogs().remove(log);
		log.setEstudiante(null);

		return log;
	}

	public List<Resultado> getResultados() {
		return this.resultados;
	}

	public void setResultados(List<Resultado> resultados) {
		this.resultados = resultados;
	}

	public Resultado addResultado(Resultado resultado) {
		getResultados().add(resultado);
		resultado.setEstudiante(this);

		return resultado;
	}

	public Resultado removeResultado(Resultado resultado) {
		getResultados().remove(resultado);
		resultado.setEstudiante(null);

		return resultado;
	}

}