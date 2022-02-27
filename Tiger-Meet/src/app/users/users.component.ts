import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { USERS } from '../userlist';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})

export class UsersComponent implements OnInit {

  users = USERS;
  selectedUser?: User;

  constructor() { }

  ngOnInit(): void {
  }

  onSelect(user: User): void {
    this.selectedUser = user;
  }
}