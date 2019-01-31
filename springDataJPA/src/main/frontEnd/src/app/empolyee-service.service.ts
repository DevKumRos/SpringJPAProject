import { Injectable } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import { IEmpolyee} from './empolyee';

@Injectable({
  providedIn: 'root'
})
export class EmpolyeeServiceService {

  constructor(private httpClient: HttpClient) { }
  
  getEmpolyeeDetailById(empId) : Observable<IEmpolyee> {
  	console.log("empId ", empId);
    return this.httpClient.get<IEmpolyee>("http://localhost:9081/api/getPersonById?personId=101").catch(this.errorHandler);
  }
  
  errorHandler(error: HttpErrorResponse) {
    console.log("Kumar - "+error.message);
    return Observable.throw(error.message || "Server Error");
  }
}
