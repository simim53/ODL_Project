import { Component, OnInit } from '@angular/core';
import { TestrestService } from '../../testrest.service';

@Component({
  selector: 'app-footerversion',
  templateUrl: './footerversion.component.html',
  styleUrls: ['./footerversion.component.css']
})
export class FooterversionComponent implements OnInit {
  private version: {};

  constructor(public restApi: TestrestService) { }

  ngOnInit() {
    this.getVersion();
  }

  getVersion() {
    return this.restApi.getVersion().subscribe((data: {message}) => {
      this.version = data.message;
    });
  }
}
