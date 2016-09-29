package controller;

import fxapp.MainFXApplication;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class WelcomePageController {

    private MainFXApplication mainApplication;

    public void setMainApp(MainFXApplication main) {
        mainApplication = main;
    }

    @FXML
    public void LoginPressed() {
        mainApplication.showLoginPage();
    }

    @FXML
    public void RegisterPressed() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.initOwner(mainApplication.getMainScreen());
        alert.setTitle("Unimplemented");
        alert.setHeaderText("Unimplemented Feature");
        alert.setContentText("Sorry, Register is not yet implemented!");

        alert.showAndWait();
    }
}
