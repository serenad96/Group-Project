package com.mycompany.cafemenu;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class PrimaryController extends Drink{

    @FXML
    RadioButton Button_Small;
    RadioButton Button_Medium;
    RadioButton Button_Large;
    RadioButton Button_Hot;
    RadioButton Button_Iced;
    RadioButton Button_Milk;
    RadioButton Button_None;
    RadioButton Button_Coconut;
    RadioButton Button_Almond;
    
    //Default constructor
  public PrimaryController() {
      this.total=0;
    }
  
  //Constructor with parameter
  public PrimaryController(double total) {
      this.total=total;
  }
  
 //Determines which size is clicked
   public void SizeClicked() {
   
        if (Button_Small.isSelected()) {
            total +=2.50;
             setTotal();
             getTotal(total);
        }
        else if(Button_Medium.isSelected()) {
            total += 3.00;
            setTotal();
            getTotal(total);
        }
       else if(Button_Large.isSelected()) {
            total +=3.50;
            setTotal();
            getTotal(total);
       }
       }
       
   //Checks Iced or Hot
     public void TempCicked() {
         
        if(Button_Iced.isSelected()) {
            total += 0.50;
            setTotal();
            getTotal(total);
        }
     }
     
     //Checks dairy clicked
     public void DairyClicked() {
         if (Button_Almond.isSelected()) {
             total+=0.50;
             setTotal();
             getTotal(total);
         }
         if (Button_Coconut.isSelected()) {
             total+=0.75;
             setTotal();
             getTotal(total);
         }
     }
  
     
 }
      
       
    
   
  
   
  


