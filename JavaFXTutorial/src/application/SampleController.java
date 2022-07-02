package application;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Circle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class SampleController {
	@FXML
	ImageView resimim;
	@FXML
	Circle cember;
	@FXML
	Polygon ucgen;
	@FXML
	Rectangle dikdortgenim;
	@FXML 
	Text text;
	@FXML
	Line line;
	@FXML
	void initialize() {
		//textin metni nas�l ayarlan�r?
		text.setText("deneme metniiiii"); 
		//textin x koordinat�n� 50 nas�l yap�l�r?
		text.setX(50.0);
		//textin y koordinat�n� 50 nas�l yap�l�r?
		text.setY(50.0);
		//textin fontu verdana ve 50 punto nas�l yap�l�r?
		text.setFont(Font.font("Verdana",50));
		//metnin rengi k�rm�z� nas�l yap�l�r?
		text.setFill(Color.RED);
		//�izginin ba�lang�� koordinat� (200,200) biti� koordinat� (500,200) nas�l yap�l�r?
		// https://youtu.be/9XJicRt_FaI?t=1878
		//
		line.setStartX(200.0);
		line.setStartY(200.0);
		line.setEndX(500.0);
		line.setEndY(200.0);
		//�izginin geni�li�i 10 nas�l yap�l�r?
		line.setStrokeWidth(10);
		//�izginin rengi azure nas�l yap�l�r?
		line.setStroke(Color.AZURE);
		//�izgi yar� saydam yap.
		line.setOpacity(0.5);
		//�izgi 45 derece nas�l d�nd�r�l�r?
		line.setRotate(45.0);
		//dikdortgenin X konumunu 100 yap.
		dikdortgenim.setX(100);
		//dikdortgenin Y konumunu 100 yap.
		dikdortgenim.setY(100);
		//dikdortgenin geni�ligini 100 yap.
		dikdortgenim.setWidth(100.0);
		//dikdortgenin y�ksekli�ini 100 yap.
		dikdortgenim.setHeight(100.0);
		//dikdortgenin rengini k�rm�z� yap.
		dikdortgenim.setFill(Color.RED);
		//dikdortgenin anahatlar�n�n�n kal�nl�g�n� 5 yap ve rengini bej yap...
		dikdortgenim.setStrokeWidth(5.0);
		dikdortgenim.setStroke(Color.BEIGE);
		//koordinatlar� 200,200 300,300 200,300 olan bir ��gen olu�tur.
		ucgen.getPoints().setAll(
				200.0,200.0,
				300.0, 300.0,
				200.0, 300.0);
		//ucgenin rengini sar� yap...
		ucgen.setFill(Color.YELLOW);
		//merkezi 350,350de olan yar��ap� 50, rengi turuncu olan bir �ember olu�tur.
		cember.setCenterX(350);
		cember.setCenterY(350);
		cember.setRadius(50);
		cember.setFill(Color.ORANGE);
		//resim olustur.
		Image animeResmi = new Image(getClass().getResourceAsStream("myicon.png"));
		resimim.setImage(animeResmi);
		//resmin bulundugu yeri 400,400 yap.
		resimim.setX(400);
		resimim.setY(400);
	}
}