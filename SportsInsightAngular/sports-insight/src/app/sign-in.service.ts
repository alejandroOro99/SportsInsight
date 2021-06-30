import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SignInService {

  private signInUrl = 'http://localhost:8080/';
  constructor(private httpClient: HttpClient) { }

  public signIn(): Observable<string> {
    return this.httpClient.get<string>(this.signInUrl);
  }
}
