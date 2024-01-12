/**
 * 
 */
package org.dimigo.gui;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ HelloWorldController
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 1.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class HelloWorldController {
	
	public void handleCloseAction(ActionEvent event) {
		System.out.println("button clicked");
		Platform.exit();
	}
}



