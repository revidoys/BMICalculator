/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class FXMLController implements Initializable {

    @FXML
    private TextField tinggiBadanTextField;
    @FXML
    private TextField beratBadanTextField;
    @FXML
    private TextField nilaiBodyMassIndexTextField;
    @FXML
    private TextField kondisiTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void hitungButtonPressed(ActionEvent event) {
       double tinggiBadan = Double.parseDouble(tinggiBadanTextField.getText());
       double beratBadan = Double.parseDouble(beratBadanTextField.getText());
       tinggiBadan = tinggiBadan / 100;
       
       double bmi = beratBadan / tinggiBadan * tinggiBadan;
       
       String kondisi;
       if (bmi < 18.5) {
            kondisi = "Underweight"; 
       }else if (bmi >= 18.5 && bmi < 25) {
            kondisi = "Normal";
       }else if (bmi >= 25 && bmi <= 29.9){
            kondisi = "Overweight";
       }else {
            kondisi = "Obese";
       }
    
       nilaiBodyMassIndexTextField.setText(Double.toString(bmi));
       kondisiTextField.setText(kondisi);
    }
    
}   
