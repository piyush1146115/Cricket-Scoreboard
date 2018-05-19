package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainControllerSignUp implements Initializable {

	@FXML
	private Label ReglblStatus;

	@FXML
	private TextField RegTxtName;
	@FXML
	private TextField RegTxtUserName;

	@FXML
	private TextField RegTxtPass;

	@FXML
	private TextField RegTxtConPass;

	public void confirm(ActionEvent event) throws Exception {
		if (RegTxtPass.getText().equals(RegTxtConPass.getText())) {
			ReglblStatus.setText("Sign Up Succesful!!");
			
			String updateQuery = "insert into logintable values(?,?,?)";
			
			
			Main.tmp.update(updateQuery, new Object[] {RegTxtName.getText(),RegTxtUserName.getText(),RegTxtPass.getText()});
			//ReglblStatus.setText("Register!");
		
		} else {
			ReglblStatus.setText("Passwords Did Not Match!. Try Again");
			//ReglblStatus.setText("Register!");
		}
	}
	
	public void back(ActionEvent event) throws Exception {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
