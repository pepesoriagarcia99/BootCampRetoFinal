import { Injectable } from '@angular/core';
import { OfertaInterface } from './oferta.interface';
import {environment} from '../../../environments/environment';
import {HttpClient} from '@angular/common/http';

import { Observable } from 'rxjs';
import { OfertaDto } from './oferta.dto';

const Url = environment.REST_API_URL;

@Injectable({
  providedIn: 'root'
})
export class OfertaService {

  constructor(
    private http: HttpClient
  ) { }

  getAll(): Observable<OfertaInterface>{
    return this.http.get<OfertaInterface>(`${Url}/ofertas`);
  }
  getOne(){

  }
  create(oferta: OfertaDto): Observable<OfertaInterface>{
    return this.http.post<OfertaInterface>(`${Url}/ofertas`, oferta);
  }
  delete(id: Number){
    return this.http.delete<OfertaInterface>(`${Url}/ofertas/${id}`);
  }
  edit(oferta: OfertaDto, id: Number){
    return this.http.put<OfertaInterface>(`${Url}/ofertas/${id}`, oferta);
  }
}
