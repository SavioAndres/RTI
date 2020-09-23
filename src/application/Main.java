package application;

import java.io.IOException;

import org.opencv.core.Core;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;


public class Main extends Application {
	
	public static Stage stage;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		stage = primaryStage;
		
		Pane root = FXMLLoader.load(getClass().getResource("FXMLTela.fxml"));
		
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("RTI");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
