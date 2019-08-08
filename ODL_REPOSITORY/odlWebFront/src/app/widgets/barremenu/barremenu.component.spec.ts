import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BarremenuComponent } from './barremenu.component';

describe('BarremenuComponent', () => {
  let component: BarremenuComponent;
  let fixture: ComponentFixture<BarremenuComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BarremenuComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BarremenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
