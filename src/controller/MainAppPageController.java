package controller;

import fxapp.MainFXApplication;
import javafx.fxml.FXML;

/**
 * Created by simkieu on 9/29/16.
 */
public class MainAppPageController {

    private MainFXApplication mainApplication;

    public void setMainApp(MainFXApplication main) {
        mainApplication = main;
    }

    @FXML
    public void LogoutPressed() {
        mainApplication.showWelcomePage();
    }
}
