/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13.classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication13.register;

/**
 *
 * @author Hp
 */
public class system_file extends person {
    public boolean check(){
      if (Fname== null || Lname==null || email==null || phone==null || username==null ||password==null ){
          return false;
          
      }else {
          return true ;
      }
      
  } 
  public void add_person_file (){
     FileWriter fw = null;
     FileWriter fm= null;
        try {
            fm= new FileWriter("D://username_password_member.txt",true);
            
            fw = new FileWriter("D://file_member_all.txt", true);
        } catch (IOException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }       
BufferedWriter bw = new BufferedWriter(fw);
        try (PrintWriter out = new PrintWriter(bw)) {
                out.println("\n");
            out.print("\t");  
            out.print(Fname);
            out.print("\t\t");
            out.print(Lname);
            out.print("\t\t");
            out.print(username);
            out.print("\t\t");
            out.print(email);
            out.print("\t\t");
            out.print(getpass());
            out.print("\t\t");
            out.print(phone);
            out.print("\t\t");
            out.print(age);
            out.print ("\n");
            out.close();
           
        
        
     
    }
  try (PrintWriter outt = new PrintWriter (fm)){
            outt.print("\n");
            outt.print(username);
            outt.print(" ");
            outt.print(getpass());
            outt.print("\n");
  }
  }
      
      
     
public boolean sep (String line, String x , String y){
    String name=null;
    String pass = null;
    int c=0;
        char f = ' ';
   String word = "";
   for ( int i=0;i<line.length();i++){
       if (line.charAt(i)!= f){
           word+= line.charAt(i);
       }
       else{
           
       
        if(c==0){
           name=word;
           word=new String();
       c++;
       
 
   }}}
        if (c==1){
           pass=word;
        }    
       
                  System.out.println(name);
                System.out.println(pass);
                  System.out.println(x);
                System.out.println(y);

   if (name.equals(x) && pass.equals(y)){
       return true;
   }
   else return false;
}}
    

                
           
    
    








