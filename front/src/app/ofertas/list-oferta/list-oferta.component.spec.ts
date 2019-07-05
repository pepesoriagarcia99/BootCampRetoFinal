import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListOfertaComponent } from './list-oferta.component';

describe('ListOfertaComponent', () => {
  let component: ListOfertaComponent;
  let fixture: ComponentFixture<ListOfertaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListOfertaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListOfertaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
