/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package coitt11134.staffphonebook;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author mangu
 */
public class MainSceneController implements Initializable {

    @FXML
    private TextArea txtOutput;
    @FXML
    private Button btnDisplay;
    @FXML
    private Button btnExit;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnClear;
    @FXML
    private Button btnSave;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void displayAction(ActionEvent event) throws FileNotFoundException {
        
        System.out.println("You clicked on disply");
        txtOutput.setText(App.getDataHandler().getDisplayOutput());
    }

    @FXML
    private void exitAction(ActionEvent event) {
        //the program waits for user confirmation after the exit button is pressed
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to Close?");
        alert.showAndWait().ifPresent(response -> {
            if (response == ButtonType.OK) {
                Platform.exit();
            }
        });

    }

    
    @FXML
    private void addAction(ActionEvent event) {
        System.out.println("You clicked on Add!");
        //Switch to the AddNumber scene
        App.changeScene(1);

    }

    @FXML
    private void clearAction(ActionEvent event) {
        System.out.println("You clicked on Clear!");
        // Clears the text area
        txtOutput.setText("");
    }

    @FXML
    private void saveAction(ActionEvent event) {
        
        //All data saved to the text file
        App.getDataHandler().saveData();
        System.out.println("The record was saved.");

    }

}
