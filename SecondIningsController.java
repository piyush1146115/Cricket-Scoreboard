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

public class SecondIningsController implements Initializable {
	final MyNumber run2 = new MyNumber();
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
	@FXML
	private Label lblStatus;
	@FXML
	private Label lblTarget;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		run2.setNumber(0.0);
		ball.setNumber(0);
		extra.setNumber(0);
		wicket.setNumber(0);
		
		lblTarget.setText(new Integer((int)(MainController3.run.getNumber() + 1.0)).toString());
		
		run2.numberProperty().addListener(new ChangeListener<Object>() {
			@Override
			public void changed(ObservableValue<? extends Object> obsevable, Object oldValue, Object newValue) {
				// TODO Auto-generated method stub
				lblRn.setText(new Integer((int) run2.getNumber()).toString());
				lblRR.setText(new Double((run2.getNumber() / (double) ball.getNumber()) * 6.0).toString());
			
				if(MainController3.run.getNumber() > run2.getNumber()) {
					lblStatus.setText("Need " + (new Integer((int)(MainController3.run.getNumber() - run2.getNumber() + 1.0)).toString()) + " More Runs From " + (new Integer((MainController2.over * 6) - ball.getNumber()).toString()) +  " Balls ");
					lblPS.setText(new Double( ((MainController3.run.getNumber() - run2.getNumber() + 1.0)/(double)( ((double)MainController2.over * 6.0) - ball.getNumber()))*6.0 ).toString());
				}
					else if((int)MainController3.run.getNumber() == ((int)run2.getNumber())) {
						lblStatus.setText("Scores Level");
					}
					else {
						lblStatus.setText("Team 2 Team Has Won by " + (new Integer(10 - wicket.getNumber()).toString()) + " Wickets");
					}
				// PB.progressProperty().bind(myNum.numberProperty());
				// PI.progressProperty().bind(myNum.numberProperty());
			}

		});

		wicket.numberProperty().addListener(new ChangeListener<Object>() {
			@Override
			public void changed(ObservableValue<? extends Object> obsevable, Object oldValue, Object newValue) {
				// TODO Auto-generated method stub
				if(wicket.getNumber() == 10) {
					lblStatus.setText("Team 1 Has Won by " + (new Integer((int)(MainController3.run.getNumber() - run2.getNumber())).toString()) + " Runs" );
				}
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
				lblBl.setText(new Integer(ball.getNumber() % 6).toString());
				lblov.setText(new Integer(ball.getNumber() / 6).toString());
				lblRR.setText(new Double((run2.getNumber() / (double) ball.getNumber()) * 6.0).toString());
				if(MainController3.run.getNumber() > run2.getNumber()) {
					if((MainController2.over*6) <= ball.getNumber()) {
						lblStatus.setText("Team 1 Has Won by " + (new Integer((int)(MainController3.run.getNumber() - run2.getNumber())).toString()) + " Runs" );
					}
					else {
						lblStatus.setText("Need " + (new Integer((int)(MainController3.run.getNumber() - run2.getNumber() + 1.0)).toString()) + " More Runs From " + (new Integer((MainController2.over * 6) - ball.getNumber()).toString()) +  " Balls ");
						lblPS.setText(new Double( ((MainController3.run.getNumber() - run2.getNumber() + 1.0)/(double)( ((double)MainController2.over * 6.0) - ball.getNumber()))*6.0 ).toString());
						}
					}
				else if((int)MainController3.run.getNumber() == ((int)run2.getNumber())) {
					lblStatus.setText("Scores Level");
				}
				else {
					lblStatus.setText("Team 2 Has Won by " + (new Integer(10 - wicket.getNumber()).toString()) + " Wickets");
				}
				
				}

		});

	
	}
	
	

	// Run
	
	public void BtnClickRun1(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run2.setNumber(run2.getNumber() + 1.0);
		}
	}

	public void BtnClickRun2(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run2.setNumber(run2.getNumber() + 2.0);
		}
	}

	public void BtnClickRun3(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run2.setNumber(run2.getNumber() + 3.0);
		}
	}

	public void BtnClickRun4(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run2.setNumber(run2.getNumber() + 4.0);
		}
	}

	public void BtnClickRun6(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run2.setNumber(run2.getNumber() + 6.0);
		}
	}

	// Extras
	public void BtnClickRun1B(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run2.setNumber(run2.getNumber() + 1.0);
		extra.setNumber(extra.getNumber() + 1);
		}
	}

	public void BtnClickRun2B(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run2.setNumber(run2.getNumber() + 2.0);
		extra.setNumber(extra.getNumber() + 2);
		}
	}

	public void BtnClickRun3B(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run2.setNumber(run2.getNumber() + 3.0);
		extra.setNumber(extra.getNumber() + 4);
		}
	}

	public void BtnClickRun4B(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run2.setNumber(run2.getNumber() + 4.0);
		extra.setNumber(extra.getNumber() + 4);
		}
	}

	public void BtnClickRunNB(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run2.setNumber(run2.getNumber() + 1.0);
		extra.setNumber(extra.getNumber() + 1);
		}
	}

	public void BtnClickRunWD(ActionEvent event) {
		if(wicket.getNumber() < 10 && ball.getNumber() < (MainController2.over * 6)) {
		run2.setNumber(run2.getNumber() + 1.0);
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
}
