package org.launchcode;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class Controller {

    @FXML
    private Label lbl_status;

    @FXML
    private TextField txtFirstPerson;

    @FXML
    private TextField txtSecondPerson;

    public void user(ActionEvent event) throws Exception {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("makeRelationship.fxml"));
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public void friends(ActionEvent event) throws Exception {
        if (txtFirstPerson.getText().equals("user") && txtSecondPerson.getText().equals("pass")) {
            lbl_status.setText("Login Success");
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        } else {
            lbl_status.setText("Login Failed");
        }
    }


    public void loginButtonClicked(ActionEvent actionEvent) {
    }

    public void menu(ActionEvent event) {

    }
}

