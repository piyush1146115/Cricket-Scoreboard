package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController implements Initializable {
	@FXML
	private Label lblStatus;

	@FXML
	private TextField txtUserName;

	@FXML
	private TextField txtPassword;

	// "select count(*) from logintable where user= txtUserName.getText() and pass =
	// txtPassword.getText()"
	public void Login(ActionEvent event) throws Exception {
		String user = txtUserName.getText();
		String pass = txtPassword.getText();
	if ((Main.tmp.queryForObject("select count(*) from logintable where User='" + user + "' and Pass='" + pass + "'",
				Integer.class)) > 0) {
			lblStatus.setText("Log In Successful");
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Format.fxml"));
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} else {
			lblStatus.setText("Log In Failed");
		}
	}

	public void SignUp(ActionEvent event) throws Exception {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/SignUp.fxml"));
		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		// ObservableList<String> list = FXCollections.observableArrayList("Mark",
		// "Tom", "John", "Jack");
	}

}
