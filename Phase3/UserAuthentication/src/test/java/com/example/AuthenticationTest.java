package com.example;



import org.junit.Test;
import static org.junit.Assert.*;


public class AuthenticationTest {
  @Test
  public void testAuthenticationSuccess() {
      Authentication auth = new Authentication();
      assertTrue(auth.authenticate("admin", "password"));
  }


  @Test
  public void testAuthenticationFailure() {
      Authentication auth = new Authentication();
      assertFalse(auth.authenticate("user", "wrongpassword"));
  }
}
