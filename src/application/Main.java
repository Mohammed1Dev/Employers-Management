package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			Parent root =FXMLLoader.load(getClass().getResource("Main1.fxml"));
			Parent root1 =FXMLLoader.load(getClass().getResource("Main2.fxml"));
			Parent root2 =FXMLLoader.load(getClass().getResource("Main3.fxml"));
			Scene scene = new Scene(root,680,700);
			Scene scene1 = new Scene(root1,680,700);
			Scene scene2 = new Scene(root2,680,700);

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
