package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
public class ToplamController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField t1;

    @FXML
    private TextField t2;

    @FXML
    private Label l1;

    @FXML
    private Button b1;
    @FXML
    private Button buttonTemizle;
    @FXML 
    ComboBox<String> comboBox1;
    @FXML
    ListView<String> listView1;
    
    @FXML
    void buttonTemizleOnAction(ActionEvent actionEvent){
    comboBox1.getItems().add(t1.getText());
    comboBox1.getItems().add(t2.getText());
    t1.clear();
    t2.clear();
    }
    @FXML Button buttonList;
    @FXML
    void listedekileriYazdir(){//indisleri yazdir.
    /*	ObservableList<Integer> indisler;
    	indisler=listView1.getSelectionModel().getSelectedIndices();
    	for (int i : indisler) {
			System.out.println(i);
		}*/
		ObservableList<Integer> list;
		list = listView1.getSelectionModel().getSelectedIndices();
		for(int j : list){
		System.out.println("indis:" + Integer.toString(j));
		}
		comboBox1.getItems().add(3,"merhaba"); //duzelt...
    }
    
    @FXML
    void listeItemleriYazdir(){
    /*	ObservableList<String> itemler;
    	itemler=listView1.getSelectionModel().getSelectedItems();
    	for (String i : itemler) {
			System.out.println(i);
		}*/
		/*ObservableList<String> list2 = listView1.getSelectionModel().getSelectedItems();
		for(String k : list2){
			System.out.println("item: " + k);
		}*/
		//comboBox1.getItems().add(3,"merhaba"); //duzelt...
		//comboBox1.getItems().remove(3);
		//comboBox1.getItems().remove("bddg");
		//comboBox1.getItems().removeAll("bddg");
		//comboBox1.getItems().removeAll("deneme1", "deneme2");
		//l1.setText(comboBox1.getSelectionModel().getSelectedItem());
		//l1.setText(Integer.toString(comboBox1.getSelectionModel().getSelectedIndex()));
		//l1.setText(comboBox1.getSelectionModel().getSelectedItem());
		//l1.setText(comboBox1.getItems().get(comboBox1.getSelectionModel().getSelectedIndex()));
		//l1.setText(comboBox1.getItems().get(4));
		//l1.setText(Integer.toString(comboBox1.getItems().indexOf("deneme1"))); //219
	//	l1.setText(Integer.toString(comboBox1.getItems().lastIndexOf("deneme1")));

    }

    @FXML
    void topla(ActionEvent event) {
    
    	Double s1 = Double.parseDouble(t1.getText());
    	Double s2 = Double.parseDouble(t2.getText());
    	Double toplam = s1 + s2;
    	l1.setText(Double.toString(toplam));
    }

    @FXML
    void initialize() {
    String[] dizim = new String[]{"dene1", "dene2", "dene3"};
   ObservableList<String> obs = FXCollections.observableArrayList("obs1", "obs2", "obs3", "obs4", "obs5"); //223
    comboBox1.setPromptText("deger seçiniz.");
    listView1.getSelectionModel().setSelectionMode(javafx.scene.control.SelectionMode.MULTIPLE);
    listView1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    	for(int i =0;i<20;i++){
    	listView1.getItems().add("aaaa");
    	comboBox1.getItems().add("bddg");
    	comboBox1.getItems().add("deneme1");
    	comboBox1.getItems().add("deneme2");
    	}
    	comboBox1.getItems().addAll(dizim);
    	comboBox1.getItems().addAll(obs); //223
    	
    }
}
