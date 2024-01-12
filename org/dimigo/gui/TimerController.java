/**
 * 
 */
package org.dimigo.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ TimerController
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 3.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class TimerController {
	
	@FXML private Label lblTimer1;
	@FXML private Label lblTimer2;
	
	private int hour1, min1, sec1;
	private int hour2=1, min2, sec2;
	
	private Task<Void> task1, task2;
		
	@FXML public void handleStart1Action(ActionEvent e) {
		
		// Task는 한번만 사용할 수 있음
		// 작업이 완료되거나 취소된 후에 작업을 재실행하려면 Task를 다시 생성해야 함
		task1 = new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				while(true) {
					
					if(isCancelled()) {
						break;
					}
					
					sec1++;
					if(sec1 == 60) { min1++; sec1=0; }
					if(min1 == 60) { hour1++; min1=0; }
					
					String timerText = String.format("%02d:%02d:%02d", hour1, min1, sec1);
					updateMessage(timerText);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						if(isCancelled()) {
							break;
						}
					}
				}
				return null;
			}			
		};
		
		lblTimer1.textProperty().bind(task1.messageProperty());
		
		Thread thread = new Thread(task1);
		thread.start();
	}
	
	@FXML public void handleStart2Action(ActionEvent e) {
		
		task2 = new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				while(true) {
					
					if(isCancelled()) {
						break;
					}
					
					sec2--;
					if(sec2 < 0) { min2--; sec2=59; }
					if(min2 < 0) { hour2--; min2=59; }
					
					String timerText = String.format("%02d:%02d:%02d", hour2, min2, sec2);
					updateMessage(timerText);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						if(isCancelled()) {
							break;
						}
					}
				}
				return null;
			}			
		};
		
		lblTimer2.textProperty().bind(task2.messageProperty());
		
		Thread thread = new Thread(task2);
		thread.start();
	}
	
	@FXML public void handleStop1Action(ActionEvent e) {
		task1.cancel();
	}
	
	@FXML public void handleStop2Action(ActionEvent e) {
		task2.cancel();
	}
}
