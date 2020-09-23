package application;

import java.io.File;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImage {
	
	public String read(File imageFile) {
		//File imageFile = new File("C:\\Users\\savio\\Pictures\\20170606_153524.jpg");
        ITesseract instance = new Tesseract();  // JNA Interface Mapping
        // ITesseract instance = new Tesseract1(); // JNA Direct Mapping
        instance.setDatapath("C:/Users/savio/Projects/Java/RTI/src/tessdata"); // path to tessdata directory
        instance.setLanguage("por");

        try {
        	//instance.doOCR(imageFile)imageFile.;
            String result = instance.doOCR(imageFile);
            return result;
        } catch (TesseractException e) {
            return e.getMessage();
        }
	}
	
	public void transform(File imageFile) {
		System.out.println(imageFile.getPath());
		Mat image = Imgcodecs.imread(imageFile.getPath());
		Imgproc.cvtColor(image, image, Imgproc.COLOR_RGB2GRAY, 0);
		//Imgproc.GaussianBlur(image, image, new Size(0, 0), 3);
		Core.addWeighted(image, 1.5, image, -0.5, 0, image);
		Imgproc.threshold(image,image,0,255,Imgproc.THRESH_BINARY + Imgproc.THRESH_OTSU);
		Imgcodecs.imwrite("C:/Users/savio/Desktop/tesseract/saida/gg.png", image);
	}
	
}
