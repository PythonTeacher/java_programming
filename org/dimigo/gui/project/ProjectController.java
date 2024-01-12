/**
 * 
 */
package org.dimigo.gui.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ ProjectController
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 20.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class ProjectController implements Initializable {
	
	@FXML TableView<Team> remainedView;
	@FXML TableView<Team> selectedView;	
	@FXML Label lblTitle;
	
	List<Team> selectedTeam = new ArrayList<Team>();
	List<Team> remainedTeam = new ArrayList<Team>();
	
	private static final int classNumber = 3;
	
	@SuppressWarnings("unchecked")
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		try {
			lblTitle.setText("2학년 " + classNumber + "반 프로젝트 순서 정하기");
			
			File file = new File("files/2_" + classNumber + "_remained.txt");
			try(BufferedReader br = new BufferedReader(new FileReader(file))) {
					
				String line = "";
				
				while((line = br.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(line, "|");
					remainedTeam.add(new Team((String)st.nextElement(), (String)st.nextElement()));
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
			TableColumn number = remainedView.getColumns().get(0);
			number.setCellValueFactory(
	                new PropertyValueFactory<Team, String>("number"));
			
			number.setStyle("-fx-alignment: CENTER;");
			
			TableColumn member = remainedView.getColumns().get(1);
			member.setCellValueFactory(
	                new PropertyValueFactory<Team, String>("member"));
			
			member.setStyle("-fx-alignment: CENTER;");
			
			remainedView.setItems(FXCollections.observableArrayList(remainedTeam));
			
			
			TableColumn number2 = selectedView.getColumns().get(0);
			number2.setCellValueFactory(
	                new PropertyValueFactory<Team, String>("number"));
			
			number2.setStyle("-fx-alignment: CENTER;");
			
			TableColumn member2 = selectedView.getColumns().get(1);
			member2.setCellValueFactory(
	                new PropertyValueFactory<Team, String>("member"));
			
			member2.setStyle("-fx-alignment: CENTER;");			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}	
	
	public void handleStartAction(ActionEvent event) {
		Random random = new Random();
		
		int lastIndex = remainedView.getItems().size();		
		if(lastIndex < 1) {
			return;
		}
		
		int index = random.nextInt(lastIndex);
						
		Team team = remainedTeam.get(index);
		selectedTeam.add(team);
		remainedTeam.remove(team);
					
		selectedView.getItems().add(team);
		remainedView.getItems().remove(team);
	
	}

	public void handleFinishAction(ActionEvent event) {
		File file1 = new File("files/2_" + classNumber + "_remained.txt");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file1))) {			
			for(Team team : remainedTeam) {
				bw.write(team.toString());
				bw.write('\n');
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		File file2 = new File("files/2_" + classNumber + "_selected.txt");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file2, true))) {
			for(Team team : selectedTeam) {
				bw.write(team.toString());
				bw.write('\n');
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Platform.exit();
	}
}
