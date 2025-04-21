import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DecoCardComponent } from './deco-card.component';

describe('DecoCardComponent', () => {
  let component: DecoCardComponent;
  let fixture: ComponentFixture<DecoCardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DecoCardComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DecoCardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
