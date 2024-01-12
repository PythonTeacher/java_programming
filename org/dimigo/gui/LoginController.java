/**
 * 
 */
package org.dimigo.gui;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ LoginController
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 20.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class LoginController {
	@FXML private TextField txtId;
	@FXML private PasswordField txtPwd;
	@FXML private Label lblResult;
	
	private static final String ID = "testid";
	private static final String PWD = "testpwd";
	
	public void handleLoginAction(ActionEvent event) {
		String id = txtId.getText();
		String pwd = txtPwd.getText();
		
		// id, pwd 값이 일치하는 경우 lblResult.setText("로그인되었습니다");
		// 일치하지 않으면 lblResult.setText("잘못된 로그인 정보입니다. 다시 입력하세요');
		if(isEmpty(id) || isEmpty(pwd)) {
			lblResult.setText("로그인 정보가 입력되지 않았습니다.");
			return;
		}
		
		if(id.equals(ID) && pwd.equals(PWD)) {
			lblResult.setText("로그인 되었습니다.");
		} else {
			lblResult.setText("잘못된 로그인 정보입니다. 다시 입력하세요");
		}
	}
	
	private boolean isEmpty(String txt) {
		if(txt == null || "".equals(txt.trim())) return true;
		return false;
	}
	
	public void handleCloseAction(ActionEvent event) {
		Platform.exit();
	}
	
}
