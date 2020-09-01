package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class FXMLTelaController implements Initializable {

	@FXML
    private Button btn_1;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
    private void ee(ActionEvent event) {
		ReadImage img = new ReadImage();
		img.read();
    }

}
