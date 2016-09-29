package controller;

import fxapp.MainFXApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Created by simkieu on 9/29/16.
 */
public class MainAppPageController {

    @FXML
    private Label loggedUser;

    private MainFXApplication mainApplication;

    public void setMainApp(MainFXApplication main) {
        mainApplication = main;
        loggedUser.setText("user");
    }

    @FXML
    public void LogoutPressed() {
        mainApplication.showWelcomePage();
    }
}
