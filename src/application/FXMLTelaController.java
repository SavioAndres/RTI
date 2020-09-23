package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.HTMLEditor;

public class FXMLTelaController implements Initializable {

	@FXML
    private Button btn_1;
	
	@FXML
    private ImageView ig;
	
	@FXML
	private HTMLEditor txtarea;
	
	@FXML
	private ProgressBar bar;
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
    private void ee(ActionEvent event) throws FileNotFoundException {
		OpenImage oi = new OpenImage();
		
		ReadImage img = new ReadImage();
		
		File file = oi.open();
		//img.transform(file);
		
		this.img(file);
		
		String result = img.read(file);
		
		bar.setProgress(1);
		
		txtarea.setHtmlText(result);
    }
	
	private void img(File file) throws FileNotFoundException {
		System.out.println(">>>>>> ->>" + file.getPath());
		FileInputStream input = new FileInputStream(file.getPath());
		Image image = new Image(input);
		ig.setImage(image);
	}

}
