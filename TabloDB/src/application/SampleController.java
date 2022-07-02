package application;

import java.net.URL;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.scene.control.cell.PropertyValueFactory;
import com.MySQL.Baglanti.Baglanti;
import javafx.scene.input.MouseEvent;
public class SampleController {
	//baglantýnýn kurulmasý icin unutulmamasý gereken seylerden biri?
	//constructorda baglantýyý baslatmak.
	public SampleController(){
		connection=Baglanti.BaglantiKur();
	}

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Kayitlar> tableView1;

    @FXML
    private TableColumn<Kayitlar, Integer> columnId;
    //generic turler hangi tipleri kabul eder
    //wrapper classlarý kabul eder.
    //wrapper class nedir?
    //nesnesi primitive tipleri içeren bir sýnýftýr saran sýnýf...
    
    
    @FXML
    private TableColumn<Kayitlar, String> columnKul_Ad;

    @FXML
    private TableColumn<Kayitlar, String> columnSifre;

    @FXML
    private TableColumn<Kayitlar, String> columnYetki; //neden Integerdan Stringe cevirdik?tamsayýnýn String gozukmesi için yapýldý.

    @FXML
    private Label labelId;

    @FXML
    private Label labelYetki;

    @FXML
    private TextField textFieldKulAdi;

    @FXML
    private TextField textFieldSifre;

    @FXML
    private Button buttonRefresh;
    //sql islemler icin gerekli olan degiskenler nelerdir?
    Connection connection=null;
    PreparedStatement preparedStatement=null;
    ResultSet resultSet=null;
    String stringSql;
    //degiskenler tanýmlandýktan sonra ne yapýlacak?
    //degerleri getir fonksiyonu yazýlacak
    //nedeni?
    //refresh butonu için.
    ObservableList<Kayitlar> observableList;
    @FXML
    public void buttonRefresh_OnAction(ActionEvent actionEvent){//yenileme islemi nasýl yapýlýr?
    	degerleriGetir(tableView1);
    }
    public void degerleriGetir(TableView<Kayitlar> tableView){
    	stringSql = "select * from login";
    	observableList = FXCollections.observableArrayList();
    	try{
    		preparedStatement = connection.prepareStatement(stringSql);
    		resultSet = preparedStatement.executeQuery();
    		while(resultSet.next()){ //sonuc kümesi varsa
    			observableList.add(new Kayitlar(resultSet.getInt("id"), resultSet.getString("kul_ad"), resultSet.getString("sifre"), resultSet.getInt("yetki")));
    		}//once sonuc kümesini observableList'e at ObservableList<Kayitlar> turunde, observableListtekileri tabloya ekle.
    		columnKul_Ad.setCellValueFactory(new PropertyValueFactory<>("kul_adi"));
    		columnId.setCellValueFactory(new PropertyValueFactory<>("id"));
    		columnSifre.setCellValueFactory(new PropertyValueFactory<>("sifre"));
    		columnYetki.setCellValueFactory(new PropertyValueFactory<>("yetki"));
    		tableView1.setItems(observableList);
    	}catch(Exception exception){
    		System.out.println(exception.getMessage().toString());
    	}
    }
    public void tableView1_OnMouseClicked(MouseEvent mouseEvent){
    	//tablodaki satýra týklanýldýgýnda degerlerin textFieldlara, labellara gelmesi olayý nasýl yapýlýr?
    	// labelda, yetki 0ise yonetici, 1ise kullanici, yazsýn...
    	//tablodaki satýra týklanýldýgýnda degerlerin textFieldlara, labellara gelmesi olayý nasýl yapýlýr?
    	Kayitlar kayit = new Kayitlar();
    	kayit = (Kayitlar) tableView1.getItems().get(tableView1.getSelectionModel().getSelectedIndex()); //secili indis nasýl alýnýr? 
    	labelId.setText(String.valueOf(kayit.getId()));
    	textFieldKulAdi.setText(kayit.getKul_adi());
    	textFieldSifre.setText(kayit.getSifre());
    	// labelda, yetki 0ise yonetici, 1ise kullanici, yazýlmasý nasýl yapýlýr?
    	if(kayit.getYetki()==0){
    		labelYetki.setText("Yönetici");
    	}
    	else if(kayit.getYetki()==1){
    		labelYetki.setText("Kullanýcý");
    	}
    }
    	
    //degerleri getiren fonksiyon nasýl yazýlýr?
    //baglantý icin gerekli olan sql ifadelerini tanýmla.
    //
    @FXML
    void initialize() {
        degerleriGetir(tableView1);

    }
}
