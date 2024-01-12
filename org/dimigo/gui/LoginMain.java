/**
 * 
 */
package org.dimigo.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ HelloWorldMain2
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 19.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class LoginMain extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		
		stage.setScene(new Scene(root));
		stage.setTitle("Login");
		
		stage.show();
	}
	
	
	
	
}








