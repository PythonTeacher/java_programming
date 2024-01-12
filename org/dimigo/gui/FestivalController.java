/**
 * 
 */
package org.dimigo.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ FestivalController
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 3.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class FestivalController implements Initializable {
	@FXML DatePicker dpSignUpDate;
	@FXML RadioButton rdbFirst, rdbSecond, rdbThird;
	@FXML ComboBox<String> cbClass;
	@FXML TextField txtName;
	@FXML CheckBox ckbMusic, ckbDance, ckbBand;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cbClass.getItems().addAll("1반", "2반", "3반", "4반", "5반", "6반");
	}
	
	public void handleSignUpAction(ActionEvent event) {
		System.out.println(dpSignUpDate.getValue());
		System.out.println(rdbFirst.isSelected() ? "1학년" :
						   rdbSecond.isSelected() ? "2학년" : "3학년");
		System.out.println(cbClass.getValue());
		System.out.println(txtName.getText());
		System.out.println("Music : " + ckbMusic.isSelected());
		System.out.println("Dance : " + ckbDance.isSelected());
		System.out.println("Band : " + ckbBand.isSelected());
	}
	
	public void handleCloseAction(ActionEvent event) {
		Platform.exit();
	}

	
	
	
	
	
	
	
}
