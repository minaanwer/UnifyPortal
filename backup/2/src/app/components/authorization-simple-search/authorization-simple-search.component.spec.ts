import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AuthorizationSimpleSearchComponent } from './authorization-simple-search.component';

describe('AuthorizationSimpleSearchComponent', () => {
  let component: AuthorizationSimpleSearchComponent;
  let fixture: ComponentFixture<AuthorizationSimpleSearchComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AuthorizationSimpleSearchComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AuthorizationSimpleSearchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
