export class OfertaDto {
    //id: Number;
    titulo: string;
    descripcion: string;
    descuento: Number;
    fechaExpiracion: Date;

    constructor(titulo: string, descripcion: string, descuento: Number, fechaExpiracion: Date) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.descuento = descuento;
        this.fechaExpiracion = fechaExpiracion;
    }
}
