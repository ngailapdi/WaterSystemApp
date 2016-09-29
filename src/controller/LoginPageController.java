package controller;

import fxapp.MainFXApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * Created by simkieu on 9/29/16.
 */
public class LoginPageController {

    private MainFXApplication mainApplication;

    public void setMainApp(MainFXApplication main) {
        mainApplication = main;
    }

    @FXML
    public void LoginRequest() {
        if (isInputValid()) {
            mainApplication.showMainAppPage();
        }
    }

    @FXML
    public void CancelPressed() {
        mainApplication.showWelcomePage();
    }

    private boolean isInputValid() {
        return true;
    }
}
