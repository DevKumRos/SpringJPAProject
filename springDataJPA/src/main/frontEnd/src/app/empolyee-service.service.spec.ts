import { TestBed } from '@angular/core/testing';

import { EmpolyeeServiceService } from './empolyee-service.service';

describe('EmpolyeeServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EmpolyeeServiceService = TestBed.get(EmpolyeeServiceService);
    expect(service).toBeTruthy();
  });
});
