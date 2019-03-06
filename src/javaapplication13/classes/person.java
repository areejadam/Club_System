/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13.classes;


import javaapplication13.error;

/**
 *
 * @author Hp
 */
public class person  {
    public int id ;
 public String Fname ;
 public String Lname ;
 public String username ;
 public String phone ;
 public String type;
 public String email;
 protected String password ;
 /* aggregiations */
  public table info ;
  public int age ;
 

   public void setpass ( String pass){
      if (pass.length()>5 ){
          password=pass;
      }else {  error frame5 = new error();
            frame5.setSize(550,210);
    frame5.setLocation(380, 250);
    frame5.show(true);
      
  }}
      public String getpass (){
       
       return password;
   }
 

 
 
 void person (){
 this.Fname=null;
this.Lname=null;
this.email=null;
this.username=null;
this.password=null;
this.type= null;
 this.info=null;
 
 }
 
  }
      
      

