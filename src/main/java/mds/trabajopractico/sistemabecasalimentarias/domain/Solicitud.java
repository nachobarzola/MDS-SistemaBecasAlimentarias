package mds.trabajopractico.sistemabecasalimentarias.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(uniqueConstraints = 
{@UniqueConstraint(columnNames={"ID_SOLICITUD"})})
public class Solicitud {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //valor autonumerico
	@Column(name="ID_SOLICITUD")
	private Integer id;
	private Date fecha;
	
	@OneToOne
	@JoinColumn(name="ID_BECAAPROBADA")
	private BecaAprobada becaAprobada;
	

	@ManyToOne
	@JoinColumn(name="ID_ALUMNO")
	private Alumno alumnoSolicitante;
	
	private ClasificacionSolicitud clasificacionSolicitud;
	
	
	public Solicitud(Integer id, Date fecha, BecaAprobada becaAprobada, Alumno alumnoSolicitante,
			ClasificacionSolicitud clasificacionSolicitud) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.becaAprobada = becaAprobada;
		this.alumnoSolicitante = alumnoSolicitante;
		this.clasificacionSolicitud = clasificacionSolicitud;
	}


	public Solicitud() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public BecaAprobada getBecaAprobada() {
		return becaAprobada;
	}


	public void setBecaAprobada(BecaAprobada becaAprobada) {
		this.becaAprobada = becaAprobada;
	}


	public Alumno getAlumnoSolicitante() {
		return alumnoSolicitante;
	}


	public void setAlumnoSolicitante(Alumno alumnoSolicitante) {
		this.alumnoSolicitante = alumnoSolicitante;
	}


	public ClasificacionSolicitud getClasificacionSolicitud() {
		return clasificacionSolicitud;
	}


	public void setClasificacionSolicitud(ClasificacionSolicitud clasificacionSolicitud) {
		this.clasificacionSolicitud = clasificacionSolicitud;
	}


	@Override
	public String toString() {
		return "Solicitud [id=" + id + ", fecha=" + fecha + ", becaAprobada=" + becaAprobada + ", alumnoSolicitante="
				+ alumnoSolicitante + ", clasificacionSolicitud=" + clasificacionSolicitud + "]";
	}
	
	
}