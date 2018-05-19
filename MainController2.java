package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class MainController2 implements Initializable{

	
	public void Format(ActionEvent event) throws Exception {
		if(over != 0) {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		}
	}
	
	@FXML
	private ComboBox<Integer> combo;

	 ObservableList<Integer> list = FXCollections.observableArrayList(3, 5, 6, 8, 10, 12, 14, 16, 18 , 20, 25, 50 );
	public static Integer over;
	
	
	public void comboChanged(){
		// combo.setItems(list);
		over = combo.getValue();
		//over = getInt(name);
		// System.out.println(over);
		// over = (double)combo.getSelectionModel().getSelectedItem();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		combo.setItems(list);
		over = 0;
		
	}

}
