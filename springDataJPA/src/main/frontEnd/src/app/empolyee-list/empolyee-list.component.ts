import { Component, OnInit } from '@angular/core';
import { EmpolyeeServiceService } from '../empolyee-service.service';
import { IEmpolyee} from '../empolyee';

@Component({
  selector: 'app-empolyee-list',
  templateUrl: './empolyee-list.component.html',
  styleUrls: ['./empolyee-list.component.css']
})
export class EmpolyeeListComponent implements OnInit {

  public empolyee:IEmpolyee;
  public errorMessage;
  constructor(private _empolyeeService:EmpolyeeServiceService) { }

  ngOnInit() {
  this._empolyeeService.getEmpolyeeDetailById(123).subscribe(data => {
  console.log("data ", data);
  this.empolyee = data},
     error => this.errorMessage = error);
  }

}
