/**
 * 
 */
package org.dimigo.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ IdolGroupController
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 3.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class IdolGroupController implements Initializable {

	@FXML ListView<String> listView;
	@FXML TableView<IdolGroup> tableView;
	@FXML ImageView imageView;
	@FXML WebView webView;
	
	private final ObservableList<IdolGroup> exo =
	        FXCollections.observableArrayList(
	            new IdolGroup("백현", "랩", "백현.jpg", "http://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ie=utf8&query=%EB%B0%B1%ED%98%84"),
	            new IdolGroup("루한", "랩", "루한.jpg", "http://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ie=utf8&query=%EB%A3%A8%ED%95%9C"),
	            new IdolGroup("디오", "보컬", "디오.jpg", "http://search.naver.com/search.naver?where=nexearch&sm=tab_nc2&ie=utf8&query=%EB%94%94%EC%98%A4&os=311276&pkid=1&noq=exo"),
	            new IdolGroup("타오", "보컬", "타오.jpg", "http://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ie=utf8&query=%ED%83%80%EC%98%A4"),
	            new IdolGroup("첸", "보컬", "첸.jpg", "http://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ie=utf8&query=%EC%B2%B8")
	        );
	
	private final ObservableList<IdolGroup> aoa =
	        FXCollections.observableArrayList(
	            new IdolGroup("지민", "보컬", "지민.jpg", "http://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ie=utf8&query=%EC%A7%80%EB%AF%BC"),
	            new IdolGroup("초아", "보컬", "초아.jpg", "http://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ie=utf8&query=%EC%B4%88%EC%95%84"),
	            new IdolGroup("유나", "보컬", "유나.jpg", "http://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ie=utf8&query=%EC%9C%A0%EB%82%98"),
	            new IdolGroup("유경", "랩", "유경.jpg", "http://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ie=utf8&query=%EC%9C%A0%EA%B2%BD"),
	            new IdolGroup("설현", "랩", "설현.jpg", "http://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ie=utf8&query=%EC%84%A4%ED%98%84")
	        );
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listView.setItems(FXCollections.observableArrayList("EXO", "AOA"));
		
		listView.getSelectionModel().selectedItemProperty().addListener(
				new ChangeListener<String>() {
					@Override
					public void changed(ObservableValue<? extends String> arg0,
							String oldValue, String newValue) {
						System.out.println(newValue);

						if(newValue.equals("EXO")) {
							tableView.setItems(exo);
						} else if(newValue.equals("AOA")) {
							tableView.setItems(aoa);
						}
					}
				}
		);
		
		TableColumn memberName = tableView.getColumns().get(0);
		memberName.setCellValueFactory(
                new PropertyValueFactory<IdolGroup, String>("memberName"));
		
		TableColumn role = tableView.getColumns().get(1);
		role.setCellValueFactory(
                new PropertyValueFactory<IdolGroup, String>("role"));
		
		TableColumn imageFileName = tableView.getColumns().get(2);
		imageFileName.setCellValueFactory(
                new PropertyValueFactory<IdolGroup, String>("imageFileName"));
		imageFileName.setVisible(true);
		
		TableColumn urlAddress = tableView.getColumns().get(3);
		urlAddress.setCellValueFactory(
                new PropertyValueFactory<IdolGroup, String>("urlAddress"));
		urlAddress.setVisible(true);
		
		WebEngine webEngine = webView.getEngine();
		
		tableView.getSelectionModel().selectedItemProperty().addListener(
				new ChangeListener<IdolGroup>() {
					@Override
					public void changed(ObservableValue<? extends IdolGroup> arg0,
							IdolGroup oldValue, IdolGroup newValue) {
						System.out.println(oldValue);
						System.out.println(newValue);

						if(newValue != null) {
							imageView.setImage(new Image(
									getClass().getResource("resource/" + newValue.getImageFileName()).toString()));
							
							webEngine.load(newValue.getUrlAddress());
						}
					}
				}
		);
	}
	
	@FXML public void handleOkAction(ActionEvent e) {
		String groupName = listView.getSelectionModel().getSelectedItem();
		IdolGroup group = tableView.getSelectionModel().getSelectedItem();
		
		System.out.println("선택한 그룹명 : " + groupName);
		System.out.println("멤버 : " + group);
		
		Platform.exit();
	}
}
