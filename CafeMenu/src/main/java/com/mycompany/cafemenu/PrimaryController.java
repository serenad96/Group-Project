package com.mycompany.cafemenu;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class PrimaryController {

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
    
    Label Label_Menu;
    Label Label_Size;
    Label Label_Temp;
    Label Label_Dairy;
    Label Label_Total;
    
    
    double total;
   
   public void sizeClicked() {
        if (Button_Small.isSelected()) {
            total +=2.50;
             setTotal();
        }
        else if(Button_Medium.isSelected()) {
            total += 3.00;
            setTotal();
        }
       else if(Button_Large.isSelected()) {
            total +=3.50;
            setTotal();
       }
       }
       
     public void TempCicked() {
         
        if(Button_Iced.isSelected()) {
            total += 0.50;
            setTotal();
        }
     }
     
     public void DairyClicked() {
         if (Button_Almond.isSelected()) {
             total+=0.50;
             setTotal();
         }
         if (Button_Coconut.isSelected()) {
             total+=0.75;
             setTotal();
         }
     }
     
     public void setTotal() {
         Label_Total.setText("Total: " + total); 
     }
     
     
 }
      
       
    
   
  
   
  


