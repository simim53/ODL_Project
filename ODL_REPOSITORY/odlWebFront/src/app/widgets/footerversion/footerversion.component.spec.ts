import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FooterversionComponent } from './footerversion.component';

describe('FooterversionComponent', () => {
  let component: FooterversionComponent;
  let fixture: ComponentFixture<FooterversionComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FooterversionComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FooterversionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
