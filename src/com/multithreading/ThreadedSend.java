package com.multithreading;

import java.io.*; 
import java.util.*; 

public class ThreadedSend extends Thread{
	private String msg; 
    private Thread t; 
    Sender  sender; 
    ThreadedSend(String m,  Sender obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) 
        { 
            sender.send(msg); 
        } 
    } 


}
