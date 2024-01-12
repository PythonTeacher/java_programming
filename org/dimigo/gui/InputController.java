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
 *   |_ InputController
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 2.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class InputController implements Initializable {

	@FXML TextField txtName;
	@FXML DatePicker dateBirthDt;
	@FXML RadioButton rbMale, rbFemale;
	@FXML CheckBox chkSoccer, chkBaseball, chkBasketBall;
	@FXML ComboBox<String> cbOption;
	
	@FXML public void registerAction(ActionEvent event) {
		System.out.println("이름 : " + txtName.getText());
		System.out.println("생년월일 : " + dateBirthDt.getValue());
		System.out.println("남자 : " + rbMale.isSelected());
		System.out.println("여자 : " + rbFemale.isSelected());
		System.out.println("축구 : " + chkSoccer.isSelected());
		System.out.println("야구 : " + chkBaseball.isSelected());
		System.out.println("농구 : " + chkBasketBall.isSelected());
		System.out.println("옵션 : " + cbOption.getValue());
	}

	@FXML public void closeAction(ActionEvent event) {
		Platform.exit();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("initialize start");
//		ObservableList<String> options = 
//			    FXCollections.observableArrayList(
//			        "PT",
//			        "GX",
//			        "스피닝"
//			    );
//		cbOption.setItems(options);
		
		cbOption.getItems().addAll("PT", "GX", "스피닝");
	}
}
