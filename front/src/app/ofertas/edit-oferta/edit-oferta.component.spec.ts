import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditOfertaComponent } from './edit-oferta.component';

describe('AddOfertaComponent', () => {
  let component: EditOfertaComponent;
  let fixture: ComponentFixture<EditOfertaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditOfertaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditOfertaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
