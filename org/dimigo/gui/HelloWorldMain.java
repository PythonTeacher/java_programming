package org.dimigo.gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * <pre>
 * org.dimigo.javafx
 *   |_ HelloWorldMain
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 1.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class HelloWorldMain extends Application {

	public HelloWorldMain() {
		System.out.println("HelloWorldMain() : " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		System.out.println("main() : " + Thread.currentThread().getName());
		launch(args);		
	}
	
	@Override
	public void init() throws Exception {
		System.out.println("init() : " + Thread.currentThread().getName());
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		System.out.println("start() : " + Thread.currentThread().getName());
		
		// 1. 컨테이너 생성
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		root.setSpacing(30);
		
		// 2. UI 컨트롤 생성
		Label label = new Label("Hello, World");
//		label.setText("Hello, World");
		label.setFont(new Font(70));
		
		Button button = new Button("닫기");
//		button.setText("닫기");
		
		// 3. 이벤트 핸들러 등록
		button.setOnMouseClicked(new EventHandler<Event>() {
			@Override
			public void handle(Event arg0) {
				System.out.println("button clicked");
				Platform.exit();
			}
		});
		
//		button.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>() {
//			@Override
//			public void handle(Event arg0) {
//				System.out.println("button clicked");
//				Platform.exit();
//			}
//		});
		
		button.setOnMouseEntered(new EventHandler<Event>() {
			@Override
			public void handle(Event arg0) {
				button.setEffect(new DropShadow());
			}
		});
		
		button.setOnMouseExited(new EventHandler<Event>() {
			@Override
			public void handle(Event arg0) {
				button.setEffect(null);
			}
		});
		
		// 4. 컨테이너에 UI 객체 담기
		root.getChildren().add(label);
		root.getChildren().add(button);
		
//		ObservableList<Node> list = root.getChildren();
//		list.add(label);
//		list.add(button);
		
		Scene scene = new Scene(root, 500, 400);
		
		// 5. Stage에 Scene 설정
		stage.setScene(scene);		
		stage.setTitle("My first Application");
		stage.show();		// 메인 윈도우 보여주기
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println("stop() : " + Thread.currentThread().getName());
	}
	
	
}