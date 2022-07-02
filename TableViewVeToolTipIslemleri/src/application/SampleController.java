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

	/*+javada tablolar ile calýsmak icin class dosyasý olusturmak gerekir. d/y v
	 *-dogru.
	 *+c#da tablolar ile calýsmak icin class dosyasý olusturmak gerekir d/y v
	 *-yanlýs c#da tablolar ile calýsmak icin class dosyasý olusturmak gerekmez..
	 * +javada tablolar ile calýsmak icin class dosyasý olusturmak gerekmez. d/y v
	 * -yanlýþ, javada tablolar ile çalýþmak için class dosyasý olusturmak gerekir.
	 * +c#da tablolar ile calýsmak icin class dosyasý olusturmak gerekmez... d/y v
	 * -dogru...
	 * javada tablo icin olusturulan sýnýfda getter ve setter olmak zorundadýr. d/y v
	 * dogru
	 * javada tablo icin olusturulan sýnýfda getter ve setter olmak zorunda degildir. d/y v
	 * yanlýþ, javada tablo için olusturulan sýnýfda getter ve setter olmak zorundadýr.
	 * java c#a gore kod guvenligi acýsýndan daha iyidir. d/y v 
	 * dogru
	 * java c#da gore kod guvenligi acýsýndan daha kotudur. d/y v
	 * yanlýs, cunku tablolar icin, veritabaný için sýnýflar olusturuldugundan kod guvenligi acýsýndan daha iyidir.
	 * 		tabloya veri ekleme nasýl yapýlýr? X
	 * 		tabloda secilen satýr nasýl silinir? X 
	 * 		tabloda secilen satýr nasýl güncellenir? X
	 * 	tabloya ekle sil guncelle yapmak icin getter ve setterlar gereklidir. d/y v
	 * dogru.
	 * tabloya ekle, sil, guncelle yapmak için getter ve setterlar gerekli degildir. d/y v
	 * yanlýs, tabloya ekle, sil, guncelle yapmak icin getter ve setterlar gereklidir.
	 * eclipseda fxml dosyasý nasýl olusturulur? uygulayarak goster. ismi TableView olsun. v
	 * controller dosyasý nasýl olusturulur? ismi TableViewController olsun. uygulayarak göster. v
	 * tableview scenebuilderda TableView.fxml dosyasýna nasýl eklenir? v
	 * https://youtu.be/4R3pOu0hdWs?t=144
	 * 		tableview scenebuilderda textField nasýl eklenir? v
	 * splitpane nasýl eklenir v
	 * splitPane fit to parent nasýl yapýlýr v
	 * tableviewý dikey split panein dikey kýsmýna nasýl eklenir? v
	 * tableview'ý dikey split panein üst kýsmýna nasýl fit to parent yapýlýr? v
	 * tableview'a sütun nasýl eklenir? v
	 * sütun isimleri id, kul_adi, sifre nasýl yapýlýr? v
	 * kul_adi ve sifre icin split panein alt kýsmýna textField nasýl eklenir? v
	 * kul_adi ve sifre buton ile tableview'a nasýl eklenir? v
	 * secili olan kul_adi ve sifre buton ile tableview'da nasýl silinir? X
	 * kul_adi ve sifre buton ile tableview'a nasýl guncellenir? X
	 * 	butonun texti nasýl degistirilir? v
	 * textfieldýn prompttexti nasýl degistirilir? v
	 * tableviewda secilenler labela nasýl yazdýrýlýr? X
	 * controllere id nasýl atanýr? v
	 * butonlarýn eventlerý nasýl atanýr scenebuilderda v
	 *labela fx:id nasýl atanýr?v
	 *kul_adi textfieldýna fx:id nasýl atanýr?
	 *tabelviewa fx:id nasýl verilir?
	 *tableviewýn editable özelliði nedir?
	 *o tablonun düzenlenip düzenlemediðini belirleyen bir özelliktir.
	 * tableViewýn Table Menu Button özelliði nedir?
	 * tabloya sütunu + tusuyla eklemeyi saðlayan özelliktir.
	 * tablo sütunlarýna id verilmesi zorunlu mudur
	 * evet. tablo sütunlarýyla iþlem yapmak için tablo sütunlarýna id vermemiz gerekmekte.
	 * tablo sütunlarýna id nasýl verilir?
	 * tablonun sütununun specific propertyleri nelerdir?
	 *  Editable, Sortable, Sort Type.
	 *  Sort Typeýn alabileceði deðerleri listele.
	 *  ASCENDING, DESCENDING
	 *  Table Menu Button ne iþe yrar?
	 *  kullanýcý tarafýnda belirli sütunlarýn görünüp görünmeyeceðini ayarlar. true false
	 *  scenebuilderda pencerenin önizlemesine nasýl bakýlýr?
	 *  scenebuilderdan controller sýnýfýna nasýl kodlar yapýþtýrýlýr?
	 *  
	 *  
	 *
	 * */
