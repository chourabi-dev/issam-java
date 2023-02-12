import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-books',
  templateUrl: './books.component.html',
  styleUrls: ['./books.component.css']
})
export class BooksComponent implements OnInit {
  books:any[] = [];



  constructor(private api:ApiService) { }

  ngOnInit(): void {
    this.getData();
  }


  getData(){
    // this.api.getListBooks().subscribe() // stream, chat , many data in the futre !!! 

    this.api.getListBooks().toPromise().then((res:any[])=>{
        console.log(res);

        this.books = res;
        
    }).catch((err)=>{});
  }

}
