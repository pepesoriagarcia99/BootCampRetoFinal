package org.springframework.samples.petclinic.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.samples.petclinic.model.Oferta;
import org.springframework.stereotype.Repository;

@Repository
public interface OfertaRespository extends JpaRepository<Oferta, Integer>{
	

}
