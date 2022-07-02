package application;


import java.net.URL;
import javafx.fxml.FXML;
import java.util.ResourceBundle;
import javafx.scene.media.MediaView;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
public class MediaViewDeneme implements Initializable {

	public MediaViewDeneme() {

		// TODO Auto-generated constructor stub
	}
	
	@FXML
	Button buttonBaslat, buttonDuraklat, buttonReset;
	@FXML
	MediaView mediaView1;
	private File file;
	private Media media;
	private MediaPlayer mediaPlayer;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		file = new File("videoplayback.mp4");
		media = new Media(file.toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaView1.setMediaPlayer(mediaPlayer);
		
	}
		
		
		
	
	public void buttonBaslat_OnAction(ActionEvent actionEvent){
		mediaPlayer.play();
	}
	public void buttonDuraklat_OnAction(ActionEvent actionEvent){
		mediaPlayer.pause();
	}
	public void buttonReset_OnAction(ActionEvent actionEvent){
		if(mediaPlayer.getStatus() != MediaPlayer.Status.READY){
			mediaPlayer.seek(javafx.util.Duration.seconds(0.0));
		}
		
	}
}
	
		
