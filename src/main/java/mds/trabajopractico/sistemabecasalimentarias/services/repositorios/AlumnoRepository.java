package mds.trabajopractico.sistemabecasalimentarias.services.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mds.trabajopractico.sistemabecasalimentarias.domain.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{

}
