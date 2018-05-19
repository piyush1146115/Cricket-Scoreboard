package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainController3 implements Initializable {	
	final static MyNumber run = new MyNumber();
	final MyInt ball = new MyInt();
	final MyInt extra = new MyInt();
	final MyInt wicket = new MyInt();

	@FXML
	private Label lblRn;
	@FXML
	private Label lblPS;
	@FXML
	private Label lblRR;
	@FXML
	private Label lblov;
	@FXML
	private Label lblBl;
	@FXML
	private Label lblEx;
	@FXML
	private Label lblWC;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		run.setNumber(0.0);
		ball.setNumber(0);
		extra.setNumber(0);
		wicket.setNumber(0);
		
		run.numberProperty().addListener(new ChangeListener<Object>() {
			@Override
			public void changed(ObservableValue<? extends Object> obsevable, Object oldValue, Object newValue) {
				// TODO Auto-generated method stub
				lblRn.setText(new Integer((int) run.getNumber()).toString());
				lblRR.setText(new Double((run.getNumber() / (double) ball.getNumber()) * 6.0).toString());
				lblPS.setText(new Integer((int) ((run.getNumber() / (double) ball.getNumber()) *(double) (MainController2.over * 6.0))).toString());
				// PB.progressProperty().bind(myNum.numberProperty());
				// PI.progressProperty().bind(myNum.numberProperty());
			}

		});

		wicket.numberProperty().addListener(new ChangeListener<Object>() {
			@Override
			public void changed(ObservableValue<? extends Object> obsevable, Object oldValue, Object newValue) {
				// TODO Auto-generated method stub
				lblWC.setText(new Integer(wicket.getNumber()).toString());
			}
		});

		extra.numberProperty().addListener(new ChangeListener<Object>() {
			@Override
			public void changed(ObservableValue<? extends Object> obsevable, Object oldValue, Object newValue) {
				// TODO Auto-generated method stub
				lblEx.setText(new Integer(extra.getNumber()).toString());
			}
		});

		ball.numberProperty().addListener(new ChangeListener<Object>() {
			@Override
			public void changed(ObservableValue<? extends Object> obsevable, Object oldValue, Object newValue) {
				// TODO Auto-generated method stub
				lblBl.setText(new Integer(ball.getNumber()% 6).toString());
				lblov.setText(new Integer(ball.getNumber()/6).toString());
				lblRR.setText(new Double((run.getNumber()/(double) ball.getNumber()) * 6.0).toString());
				lblPS.setText(new Integer((int) ((run.getNumber() / (double) ball.getNumber()) *(double) (MainController2.over * 6.0))).toString());
			}
		});
	}
	
	

	// Run
	public void BtnClickRun1(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run.setNumber(run.getNumber() + 1.0);
		}
	}

	public void BtnClickRun2(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run.setNumber(run.getNumber() + 2.0);
		}
	}

	public void BtnClickRun3(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run.setNumber(run.getNumber() + 3.0);
		}
	}

	public void BtnClickRun4(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run.setNumber(run.getNumber() + 4.0);
		}
	}

	public void BtnClickRun6(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run.setNumber(run.getNumber() + 6.0);
		}
	}

	// Extras
	public void BtnClickRun1B(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run.setNumber(run.getNumber() + 1.0);
		extra.setNumber(extra.getNumber() + 1);
		}
	}

	public void BtnClickRun2B(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run.setNumber(run.getNumber() + 2.0);
		extra.setNumber(extra.getNumber() + 2);
		}
	}

	public void BtnClickRun3B(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run.setNumber(run.getNumber() + 3.0);
		extra.setNumber(extra.getNumber() + 4);
		}
	}

	public void BtnClickRun4B(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run.setNumber(run.getNumber() + 4.0);
		extra.setNumber(extra.getNumber() + 4);
		}
	}

	public void BtnClickRunNB(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run.setNumber(run.getNumber() + 1.0);
		extra.setNumber(extra.getNumber() + 1);
		}
	}

	public void BtnClickRunWD(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run.setNumber(run.getNumber() + 1.0);
		extra.setNumber(extra.getNumber() + 1);
		}
	}

	public void BtnClickBall(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		ball.setNumber(ball.getNumber() + 1);
		}
	}

	public void BtnClickWicket(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		wicket.setNumber(wicket.getNumber() + 1);
		}
		}
	
	public void closeApp(ActionEvent event) {
		Platform.exit();
		System.exit(0);
	}
	
	public void SecondInings(ActionEvent event) throws Exception {
		if(wicket.getNumber() == 10 || ball.getNumber() == (MainController2.over * 6)) {
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/SecondInings.fxml"));
		Scene scene = new Scene(root, 400, 400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		}

	}

}
