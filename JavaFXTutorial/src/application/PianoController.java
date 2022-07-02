package application;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
public class PianoController { //sadece sayý kabul eden 17den buyuk tamsayý alan program yaz.
	@FXML
	Button button1;
	@FXML
	Label label1;
	@FXML
	Label label2;
	@FXML
	TextField textField1;
	
	private int yas;
	public PianoController() {
		// TODO Auto-generated constructor stub
	}
	public void gonder(ActionEvent actionEvent){
		try{
		yas = Integer.valueOf(textField1.getText()); //Integer.parseInt(<stringdeger>)
				if(yas>17){
					System.out.println("Kaydolabilirsin.");
				}else{
					System.out.println("kaydolmak için 18+ olman gerek");
				}
		
		}//sayý kabul eden exception nasýl yapýlýr?
		catch(NumberFormatException numberFormatException){
			System.out.println("Sadece sayi giriniz.");
			label1.setText("sadece sayi giriniz...");
			label2.setText("sadece sayi giriniz...");
			
		}
		catch(Exception exception){
				System.out.println(exception);
				label1.setText("hata...");
				label2.setText("hata...");
		}
		
	}
	
		
		

}
