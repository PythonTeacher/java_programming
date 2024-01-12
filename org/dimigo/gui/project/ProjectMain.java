/**
 * 
 */
package org.dimigo.gui.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ ProjectMain
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 19.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class ProjectMain extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Project.fxml"));
		
		stage.setScene(new Scene(root));
		stage.setTitle("[자바프로그래밍] 프로젝트 순서 정하기");
		stage.centerOnScreen();
		
		stage.show();
	}
	
	
}