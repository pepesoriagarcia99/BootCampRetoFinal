package org.springframework.samples.petclinic.rest;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.samples.petclinic.model.Oferta;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ofertas")
public class OfertaController {
	
	@Autowired
	private ClinicService clinicService;
	
	@PreAuthorize( "hasRole(@roles.OFERTA_ADMIN)" )
	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<Oferta>> getAllOferta(){
		Collection<Oferta> ofertas = new ArrayList<Oferta>();
		ofertas.addAll(this.clinicService.findAllOfertas());
		if (ofertas.isEmpty()){
			return new ResponseEntity<Collection<Oferta>>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Collection<Oferta>>(ofertas, HttpStatus.OK);
	}
	
	@PreAuthorize( "hasRole(@roles.OFERTA_ADMIN)" )
	@RequestMapping(value = "/{ofertaId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Oferta> getOferta(@PathVariable("ofertaId") Integer ofertaId){
		Oferta oferta = this.clinicService.findOfertaById(ofertaId);
		if(oferta == null){
			return new ResponseEntity<Oferta>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Oferta>(oferta, HttpStatus.OK);
	}

}
