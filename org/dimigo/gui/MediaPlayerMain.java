/**
 * 
 */
package org.dimigo.gui;

import java.net.URL;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 * <pre>
 * org.dimigo.gui
 *   |_ MusicPlayer
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2015. 11. 3.
 * </pre>
 *
 * @author		: teacher
 * @version		: 1.0
 */
public class MediaPlayerMain extends Application {

	  public static void main(String[] args) {
		  launch(args);
	  }

	  @Override
	  public void start(Stage primaryStage) {
		    final URL resource = getClass().getResource("Sleep.mp3");
		    final Media media = new Media(resource.toString());
		    final MediaPlayer mediaPlayer = new MediaPlayer(media);
		    mediaPlayer.play();
		    
		    primaryStage.setTitle("Audio Player 1");
		    primaryStage.setWidth(200);
		    primaryStage.setHeight(200);
		    primaryStage.show();
	  }

}
