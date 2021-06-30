import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { SignInService } from '../sign-in.service';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {

  constructor(private httpClient: HttpClient, private signInService: SignInService) { }

  private hello = "";

  ngOnInit(): void {
    this.signInService.signIn().subscribe(res => {
      console.log(res);
      this.hello = res;
    });
  }

  public connect(): void {

    console.log(this.hello);
  }
}


