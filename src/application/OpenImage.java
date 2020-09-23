package application;

import java.io.File;

import javafx.stage.FileChooser;

public class OpenImage {
	
	public File open() {
		FileChooser chooser = new FileChooser();
		chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Images", "*.jpg", "*.png"));
		File file = chooser.showOpenDialog(Main.stage);
		
		return file;
	}
	
}
