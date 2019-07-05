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
    this.getAll();
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
  delete(o: OfertaInterface){
    this.ofertaService.delete(o.id).subscribe(
      data => {
        //console.log(data)
        this.getAll();
      },
      error => {
        console.error("error al borrar")
      }
    );
  }
}
