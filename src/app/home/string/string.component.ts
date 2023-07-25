import { Component } from '@angular/core';

@Component({
  selector: 'app-string',
  templateUrl: './string.component.html',
  styleUrls: ['./string.component.css']
})
export class StringComponent {

  value: string;
  result: string;

  constructor(){
    
  }

  reverse(){
    console.log(this.value);
    this.result = 'hsihsA'
  }

}
