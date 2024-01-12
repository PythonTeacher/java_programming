/**
 * 
 */
package org.dimigo.gui.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import org.dimigo.gui.vo.Book;
import org.dimigo.gui.vo.Movie;
import org.dimigo.openapi.NaverSearch;

import com.fasterxml.jackson.databind.ObjectMapper;

import javafx.collections.ObservableList;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ NaverSearchController
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 3.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class NaverSearchController implements Initializable {

	@FXML ListView<String> listView;
	@FXML TableView<Book> bookTableView;
	@FXML TableView<Movie> movieTableView;
	@FXML WebView webView;
		
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		Map<String, String> targetMap = new LinkedHashMap<>();
		targetMap.put("도서", "book");
		targetMap.put("영화", "movie");
		
		listView.setItems(
				FXCollections.observableArrayList(new ArrayList<String>(targetMap.keySet())));
		
		listView.getSelectionModel().selectedItemProperty().addListener(
				new ChangeListener<String>() {
					@Override
					public void changed(ObservableValue<? extends String> arg0,
							String arg1, String arg2) {
						try {
							String searchTarget = targetMap.get(arg2);
							System.out.println(searchTarget);
							
							String response = NaverSearch.search(searchTarget);
							
							if ("book".equals(searchTarget)) {
								bookTableView.setVisible(true);
								List<Book> bookList = getBookList(response);
								System.out.println(bookList);
								
								ObservableList<Book> data = 
										FXCollections.observableArrayList(bookList);
	
								bookTableView.setItems(data);
							} else if ("movie".equals(searchTarget)) {
								movieTableView.setVisible(true);
								List<Movie> movieList = getMovieList(response);
								System.out.println(movieList);
								
								ObservableList<Movie> data = 
										FXCollections.observableArrayList(movieList);
							
								movieTableView.setItems(data);
							}
						} catch(Exception e) {
							e.printStackTrace();
						}
					}
				}
		);
		
		// 테이블 컬럼과 데이터를 연결
		bindBookTableColumn();		
		bindMovieTableColumn();		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void bindBookTableColumn() {
		TableColumn title = bookTableView.getColumns().get(0);
		title.setCellValueFactory(new PropertyValueFactory<Book, String>("title"));
		
		TableColumn link = bookTableView.getColumns().get(1);
		link.setCellValueFactory(new PropertyValueFactory<Book, String>("link"));
		
		TableColumn author = bookTableView.getColumns().get(2);
		author.setCellValueFactory(new PropertyValueFactory<Book, String>("author"));
		
		TableColumn price = bookTableView.getColumns().get(3);
		price.setCellValueFactory(new PropertyValueFactory<Book, String>("price"));
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void bindMovieTableColumn() {
		TableColumn title = movieTableView.getColumns().get(0);
		title.setCellValueFactory(new PropertyValueFactory<Movie, String>("title"));
		
		TableColumn link = movieTableView.getColumns().get(1);
		link.setCellValueFactory(new PropertyValueFactory<Movie, String>("link"));
		
		TableColumn pubDate = movieTableView.getColumns().get(2);
		pubDate.setCellValueFactory(new PropertyValueFactory<Movie, String>("pubDate"));
		
		TableColumn director = movieTableView.getColumns().get(3);
		director.setCellValueFactory(new PropertyValueFactory<Movie, String>("director"));
	}
	
	@SuppressWarnings("unchecked")
	private List<Book> getBookList(String response) throws Exception {
		List<Book> result = new ArrayList<Book>();
		Map<String, Object> map = new ObjectMapper().readValue(response, Map.class);
		
		List<Map<String, String>> list = (List<Map<String, String>>) map.get("items");
		
		for (Map<String, String> book : list) {
			String title = book.get("title").replaceAll("\\<.*?>","");
			String link = book.get("link");
			String author = book.get("author");
			String price = book.get("price");
			result.add(new Book(title, link, author, price));
		}
		
		return result;
	}
	
	@SuppressWarnings("unchecked")
	private List<Movie> getMovieList(String response) throws Exception {
		List<Movie> result = new ArrayList<Movie>();
		Map<String, Object> map = new ObjectMapper().readValue(response, Map.class);
		
		List<Map<String, String>> list = (List<Map<String, String>>) map.get("items");
		
		for (Map<String, String> movie : list) {
			String title = movie.get("title").replaceAll("\\<.*?>","");
			String link = movie.get("link");
			String pubDate = movie.get("pubDate");
			String director = movie.get("director");
			result.add(new Movie(title, link, pubDate, director));
		}
		
		return result;
	}
	
	@FXML public void handleBookAction(Event e) {
		Book book = bookTableView.getSelectionModel().getSelectedItem();
		System.out.println(book);		

		WebEngine webEngine = webView.getEngine();
		webEngine.load(book.getLink());
	}
	
	@FXML public void handleMovieAction(Event e) {
		Movie movie = movieTableView.getSelectionModel().getSelectedItem();
		System.out.println(movie);
		
		WebEngine webEngine = webView.getEngine();
		webEngine.load(movie.getLink());
	}
	
	@FXML public void handleCloseAction(Event e) {
		Platform.exit();
	}
	
}
