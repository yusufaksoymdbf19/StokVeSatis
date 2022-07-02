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
    //tableView�n t�r� ne olacak?
    //Kayitlar
    
    @FXML
    private TableColumn<Kayitlar, Integer> columnId;
    //tablo s�tunlar�n�n tipi ne olmak zorunda?
    //sol taraf� tableView�n t�r�, sa� taraf� s�tunun o s�n�fda tan�mland��� t�r olmak zorunda.
    //Generic t�r i�erisine hangi tur kabul eder?
    //Wrapper Class yaz�lmas� gerek. ya da d�� bir s�n�f...
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
    	preparedStatement.executeUpdate(); //preparedStatement.executeUpdate() komutu hangi islemlerde kullan�l�r?//ekle,sil,guncelle, digerinde executeQuery kullan�l�r.
    	label1.setText("kullanici ekleme islemi yapildi.");
    	}catch(Exception exception){
    		System.out.println(exception.getMessage().toString());
    	}
    }
    
    	
    @FXML
    public void buttonGuncelleVeriTabani_OnAction(ActionEvent actionEvent){//kullan�c� ad� textfielddakine esit olan�n  sifresini degistirme nas�l yap�l�r? 
    	stringSql = "update login set sifre=? where kul_ad=?";
    	try{
    		preparedStatement = connection.prepareStatement(stringSql);
    		preparedStatement.setString(1,textFieldSifre.getText().trim());
    		preparedStatement.setString(2,textFieldKulAdi.getText().trim());
    		preparedStatement.executeUpdate();
    		label1.setText("Guncelleme islemi yap�ld�.");
    	}catch(Exception exception){
    		System.out.println(exception.getMessage().toString());
    	}
    }
    public void buttonSilVeriTabani_OnAction(ActionEvent actionEvent){
    	//veritaban�ndan kullan�c� ad� ve sifresi verileni silme nas�l yap�l�r?
    	stringSql = "delete from login where kul_ad=? and sifre=?";
    	try{
    		preparedStatement = connection.prepareStatement(stringSql);
    		preparedStatement.setString(1,textFieldKulAdi.getText().trim());
    		preparedStatement.setString(2, textFieldSifre.getText().trim());
    		preparedStatement.executeUpdate();//executeUpdate hangi islemlerde kullan�l�r? update, delete, ...
    		label1.setText("silme islemi yapildi.");
    	}catch(Exception exception){
    		System.out.println(exception.getMessage().toString());
    	}
    }
    	
    		
    	
    	
    public void buttonGirisYap_OnAction(ActionEvent actionEvent){
    	//girilen kullan�c� ad� ve sifre veritaban�ndakiyle dogruysa herhangi bir islem yap�lmas� nas�l yap�l�r???
    	stringSql="select * from login where kul_ad=? and sifre=?";
    	
    	try{
    		
    		//sorgu stringindeki soru i�aretleri nedir?
    		//parametredir.
    		
    		preparedStatement = connection.prepareStatement(stringSql);
    		preparedStatement.setString(1, textFieldKulAdi.getText().trim());//parametrelere atama nas�l yap�l�r?
    		preparedStatement.setString(2, textFieldSifre.getText().trim());
    		resultSet = preparedStatement.executeQuery(); //sorgulama isleminde hangi execute kullan�l�r? preparedStatement.executeQuery(); kullan�l�r.
    		if(!resultSet.next()){//sorguda donen sonu� yoksa yap�lacak islemler nereye yaz�l�r?
    		//kullan�c� ad� veya sifre dogrulama
    			label1.setText("kullan�c� ad� veya sifre hatal�.");
    		}
    		else{
    			//sorgu sonucundakileri labela nas�l yazd�r�l�r?
    			//resultSet.getString(1); //tabloda 1. sutundaki deger nas�l al�n�r?
    			//resultSet.getString(1); yaz�lmasa sonuc al�n�r m�? denedim al�nd�.
    			//sutunlar hangi say�dan ba�l�yor? //1den..
    			//sutun say�s�n� a��nca hata verir mi? resultSet.getString(0), resultSet.getString(5) gibi olursa?
    			//evet out of range hatas� veriyor.
    			
    			label1.setText(resultSet.getString("kul_ad") +" " +
    						   resultSet.getString("sifre") +" " +
    						   resultSet.getString("yetki"));
    		    label1.setText(resultSet.getString(1)+" + "+ resultSet.getString(2) +" + "+ resultSet.getString(3)+" +"+ resultSet.getString(4));
    		}
    	}catch(Exception exception){
    		label1.setText(exception.getMessage().toString());
    	}
    }
    			
    		
    		
    public TableViewController(){//mysql baglant� kurma nas�l yap�l�r devam� 2
    	connection = MySQLBaglanti.Baglanti();
    	
    }
    Connection connection = null;
    PreparedStatement preparedStatement = null;//sorgu ifadesi nereye yaz�l�r?
    //getirilen sonuc nereye aktar�l�r?
    ResultSet resultSet=null;
    String stringSql;
    //veriler hangi degiskende tutulur?
    ObservableList<Kayitlar> observableList;
    @FXML
    void buttonEkle_OnClick(ActionEvent event) {//ekleme islemi nas�l yap�l�r?
    	
    	observableList = FXCollections.observableArrayList();
    	observableList.add(new Kayitlar(5,textFieldKulAdi.getText(),textFieldSifre.getText()));
    	tableView1.getItems().addAll(observableList);
    	
    }

    @FXML
    void buttonGoster_OnClick(ActionEvent event) {
    //gosterme yani deger getirme nas�l yap�l�r?
    //tableViewda se�ilen bir sat�r asl�nda nedir?
    //tableviewda se�ilen bir sat�r asl�nda classd�r.
    //tabloda se�ilen sat�r nas�l g�sterilir?
    //tablodan deger almak icin �ncelikle ne kullan�l�r?
    //kay�tlar nesnesi kullan�l�r.
    Kayitlar kayitlar = new Kayitlar();
    //secilen sat�r -1den farkl�ysa al.
    	if(tableView1.getSelectionModel().getSelectedIndex()!=-1){
    		kayitlar = (Kayitlar) tableView1.getItems().get(tableView1.getSelectionModel().getSelectedIndex());
    		label1.setText(kayitlar.getId()+" " + kayitlar.getKul_ad() +" "+kayitlar.getSifre());
    	}else{
    		label1.setText("herhangi bir kay�t secilmedi..");
    	}//secilmediginde uyar� vermesi nas�l yap�l�r?
    }
    		  
    
    

    @FXML
    void buttonGuncelle_OnClick(ActionEvent event) {
    	//guncelleme nas�l yap�l�r?
    	//once se�ilen indis al�n�r
    	//sonra yeni kay�t olusturarak atama yap�l�r.
    	Kayitlar kayitlar = new Kayitlar();
    	if(tableView1.getSelectionModel().getSelectedIndex()!=-1){
    			kayitlar = (Kayitlar) tableView1.getItems().get(tableView1.getSelectionModel().getSelectedIndex());
    			int secilenId = kayitlar.getId();
    			//yeni kay�t nas�l olusturulur?
    			//s�n�f olusturarak.
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
        //tooltip eklemek i�in hangi fonksiyonun i�ine kod yaz�l�r?
        //tooltip eklemek i�in initialize()fonksiyonunun i�ine kod yaz�l�r.
        //ekleme butonuna tooltip eklemek i�in ne yaz�l�r?
        buttonEkle.setTooltip(new Tooltip("bu bir ekleme butonudur..."));
        //arkaplan� gri resim i�eren silme i�lemi yapar yaz�s� yapan bir  Tooltip nas�l eklenir?
        //tooltip nesnesi nas�l olu�turulur?
        Tooltip tooltip = new Tooltip();
        //tooltipin arkaplan� nas�l gri yap�l�r?
        tooltip.setStyle("-fx-background-color: gray;");
        //tooltipin yaz�s� nas�l silme i�lemi yapar olarak ayarlan�r?
        tooltip.setText("Silme islemi yaparrr...");
        //Tooltipe resim ekleme nas�l yap�l�r?
        Image image = new Image(getClass().getResourceAsStream("resim1.png"));
        tooltip.setGraphic(new ImageView(image));
        buttonSil.setTooltip(tooltip);
        //tabloya veri g�ndermek i�in ne yap�l�r? 
        //observableliste nas�l veri atan�r?
        //kay�t ekleme nas�l yap�l�r?
        //kullan�c� ad� admin idsi 1, sifresi 12345 olan bir kay�t ekle...
        observableList = FXCollections.observableArrayList();
        observableList.add(new Kayitlar(1,"admin", "12345"));
        //idsi 2 kullan�c�ad� yusuf sifre 3210 olan bir kay�t ekle.
        observableList.add(new Kayitlar(2, "yusuf", "3210"));
        //idsi 3, kullan�c� ad� root, sifresi 123 olan kay�t gir.
        observableList.add(new Kayitlar(3,"root","123"));
        //tabloya kay�t nas�l eklenir?
        //ilk id column ismi ikincisi classdaki isim.
        columnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnKul_Adi.setCellValueFactory(new PropertyValueFactory<>("kul_ad")); 
        columnSifre.setCellValueFactory(new PropertyValueFactory<>("sifre"));
        tableView1.setItems(observableList);
        //PropertyValueFactory hatas� nas�l ��z�l�r?
        //module-info.javada opens to b�l�m�ne javafx.base ekleyerek...
        //columnKul_Ad� s�tunu g�z�kmemesi i�in ne yap�l�r?
       // columnKul_Adi.setVisible(false);
       //Kayitlar.java s�n�f� neden gereklidir?
       //��nk� crud i�lemlernde laz�m olacak.
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
	 *  kay�tlar i�in harici s�n�f nas�l olu�turulur?
	 *  
	 *
	 * */
