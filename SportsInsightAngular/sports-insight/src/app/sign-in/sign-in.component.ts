import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {

  constructor() { }

  private hello = 10;

  ngOnInit(): void {
    if (this.hello === 10) {
      console.log("nice");
    } else {
      console.log("not nice");
    }
  }

}
