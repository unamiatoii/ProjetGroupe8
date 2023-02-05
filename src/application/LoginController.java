package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private Label errorLabel;
    
    @FXML
    private Label connexion;
    
    @FXML
    private Button cancelButton;

    public void boutonConnexion(ActionEvent e) {
//    	appel de la vue du menu
    }
    public void boutonAnnule(ActionEvent e) {
    	Stage stage = (Stage) cancelButton.getScene().getWindow();
    	stage.close();
//    	Pour fermer la fenetre
    }

}