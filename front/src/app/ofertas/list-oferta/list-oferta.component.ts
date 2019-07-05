import { OfertaService } from './../service/oferta.service';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-oferta',
  templateUrl: './list-oferta.component.html',
  styleUrls: ['./list-oferta.component.css']
})
export class ListOfertaComponent implements OnInit {
  ofertas;
  errorMessage: string;

  constructor(
    private router: Router,
    private ofertaService: OfertaService) { }

  ngOnInit() {
  }
  selectOfertasAll() {
    this.ofertaService.getOfertas().subscribe(
      result => this.ofertas = result,
      error => this.errorMessage = <any> error);
  }
}
//this.router.navigate(['/ofertasAll']);
