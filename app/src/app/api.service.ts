import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http:HttpClient) { }

  getListBooks(){ 

    return this.http.get("http://localhost:8080/api/v1/books/list");

  }




  createBook(book:any){ 

    return this.http.post("http://localhost:8080/api/v1/books/add",book);

  }

  





}
