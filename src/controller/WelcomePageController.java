package controller;

import fxapp.MainFXApplication;

import javafx.fxml.FXML;

public class WelcomePageController {

    private MainFXApplication mainApplication;

    public void setMainApp(MainFXApplication main) {
        mainApplication = main;
    }

    @FXML
    public void LoginPressed() {
        mainApplication.showLoginPage();
    }
}
