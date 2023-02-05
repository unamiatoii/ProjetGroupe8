package application;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    
    @FXML
    private Button loginButton;

    public void boutonConnexion(ActionEvent e) throws IOException {
    	
//    	appel de la vue du menu
    	Parent pageParent = FXMLLoader.load(getClass().getResource("vueProduits.fxml"));
		Scene pageScene = new Scene(pageParent);
		Stage stage = (Stage) loginButton.getScene().getWindow();
		stage.setScene(pageScene);
		stage.show();
    	
    }
    public void boutonAnnule(ActionEvent e) {
    	Stage stage = (Stage) cancelButton.getScene().getWindow();
    	stage.close();
//    	Pour fermer la fenetre
    }

}