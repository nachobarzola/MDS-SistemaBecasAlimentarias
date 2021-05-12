package mds.trabajopractico.sistemabecasalimentarias.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = 
{@UniqueConstraint(columnNames={"ID_ESCUELA"})})
public class Escuela {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //valor autonumerico
	@Column(name="ID_ESCUELA")
	private Integer id;
	private String codigoUnicoEstablecimiento;
	private String clave;
	
	@OneToMany(mappedBy = "escuela")
	private List<Alumno> listaAlumnos;
	
	
	public Escuela(String codigoUnicoEstablecimiento, String clave,Integer idEsc) {
		super();
		this.codigoUnicoEstablecimiento = codigoUnicoEstablecimiento;
		this.clave = clave;
		this.id=idEsc;
		this.listaAlumnos = new ArrayList<>();
	}
	public Escuela() {}
	
	public String getCodigoUnicoEstablecimiento() {
		return codigoUnicoEstablecimiento;
	}
	public void setCodigoUnicoEstablecimiento(String codigoUnicoEstablecimiento) {
		this.codigoUnicoEstablecimiento = codigoUnicoEstablecimiento;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}
	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	public void addAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos.addAll(listaAlumnos);
	}
	@Override
	public String toString() {
		return "Escuela [id=" + id + ", codigoUnicoEstablecimiento=" + codigoUnicoEstablecimiento + ", clave=" + clave
				+ ", listaAlumnos=" + listaAlumnos + "]";
	}
	
	
	

}