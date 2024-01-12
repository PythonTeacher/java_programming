package org.dimigo.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * <pre>
 * org.dimigo.javafx
 *   |_ FestivalMain
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 1.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class FestivalMain extends Application {

	public static void main(String[] args) {
		launch(args);	// 메인 클래스의 객체를 생성하고, 메인 윈도우를 생성한 다음 start() 메소드를 호출한다.
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Festival.fxml"));
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("resource/style.css").toString());
		
		// Stage에 Scene 설정
		stage.setScene(scene);
		stage.setTitle("Dimigo Festival");
		
		stage.show();   // 메인 윈도우 보이기
	}	

}