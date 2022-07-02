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
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
//import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.cell.PropertyValueFactory;
import com.yusuf.MySQLBaglanti;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class TableViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Kayitlar> tableView1;
    //tableViewýn türü ne olacak?
    //Kayitlar
    
    @FXML
    private TableColumn<Kayitlar, Integer> columnId;
    //tablo sütunlarýnýn tipi ne olmak zorunda?
    //sol tarafý tableViewýn türü, sað tarafý sütunun o sýnýfda tanýmlandýðý tür olmak zorunda.
    //Generic tür içerisine hangi tur kabul eder?
    //Wrapper Class yazýlmasý gerek. ya da dýþ bir sýnýf...
    @FXML
    private TableColumn<Kayitlar, String> columnKul_Adi;

    @FXML
    private TableColumn<Kayitlar, String> columnSifre;

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
    private Button buttonRefresh;
    @FXML
    private Button buttonGoster;
    @FXML
    private Button buttonGirisYap;
    @FXML
    private Label label1;
    @FXML
    private Button buttonGuncelleVeriTabani;
    @FXML 
    private Button buttonSilVeriTabani;
    @FXML
    private Button buttonEkleVeriTabani;
    
    @FXML 
    void buttonEkleVeriTabani_OnAction(ActionEvent actionEvent){
    	stringSql = "insert into login(kul_ad, sifre, yetki) values (?,?,?)";
    	try{
    	preparedStatement = connection.prepareStatement(stringSql);
    	preparedStatement.setString(1,textFieldKulAdi.getText().trim());
    	preparedStatement.setString(2,MySQLBaglanti.md5Sifrele(textFieldSifre.getText().trim()));
    	preparedStatement.setString(3,"1");
    	preparedStatement.executeUpdate(); //preparedStatement.executeUpdate() komutu hangi islemlerde kullanýlýr?//ekle,sil,guncelle, digerinde executeQuery kullanýlýr.
    	label1.setText("kullanici ekleme islemi yapildi.");
    	}catch(Exception exception){
    		System.out.println(exception.getMessage().toString());
    	}
    }
    
    	
    @FXML
    public void buttonGuncelleVeriTabani_OnAction(ActionEvent actionEvent){//kullanýcý adý textfielddakine esit olanýn  sifresini degistirme nasýl yapýlýr? 
    	stringSql = "update login set sifre=? where kul_ad=?";
    	try{
    		preparedStatement = connection.prepareStatement(stringSql);
    		preparedStatement.setString(1,textFieldSifre.getText().trim());
    		preparedStatement.setString(2,textFieldKulAdi.getText().trim());
    		preparedStatement.executeUpdate();
    		label1.setText("Guncelleme islemi yapýldý.");
    	}catch(Exception exception){
    		System.out.println(exception.getMessage().toString());
    	}
    }
    public void buttonSilVeriTabani_OnAction(ActionEvent actionEvent){
    	//veritabanýndan kullanýcý adý ve sifresi verileni silme nasýl yapýlýr?
    	stringSql = "delete from login where kul_ad=? and sifre=?";
    	try{
    		preparedStatement = connection.prepareStatement(stringSql);
    		preparedStatement.setString(1,textFieldKulAdi.getText().trim());
    		preparedStatement.setString(2, textFieldSifre.getText().trim());
    		preparedStatement.executeUpdate();//executeUpdate hangi islemlerde kullanýlýr? update, delete, ...
    		label1.setText("silme islemi yapildi.");
    	}catch(Exception exception){
    		System.out.println(exception.getMessage().toString());
    	}
    }
    	
    		
    	
    	
    public void buttonGirisYap_OnAction(ActionEvent actionEvent){
    	//girilen kullanýcý adý ve sifre veritabanýndakiyle dogruysa herhangi bir islem yapýlmasý nasýl yapýlýr???
    	stringSql="select * from login where kul_ad=? and sifre=?";
    	
    	try{
    		
    		//sorgu stringindeki soru iþaretleri nedir?
    		//parametredir.
    		
    		preparedStatement = connection.prepareStatement(stringSql);
    		preparedStatement.setString(1, textFieldKulAdi.getText().trim());//parametrelere atama nasýl yapýlýr?
    		preparedStatement.setString(2, textFieldSifre.getText().trim());
    		resultSet = preparedStatement.executeQuery(); //sorgulama isleminde hangi execute kullanýlýr? preparedStatement.executeQuery(); kullanýlýr.
    		if(!resultSet.next()){//sorguda donen sonuç yoksa yapýlacak islemler nereye yazýlýr?
    		//kullanýcý adý veya sifre dogrulama
    			label1.setText("kullanýcý adý veya sifre hatalý.");
    		}
    		else{
    			//sorgu sonucundakileri labela nasýl yazdýrýlýr?
    			//resultSet.getString(1); //tabloda 1. sutundaki deger nasýl alýnýr?
    			//resultSet.getString(1); yazýlmasa sonuc alýnýr mý? denedim alýndý.
    			//sutunlar hangi sayýdan baþlýyor? //1den..
    			//sutun sayýsýný aþýnca hata verir mi? resultSet.getString(0), resultSet.getString(5) gibi olursa?
    			//evet out of range hatasý veriyor.
    			
    			label1.setText(resultSet.getString("kul_ad") +" " +
    						   resultSet.getString("sifre") +" " +
    						   resultSet.getString("yetki"));
    		    label1.setText(resultSet.getString(1)+" + "+ resultSet.getString(2) +" + "+ resultSet.getString(3)+" +"+ resultSet.getString(4));
    		}
    	}catch(Exception exception){
    		label1.setText(exception.getMessage().toString());
    	}
    }
    			
    		
    		
    public TableViewController(){//mysql baglantý kurma nasýl yapýlýr devamý 2
    	connection = MySQLBaglanti.Baglanti();
    	
    }
    Connection connection = null;
    PreparedStatement preparedStatement = null;//sorgu ifadesi nereye yazýlýr?
    //getirilen sonuc nereye aktarýlýr?
    ResultSet resultSet=null;
    String stringSql;
    //veriler hangi degiskende tutulur?
    ObservableList<Kayitlar> observableList;
    @FXML
    void buttonEkle_OnClick(ActionEvent event) {//ekleme islemi nasýl yapýlýr?
    	
    	observableList = FXCollections.observableArrayList();
    	observableList.add(new Kayitlar(5,textFieldKulAdi.getText(),textFieldSifre.getText()));
    	tableView1.getItems().addAll(observableList);
    	
    }

    @FXML
    void buttonGoster_OnClick(ActionEvent event) {
    //gosterme yani deger getirme nasýl yapýlýr?
    //tableViewda seçilen bir satýr aslýnda nedir?
    //tableviewda seçilen bir satýr aslýnda classdýr.
    //tabloda seçilen satýr nasýl gösterilir?
    //tablodan deger almak icin öncelikle ne kullanýlýr?
    //kayýtlar nesnesi kullanýlýr.
    Kayitlar kayitlar = new Kayitlar();
    //secilen satýr -1den farklýysa al.
    	if(tableView1.getSelectionModel().getSelectedIndex()!=-1){
    		kayitlar = (Kayitlar) tableView1.getItems().get(tableView1.getSelectionModel().getSelectedIndex());
    		label1.setText(kayitlar.getId()+" " + kayitlar.getKul_ad() +" "+kayitlar.getSifre());
    	}else{
    		label1.setText("herhangi bir kayýt secilmedi..");
    	}//secilmediginde uyarý vermesi nasýl yapýlýr?
    }
    		  
    
    

    @FXML
    void buttonGuncelle_OnClick(ActionEvent event) {
    	//guncelleme nasýl yapýlýr?
    	//once seçilen indis alýnýr
    	//sonra yeni kayýt olusturarak atama yapýlýr.
    	Kayitlar kayitlar = new Kayitlar();
    	if(tableView1.getSelectionModel().getSelectedIndex()!=-1){
    			kayitlar = (Kayitlar) tableView1.getItems().get(tableView1.getSelectionModel().getSelectedIndex());
    			int secilenId = kayitlar.getId();
    			//yeni kayýt nasýl olusturulur?
    			//sýnýf olusturarak.
    			Kayitlar kayitlarYeni = new Kayitlar(secilenId,textFieldKulAdi.getText(),textFieldSifre.getText());
    			int secilenIndis = tableView1.getSelectionModel().getSelectedIndex();
    			tableView1.getItems().set(secilenIndis,kayitlarYeni);
    	}
    	else{
    		label1.setText("hicbir deger secilmedi...");
    	}			
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
        //tooltip eklemek için hangi fonksiyonun içine kod yazýlýr?
        //tooltip eklemek için initialize()fonksiyonunun içine kod yazýlýr.
        //ekleme butonuna tooltip eklemek için ne yazýlýr?
        buttonEkle.setTooltip(new Tooltip("bu bir ekleme butonudur..."));
        //arkaplaný gri resim içeren silme iþlemi yapar yazýsý yapan bir  Tooltip nasýl eklenir?
        //tooltip nesnesi nasýl oluþturulur?
        Tooltip tooltip = new Tooltip();
        //tooltipin arkaplaný nasýl gri yapýlýr?
        tooltip.setStyle("-fx-background-color: gray;");
        //tooltipin yazýsý nasýl silme iþlemi yapar olarak ayarlanýr?
        tooltip.setText("Silme islemi yaparrr...");
        //Tooltipe resim ekleme nasýl yapýlýr?
        Image image = new Image(getClass().getResourceAsStream("resim1.png"));
        tooltip.setGraphic(new ImageView(image));
        buttonSil.setTooltip(tooltip);
        //tabloya veri göndermek için ne yapýlýr? 
        //observableliste nasýl veri atanýr?
        //kayýt ekleme nasýl yapýlýr?
        //kullanýcý adý admin idsi 1, sifresi 12345 olan bir kayýt ekle...
        observableList = FXCollections.observableArrayList();
        observableList.add(new Kayitlar(1,"admin", "12345"));
        //idsi 2 kullanýcýadý yusuf sifre 3210 olan bir kayýt ekle.
        observableList.add(new Kayitlar(2, "yusuf", "3210"));
        //idsi 3, kullanýcý adý root, sifresi 123 olan kayýt gir.
        observableList.add(new Kayitlar(3,"root","123"));
        //tabloya kayýt nasýl eklenir?
        //ilk id column ismi ikincisi classdaki isim.
        columnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnKul_Adi.setCellValueFactory(new PropertyValueFactory<>("kul_ad")); 
        columnSifre.setCellValueFactory(new PropertyValueFactory<>("sifre"));
        tableView1.setItems(observableList);
        //PropertyValueFactory hatasý nasýl çözülür?
        //module-info.javada opens to bölümüne javafx.base ekleyerek...
        //columnKul_Adý sütunu gözükmemesi için ne yapýlýr?
       // columnKul_Adi.setVisible(false);
       //Kayitlar.java sýnýfý neden gereklidir?
       //çünkü crud iþlemlernde lazým olacak.
       //
         
        
        
        
        
        
       
    }
     @FXML
    void buttonRefresh_OnAction(ActionEvent actionEvent){
    	DegerleriGetir(tableView1);
    }
    void DegerleriGetir(TableView<Kayitlar> tableView1){
    	stringSql = "select * from login";
    	observableList = FXCollections.observableArrayList();
    	try{
    		preparedStatement = connection.prepareStatement(stringSql);
    		resultSet = preparedStatement.executeQuery();
    		while(resultSet.next()){
    			observableList.add(new Kayitlar(resultSet.getInt("id"), resultSet.getString("kul_ad"), resultSet.getString("sifre")));
    		}
    		columnId.setCellValueFactory(new PropertyValueFactory<>("id"));
    		columnKul_Adi.setCellValueFactory(new PropertyValueFactory<>("kul_ad"));
    		columnSifre.setCellValueFactory(new PropertyValueFactory<>("sifre"));
    		tableView1.setItems(observableList);
    	}catch(Exception exception){
    		System.out.println(exception.getMessage().toString());
    	}
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
	 *  kayýtlar için harici sýnýf nasýl oluþturulur?
	 *  
	 *
	 * */
