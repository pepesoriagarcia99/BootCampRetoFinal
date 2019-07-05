import { OfertaService } from './../service/oferta.service';
import { Component, OnInit } from '@angular/core';
import { OfertaInterface } from '../service/oferta.interface';

@Component({
  selector: 'app-list-oferta',
  templateUrl: './list-oferta.component.html',
  styleUrls: ['./list-oferta.component.css']
})
export class ListOfertaComponent implements OnInit {
  private ofertas: OfertaInterface;

  constructor(
    private ofertaService: OfertaService
  ) { }

  ngOnInit() {
  }
  getAll() {
    this.ofertaService.getAll().subscribe(
      data => {
        this.ofertas = data;
        console.log(this.ofertas);
      },
      error => {
        console.error("error list all")
      }
    );
  }
}
