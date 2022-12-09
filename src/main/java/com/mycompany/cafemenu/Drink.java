/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafemenu;

import javafx.scene.control.Label;


public class Drink {
     protected double total;  
     Label Label_Total;
       
     //total set method
        public void setTotal() {
         Label_Total.setText("Total: " + total); 
     }
    
    //total get method
    public double getTotal(double total) {
        return total;      
    }
    
    //toString method
      @Override
      public String toString() {
           return "" + total;
           
       }
    
}
