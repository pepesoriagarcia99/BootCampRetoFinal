package org.springframework.samples.petclinic.repository;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.samples.petclinic.model.Oferta;
import org.springframework.stereotype.Repository;

@Repository
public interface OfertaRespository extends JpaRepository<Oferta, Integer>{
	
	@Query("select o from Oferta o where o.fechaExpiracion > ?1")
	Collection<Oferta> findByfechaExpiracion(Date fechaActual);

}
