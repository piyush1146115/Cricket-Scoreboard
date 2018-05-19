package application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import config.SpringConfiguration;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	private static ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	public static JdbcTemplate tmp = ctx.getBean(JdbcTemplate.class);

	@Override
	public void start(Stage primaryStage) {

//		String result = Main.tmp.queryForObject("select name from demo where id = 1", String.class);
//		String updateQuery = "insert into demo values(?,?)";
//		
//		int id = 2; String name = "Alamin";
//		
//		Main.tmp.update(updateQuery, new Object[] {id, name});
//		
//		System.out.println(result);

		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
			// Parent root =
			// FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
