import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
  items: MenuItem[] = [];

  activeItem: any;

  ngOnInit() {
      this.items = [
          { label: 'Number', icon: 'pi pi-fw pi-home', routerLink: '/number' },
          { label: 'String', icon: 'pi pi-fw pi-calendar', routerLink: '/string' },
          { label: 'Array', icon: 'pi pi-fw pi-pencil', routerLink: '/array'},
          { label: 'Collections', icon: 'pi pi-fw pi-file', routerLink: '/collections' },
          { label: 'Summary', icon: 'pi pi-fw pi-cog', routerLink: '/summary' }
      ];

      this.activeItem = this.items[0];
  }

  activeMenu(event: MenuItem) {
    this.activeItem = event;
  }

}
