/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package coitt11134.cqusaleproj;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author mangu
 */
public class DailySaleController implements Initializable {

    @FXML
    private Button btnCalculate;
    @FXML
    private TextField txtPurchase;
    @FXML
    private TextField txtSale;
    @FXML
    private Label lblDisplay;
    @FXML
    private Button btnExit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void calculateButtonAction(ActionEvent event) {
        double costPrice = Double.parseDouble(this.txtPurchase.getText()); 
        double soldPrice = Double.parseDouble(this.txtSale.getText()); 
        double profitPercent = (soldPrice - costPrice)/costPrice *100; 
        this.lblDisplay.setText("Profit is " +profitPercent +"%");   
    }

    @FXML
    private void exitButtonAction(ActionEvent event) {
      Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to Close?");
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                Platform.exit();
            }
        });
  
    }
    
}
