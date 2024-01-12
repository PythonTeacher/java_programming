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
 *   |_ ButtonControl
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 2.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class InputControl extends Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("InputControl.fxml"));
			
			// Stage에 Scene 설정
			stage.setScene(new Scene(root));
			stage.setTitle("Button Control");
			
			stage.show();   // 메인 윈도우 보이기
        } catch(Exception e) {
            e.printStackTrace();
        }
		
	}

}
