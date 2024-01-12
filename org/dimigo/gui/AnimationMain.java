/**
 * 
 */
package org.dimigo.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ MelonMain
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 3.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class AnimationMain extends Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Animation.fxml"));
			
			Scene scene = new Scene(root);
			// Stage에 Scene 설정
			stage.setScene(scene);
			stage.setResizable(true);			
			
			stage.show();   // 메인 윈도우 보이기
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
