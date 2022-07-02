package application;

import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.time.LocalDate;
import javafx.scene.input.KeyEvent;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
//baglanti yapýcý fnksiyona yap ve degisken turlerini belirle...
import com.VeriTabaniIslem.VeriTabaniIslemleri;
import javafx.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Date;
//observable list nasýl import edilir? 
public class TabloDBController {
	public TabloDBController(){
		connection = VeriTabaniIslemleri.Baglan();
	}
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonSorgula;

    @FXML
    private DatePicker datePickerBitis;

    @FXML
    private DatePicker datePickerBaslangic;

    @FXML
    private TextField textField1;

    @FXML
    private ComboBox<String> comboBox1;

    @FXML
    private TableView<KayitlarIslemler> tableView1;

    @FXML
    private TableColumn<KayitlarIslemler, Integer> columniID;

    @FXML
    private TableColumn<KayitlarIslemler, String> columnUser;

    @FXML
    private TableColumn<KayitlarIslemler, String> columnIslemAciklama;

    @FXML
    private TableColumn<KayitlarIslemler, Double> columnIslemTutar;

    @FXML
    private TableColumn<KayitlarIslemler, LocalDate> columnIslemTarih;
    PreparedStatement preparedStatement=null;
    Connection connection=null;
    ResultSet resultSet=null;
    String sqlIfadesi=null;
    @FXML
    public void textField1_OnKeyPressed(KeyEvent keyEvent){
    	if(textField1.getText().equals("")){
    		sqlIfadesi = "select * from islemler";
    	}else{
    		sqlIfadesi = "select * from islemler where islemAciklama like '%"+textField1.getText()+"%' or user like '%"+textField1.getText()+"%'";
    	}
    	DegerleriGetir(tableView1,sqlIfadesi);
    }
    
    	
    @FXML
    public void textField1_OnAction(ActionEvent actionEvent){
    
    }
    @FXML
    public void comboBox1_OnAction(ActionEvent actionEvent){}
    @FXML 
    public void buttonSorgula_OnAction(ActionEvent actionEvent){
    /*	sqlIfadesi = "select * from islemler where islemTarih > '"+datePickerBaslangic.getValue()+"' and islemTarih < '"+datePickerBitis.getValue()+"'";
    	DegerleriGetir(tableView1, sqlIfadesi);*/
    	
    	//parametre ile nasýl yapýlýr?
    	sqlIfadesi = "select * from islemler where islemTarih > ? and islemTarih < ?";
    	try{
    		preparedStatement = connection.prepareStatement(sqlIfadesi);
    		preparedStatement.setDate(1,Date.valueOf(datePickerBaslangic.getValue()));
    		preparedStatement.setDate(2,Date.valueOf(datePickerBitis.getValue()));
    		DegerleriGetir2(tableView1, preparedStatement);
    	}catch(Exception exception){
    		System.out.println(exception.getMessage().toString());
    	}finally{
    		System.out.println("buttonSorgula_OnActiona parametreli basýldý.");
    	}	
    	
    } 
    public void DegerleriGetir2(TableView<KayitlarIslemler> tableView1, PreparedStatement preparedStatement){
    	try{
    		 ObservableList<KayitlarIslemler> observableList = FXCollections.observableArrayList();
    		// preparedStatement = connection.prepareStatement(sqlSorgusu);
    		 resultSet = preparedStatement.executeQuery();
    		 while(resultSet.next()){
    		 //resultset icindeki sutun isimleri tablodakiyle ayný olacak.
    			 observableList.add(new KayitlarIslemler(resultSet.getInt("iID"), resultSet.getString("user"), resultSet.getString("islemAciklama"), resultSet.getDouble("islemTutar"), resultSet.getDate("islemTarih")));
    		 }
    		 columniID.setCellValueFactory(new PropertyValueFactory<>("iId"));//burdayým..
    		 columnUser.setCellValueFactory(new PropertyValueFactory<>("user"));
    		 columnIslemAciklama.setCellValueFactory(new PropertyValueFactory<>("islemAciklama"));
    		 columnIslemTutar.setCellValueFactory(new PropertyValueFactory<>("islemTutar"));
    		 columnIslemTarih.setCellValueFactory(new PropertyValueFactory<>("islemTarih"));
    		 tableView1.setItems(observableList);
    	}catch(Exception exception){
    		System.out.println(exception.getMessage().toString());
    	}
    }
    public void DegerleriGetir(TableView<KayitlarIslemler> tableView1, String sqlSorgusu){
    	try{
    		 ObservableList<KayitlarIslemler> observableList = FXCollections.observableArrayList();
    		 preparedStatement = connection.prepareStatement(sqlSorgusu);
    		 resultSet = preparedStatement.executeQuery();
    		 while(resultSet.next()){
    		 //resultset icindeki sutun isimleri tablodakiyle ayný olacak.
    			 observableList.add(new KayitlarIslemler(resultSet.getInt("iID"), resultSet.getString("user"), resultSet.getString("islemAciklama"), resultSet.getDouble("islemTutar"), resultSet.getDate("islemTarih")));
    		 }
    		 columniID.setCellValueFactory(new PropertyValueFactory<>("iId"));//burdayým..
    		 columnUser.setCellValueFactory(new PropertyValueFactory<>("user"));
    		 columnIslemAciklama.setCellValueFactory(new PropertyValueFactory<>("islemAciklama"));
    		 columnIslemTutar.setCellValueFactory(new PropertyValueFactory<>("islemTutar"));
    		 columnIslemTarih.setCellValueFactory(new PropertyValueFactory<>("islemTarih"));
    		 tableView1.setItems(observableList);
    	}catch(Exception exception){
    		System.out.println(exception.getMessage().toString());
    	}
    }
    		 
    	
    @FXML
    void initialize() {
    	sqlIfadesi = "select * from islemler";
        DegerleriGetir(tableView1,sqlIfadesi);
        datePickerBaslangic.setValue(LocalDate.now());
        datePickerBitis.setValue(LocalDate.now());
        
    }
}
