package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SampleController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<?> tableView1;

    @FXML
    private TableColumn<?, ?> columnId;

    @FXML
    private TableColumn<?, ?> columnKul_Adi;

    @FXML
    private TableColumn<?, ?> columnSifre;

    @FXML
    private TextField textFieldKulAdi;

    @FXML
    private TextField textFieldSifre;

    @FXML
    private Button buttonEkle;

    @FXML
    private Button buttonSil;

    @FXML
    private Button buttonGuncelle;

    @FXML
    private Button buttonGoster;

    @FXML
    private Label label1;

    @FXML
    void buttonEkle_OnClick(ActionEvent event) {

    }

    @FXML
    void buttonGoster_OnClick(ActionEvent event) {

    }

    @FXML
    void buttonGuncelle_OnClick(ActionEvent event) {

    }

    @FXML
    void buttonSil_OnClick(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert tableView1 != null : "fx:id=\"tableView1\" was not injected: check your FXML file 'TableView.fxml'.";
        assert columnId != null : "fx:id=\"columnId\" was not injected: check your FXML file 'TableView.fxml'.";
        assert columnKul_Adi != null : "fx:id=\"columnKul_Adi\" was not injected: check your FXML file 'TableView.fxml'.";
        assert columnSifre != null : "fx:id=\"columnSifre\" was not injected: check your FXML file 'TableView.fxml'.";
        assert textFieldKulAdi != null : "fx:id=\"textFieldKulAdi\" was not injected: check your FXML file 'TableView.fxml'.";
        assert textFieldSifre != null : "fx:id=\"textFieldSifre\" was not injected: check your FXML file 'TableView.fxml'.";
        assert buttonEkle != null : "fx:id=\"buttonEkle\" was not injected: check your FXML file 'TableView.fxml'.";
        assert buttonSil != null : "fx:id=\"buttonSil\" was not injected: check your FXML file 'TableView.fxml'.";
        assert buttonGuncelle != null : "fx:id=\"buttonGuncelle\" was not injected: check your FXML file 'TableView.fxml'.";
        assert buttonGoster != null : "fx:id=\"buttonGoster\" was not injected: check your FXML file 'TableView.fxml'.";
        assert label1 != null : "fx:id=\"label1\" was not injected: check your FXML file 'TableView.fxml'.";

    }
}

	/*+javada tablolar ile cal�smak icin class dosyas� olusturmak gerekir. d/y v
	 *-dogru.
	 *+c#da tablolar ile cal�smak icin class dosyas� olusturmak gerekir d/y v
	 *-yanl�s c#da tablolar ile cal�smak icin class dosyas� olusturmak gerekmez..
	 * +javada tablolar ile cal�smak icin class dosyas� olusturmak gerekmez. d/y v
	 * -yanl��, javada tablolar ile �al��mak i�in class dosyas� olusturmak gerekir.
	 * +c#da tablolar ile cal�smak icin class dosyas� olusturmak gerekmez... d/y v
	 * -dogru...
	 * javada tablo icin olusturulan s�n�fda getter ve setter olmak zorundad�r. d/y v
	 * dogru
	 * javada tablo icin olusturulan s�n�fda getter ve setter olmak zorunda degildir. d/y v
	 * yanl��, javada tablo i�in olusturulan s�n�fda getter ve setter olmak zorundad�r.
	 * java c#a gore kod guvenligi ac�s�ndan daha iyidir. d/y v 
	 * dogru
	 * java c#da gore kod guvenligi ac�s�ndan daha kotudur. d/y v
	 * yanl�s, cunku tablolar icin, veritaban� i�in s�n�flar olusturuldugundan kod guvenligi ac�s�ndan daha iyidir.
	 * 		tabloya veri ekleme nas�l yap�l�r? X
	 * 		tabloda secilen sat�r nas�l silinir? X 
	 * 		tabloda secilen sat�r nas�l g�ncellenir? X
	 * 	tabloya ekle sil guncelle yapmak icin getter ve setterlar gereklidir. d/y v
	 * dogru.
	 * tabloya ekle, sil, guncelle yapmak i�in getter ve setterlar gerekli degildir. d/y v
	 * yanl�s, tabloya ekle, sil, guncelle yapmak icin getter ve setterlar gereklidir.
	 * eclipseda fxml dosyas� nas�l olusturulur? uygulayarak goster. ismi TableView olsun. v
	 * controller dosyas� nas�l olusturulur? ismi TableViewController olsun. uygulayarak g�ster. v
	 * tableview scenebuilderda TableView.fxml dosyas�na nas�l eklenir? v
	 * https://youtu.be/4R3pOu0hdWs?t=144
	 * 		tableview scenebuilderda textField nas�l eklenir? v
	 * splitpane nas�l eklenir v
	 * splitPane fit to parent nas�l yap�l�r v
	 * tableview� dikey split panein dikey k�sm�na nas�l eklenir? v
	 * tableview'� dikey split panein �st k�sm�na nas�l fit to parent yap�l�r? v
	 * tableview'a s�tun nas�l eklenir? v
	 * s�tun isimleri id, kul_adi, sifre nas�l yap�l�r? v
	 * kul_adi ve sifre icin split panein alt k�sm�na textField nas�l eklenir? v
	 * kul_adi ve sifre buton ile tableview'a nas�l eklenir? v
	 * secili olan kul_adi ve sifre buton ile tableview'da nas�l silinir? X
	 * kul_adi ve sifre buton ile tableview'a nas�l guncellenir? X
	 * 	butonun texti nas�l degistirilir? v
	 * textfield�n prompttexti nas�l degistirilir? v
	 * tableviewda secilenler labela nas�l yazd�r�l�r? X
	 * controllere id nas�l atan�r? v
	 * butonlar�n eventler� nas�l atan�r scenebuilderda v
	 *labela fx:id nas�l atan�r?v
	 *kul_adi textfield�na fx:id nas�l atan�r?
	 *tabelviewa fx:id nas�l verilir?
	 *tableview�n editable �zelli�i nedir?
	 *o tablonun d�zenlenip d�zenlemedi�ini belirleyen bir �zelliktir.
	 * tableView�n Table Menu Button �zelli�i nedir?
	 * tabloya s�tunu + tusuyla eklemeyi sa�layan �zelliktir.
	 * tablo s�tunlar�na id verilmesi zorunlu mudur
	 * evet. tablo s�tunlar�yla i�lem yapmak i�in tablo s�tunlar�na id vermemiz gerekmekte.
	 * tablo s�tunlar�na id nas�l verilir?
	 * tablonun s�tununun specific propertyleri nelerdir?
	 *  Editable, Sortable, Sort Type.
	 *  Sort Type�n alabilece�i de�erleri listele.
	 *  ASCENDING, DESCENDING
	 *  Table Menu Button ne i�e yrar?
	 *  kullan�c� taraf�nda belirli s�tunlar�n g�r�n�p g�r�nmeyece�ini ayarlar. true false
	 *  scenebuilderda pencerenin �nizlemesine nas�l bak�l�r?
	 *  scenebuilderdan controller s�n�f�na nas�l kodlar yap��t�r�l�r?
	 *  
	 *  
	 *
	 * */
