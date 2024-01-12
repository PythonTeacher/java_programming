/**
 * 
 */
package org.dimigo.gui;

import java.io.IOException;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ HelloWorldController
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 1.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class TestController {	

	@FXML Button button;
	@FXML ImageView image;
	@FXML Label text;
	@FXML AnchorPane root;

	
	public void handleMoveAction(ActionEvent event) throws IOException {
		System.out.println("start");
		
		image.setImage(new Image(getClass().getResource("resource/kakao.jpg").toString()));
		
		TranslateTransition tt = 
			    new TranslateTransition(Duration.seconds(3), image);

			    tt.setFromX( -(image.getFitWidth()) );
			    tt.setToX( root.getPrefWidth() );
			    tt.setCycleCount( 1 ); //Timeline.INDEFINITE );
			    tt.play();
			    
			    
//		System.out.println(getClass().getResource("../exception/kakao.jpg").toString());

//		button.setFont(Font.font("Calibri 보통", 40));
//		text.setFont(new Font("Arial", text.getFont().getSize()+10));
		//Use the font method of the Font class
//		text.setFont(Font.font("나눔고딕 Bold", text.getFont().getSize()+10));
		
//		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Test2.fxml"));
//		
//		Parent root = (Parent) fxmlLoader.load();
//        Stage stage = (Stage) button.getScene().getWindow();
//        
//        stage.setScene(new Scene(root));
//        stage.show();
//        
//		Test2Controller ctrl = fxmlLoader.getController();
//		ctrl.setText("Hello");
	}

}



