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
		//textin metni nasýl ayarlanýr?
		text.setText("deneme metniiiii"); 
		//textin x koordinatýný 50 nasýl yapýlýr?
		text.setX(50.0);
		//textin y koordinatýný 50 nasýl yapýlýr?
		text.setY(50.0);
		//textin fontu verdana ve 50 punto nasýl yapýlýr?
		text.setFont(Font.font("Verdana",50));
		//metnin rengi kýrmýzý nasýl yapýlýr?
		text.setFill(Color.RED);
		//çizginin baþlangýç koordinatý (200,200) bitiþ koordinatý (500,200) nasýl yapýlýr?
		// https://youtu.be/9XJicRt_FaI?t=1878
		//
		line.setStartX(200.0);
		line.setStartY(200.0);
		line.setEndX(500.0);
		line.setEndY(200.0);
		//çizginin geniþliði 10 nasýl yapýlýr?
		line.setStrokeWidth(10);
		//çizginin rengi azure nasýl yapýlýr?
		line.setStroke(Color.AZURE);
		//çizgi yarý saydam yap.
		line.setOpacity(0.5);
		//çizgi 45 derece nasýl döndürülür?
		line.setRotate(45.0);
		//dikdortgenin X konumunu 100 yap.
		dikdortgenim.setX(100);
		//dikdortgenin Y konumunu 100 yap.
		dikdortgenim.setY(100);
		//dikdortgenin geniþligini 100 yap.
		dikdortgenim.setWidth(100.0);
		//dikdortgenin yüksekliðini 100 yap.
		dikdortgenim.setHeight(100.0);
		//dikdortgenin rengini kýrmýzý yap.
		dikdortgenim.setFill(Color.RED);
		//dikdortgenin anahatlarýnýnýn kalýnlýgýný 5 yap ve rengini bej yap...
		dikdortgenim.setStrokeWidth(5.0);
		dikdortgenim.setStroke(Color.BEIGE);
		//koordinatlarý 200,200 300,300 200,300 olan bir üçgen oluþtur.
		ucgen.getPoints().setAll(
				200.0,200.0,
				300.0, 300.0,
				200.0, 300.0);
		//ucgenin rengini sarý yap...
		ucgen.setFill(Color.YELLOW);
		//merkezi 350,350de olan yarýçapý 50, rengi turuncu olan bir çember oluþtur.
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