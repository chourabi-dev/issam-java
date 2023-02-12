import { Component, OnInit } from '@angular/core';
import { FormGroup,FormControl,Validators } from '@angular/forms';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent implements OnInit {

  form = new FormGroup({
    name: new FormControl("",Validators.required),
    category: new FormControl("",Validators.required),
    auth: new FormControl("",Validators.required),
    pages: new FormControl("",Validators.required)
  });



  constructor(private api:ApiService) { }

  ngOnInit(): void {
  }

  save(){
    const bookDto = this.form.value;

    this.api.createBook(bookDto).toPromise().then((res)=>{console.log(res);
    }).catch()
  }
}
