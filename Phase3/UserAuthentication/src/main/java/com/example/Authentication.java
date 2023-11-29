package com.example;
//Authentication


public class Authentication {
  public boolean authenticate(String username, String password) {
      // Your authentication logic here
      return "admin".equals(username) && "password".equals(password);
  }
}
