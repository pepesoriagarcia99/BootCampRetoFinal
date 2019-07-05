import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { OfertaService } from '../service/oferta.service';

@Component({
  selector: 'app-edit-oferta',
  templateUrl: './edit-oferta.component.html',
  styleUrls: ['./edit-oferta.component.css']
})
export class EditOfertaComponent implements OnInit {

  oferta;
  errorMessage: string;
  ofertaCogida;

  private titulo:string;
  private descripcion:string;
  private descuento:number;
  private fechaExpiracion:Date;
  private id:number;

  constructor( private ofertaService:OfertaService,private router: Router) { }

  ngOnInit() {
    this.ofertaService.getOne(this.id).subscribe(result=>{
      this.ofertaCogida=result;
    })
  }

  onSubmit(oferta) {
    oferta+=this.ofertaCogida.id;
    this.ofertaService.create(oferta).subscribe(
      data => {
        this.oferta = data;
      },
      error => this.errorMessage = <any>error
    );
  }
}
