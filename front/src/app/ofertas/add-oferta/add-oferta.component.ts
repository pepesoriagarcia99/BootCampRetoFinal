import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { OfertaService } from '../service/oferta.service';

@Component({
  selector: 'app-add-oferta',
  templateUrl: './add-oferta.component.html',
  styleUrls: ['./add-oferta.component.css']
})
export class AddOfertaComponent implements OnInit {

  oferta;
  errorMessage: string;

  private titulo:string;
  private descripcion:string;
  //private 

  constructor( private ofertaService:OfertaService,private router: Router) { }

  ngOnInit() {
  }

  onSubmit(oferta) {
    
    /*this.ofertaService.create(oferta).subscribe(
      new_oferta => {
        this.oferta = new_oferta;
        //this.();
      },
      error => this.errorMessage = <any>error
    );*/
  }
}
