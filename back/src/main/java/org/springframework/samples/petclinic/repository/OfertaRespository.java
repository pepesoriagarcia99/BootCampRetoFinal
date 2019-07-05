package org.springframework.samples.petclinic.repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.samples.petclinic.model.Oferta;
import org.springframework.stereotype.Repository;

@Repository
public interface OfertaRespository extends JpaRepository<Oferta, Integer>{
	
	@Query("SELECT o FROM Oferta o WHERE o.fechaExpiracion > ?1")
	List<Oferta> findByfechaExpiracion(Date fechaActual);

}
