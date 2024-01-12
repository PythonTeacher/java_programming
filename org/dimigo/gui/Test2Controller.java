/**
 * 
 */
package org.dimigo.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ Test2Controller
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 25.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class Test2Controller {
	
	@FXML Label word;
	
	public void setText(String text) {
		word.setText(text);
	}
	
}
