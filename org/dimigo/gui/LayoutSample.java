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
 *   |_ LayoutSample
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 3.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class LayoutSample extends Application {

	public static void main(String[] args) {
		launch(args);	// 메인 클래스의 객체를 생성하고, 메인 윈도우를 생성한 다음 start() 메소드를 호출한다.
	}

	@Override
	public void start(Stage stage) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("LayoutSample.fxml"));
			
			// Stage에 Scene 설정
			stage.setScene(new Scene(root));
			stage.setTitle("Layout Sample");
			
			stage.show();   // 메인 윈도우 보이기
        } catch(Exception e) {
            e.printStackTrace();
        }
	}

}
