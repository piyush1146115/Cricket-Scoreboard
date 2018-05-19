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

public class TeamRegistrationController implements Initializable {

	@FXML
	private Label lblTRStatus;
	
	@FXML
	private TextField txtTeamName;
	
	@FXML
	private TextField txtCoachName;
	
	@FXML
	private TextField txtPlayer1Name;

	@FXML
	private TextField txtPlayer2Name;

	@FXML
	private TextField txtPlayer3Name;

	@FXML
	private TextField txtPlayer4Name;

	@FXML
	private TextField txtPlayer5Name;

	@FXML
	private TextField txtPlayer6Name;

	@FXML
	private TextField txtPlayer7Name;

	@FXML
	private TextField txtPlayer8Name;

	@FXML
	private TextField txtPlayer9Name;

	@FXML
	private TextField txtPlayer10Name;

	@FXML
	private TextField txtPlayer11Name;

	
	//String result = Main.tmp.queryForObject("select name from demo where id = 1", String.class);

	
	public void Team_name(ActionEvent event)
	{
		String updateQuery = "insert into team_table(Batting_Status, Team_Name, Player1_Name,Player2_Name,Player3_Name,Player4_Name,Player5_Name, Player6_Name,"
				+ "Player7_Name,Player8_Name, Player9_Name,Player10_Name, Player11_Name, Coach_Name) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		Main.tmp.update(updateQuery, new Object[] {0,txtTeamName.getText(), txtPlayer1Name.getText(),txtPlayer2Name.getText(),
				txtPlayer3Name.getText(), txtPlayer4Name.getText(), txtPlayer5Name.getText(), txtPlayer6Name.getText()
				,txtPlayer7Name.getText(), txtPlayer8Name.getText(), txtPlayer9Name.getText(), txtPlayer10Name.getText()
				,txtPlayer11Name.getText(), txtCoachName.getText()});
	
		lblTRStatus.setText("Success");
	}
	

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
}
