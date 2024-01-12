/**
 * 
 */
package org.dimigo.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.util.Duration;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ LayoutSampleController
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 3.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class AnimationController implements Initializable {

	@FXML Button button;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	
	@FXML public void handleClickAction(ActionEvent event) {
		System.out.println("handleClickAction start");
		
		Timeline timeline = new Timeline();
		
		Parent p = button.getParent();
		p.setTranslateX(0);
		
		// 0 -> 500까지 1초동안 움직임
		KeyValue keyValue = new KeyValue(p.translateXProperty(), 500);
		KeyFrame keyFrame = new KeyFrame(Duration.millis(1000), keyValue);
		
		timeline.getKeyFrames().add(keyFrame);
		timeline.play();
	}
	
}
