/**
 * 
 */
package org.dimigo.gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ ExampleSetController
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 23.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class SceneTestController {
	@FXML Button btn1;
	@FXML Button btn2;
	
	public void handleButtonAction(ActionEvent event) throws IOException {
		Stage stage; 
	    Parent root;
	    if(event.getSource() == btn1){
	        stage=(Stage) btn1.getScene().getWindow();
	        root = FXMLLoader.load(getClass().getResource("SecondScene.fxml"));
	    } else {
	    	stage=(Stage) btn2.getScene().getWindow();
	    	root = FXMLLoader.load(getClass().getResource("FirstScene.fxml"));
	    }
	    Scene scene = new Scene(root);
	    stage.setScene(scene);
	    stage.show();
	}
	
	public void handleWindowAction(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Festival.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Festival");
        stage.setScene(new Scene(root));
        stage.show();

        // 이전 윈도우 숨기기
        // ((Node)(event.getSource())).getScene().getWindow().hide();
	}
}
