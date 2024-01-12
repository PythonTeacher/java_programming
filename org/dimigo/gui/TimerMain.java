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
 *   |_ TimerMain
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 3.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class TimerMain extends Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Timer.fxml"));
			
			stage.setScene(new Scene(root));
			stage.setTitle("타이머");
			stage.centerOnScreen();
			stage.setResizable(true);
			stage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
