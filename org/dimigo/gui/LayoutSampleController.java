/**
 * 
 */
package org.dimigo.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

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
public class LayoutSampleController implements Initializable {

	@FXML FlowPane flowPane;
	@FXML Hyperlink hplSales;
	@FXML Hyperlink hplMarketing;
	@FXML Hyperlink hplDistribution;
	@FXML Hyperlink hplCosts;
	
	final static String[] urls = new String[]{
        "http://www.oracle.com/us/products/index.html",
        "http://education.oracle.com/",
        "http://www.oracle.com/partners/index.html",
        "http://www.oracle.com/us/support/index.html"
    };
	
	final WebView browser = new WebView();
	final WebEngine webEngine = browser.getEngine();
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ImageView pages[] = new ImageView[8];
		
		for (int i=0; i<8; i++) {
		     pages[i] = new ImageView(
		        new Image(getClass().getResourceAsStream("resource/chart_"+(i+1)+".png")));
		     flowPane.getChildren().add(pages[i]);
		}
		
		System.out.println("hplSales: " + hplSales);
		System.out.println("webEngine: " + webEngine);
//		hplSales.setOnAction(event->webEngine.load(urls[0]));
        
//        hplMarketing.setOnAction(event-> {
//            webEngine.load(urls[1]);
//        });
//        
//        hplDistribution.setOnAction(event-> {
//            webEngine.load(urls[2]);
//        });
//        
//        hplCosts.setOnAction(event-> {
//            webEngine.load(urls[3]);
//        });
	}
	
	@FXML public void handleHyperlinkSales() {
		webEngine.load(urls[0]);
	}
}
