package tr.com.yusuf.fe;
import tr.com.yusuf.interfaces.FeInterfaces;
import java.awt.GridLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import javax.swing.BorderFactory;
import javax.swing.JButton;
public class UrunEkleFE extends JDialog implements FeInterfaces{
	public UrunEkleFE() {
		initPencere();
	}
	@Override
	public void initPencere() {
		JPanel panel = initPanel();
		panel.setBorder(BorderFactory.createTitledBorder("Ürün kayýt alaný"));
		add(panel);
		setTitle("urun ekleyiniz.");
		pack();
		setModalityType(DEFAULT_MODALITY_TYPE);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		
	}
	@Override 
	public JPanel initPanel() {
		JPanel panel = new JPanel(new GridLayout(5,2));
		JLabel jLabelAdi = new JLabel("Ürün Adý:",JLabel.RIGHT);
		JTextField jTextFieldAdi = new JTextField(10);
		JComboBox<String> jComboBoxKategori = new JComboBox<String>();
		JLabel jLabelKategori = new JLabel("Kategori seçiniz:",JLabel.RIGHT);
		JDateChooser jDateChooser = new JDateChooser();
		JLabel jLabelTarih = new JLabel("Tarih:",JLabel.RIGHT);
		JLabel jLabelFiyat = new JLabel("Fiyat giriniz:",JLabel.RIGHT);
		JTextField jTextFieldFiyat = new JTextField(10);
		JButton jButtonKaydet = new JButton("Kaydet");
		JButton jButtonIptal = new JButton("Iptal");
		
		panel.add(jLabelAdi);
		panel.add(jTextFieldAdi);
		panel.add(jLabelKategori);
		panel.add(jComboBoxKategori);
		panel.add(jLabelTarih);
		panel.add(jDateChooser);
		panel.add(jLabelFiyat);
		panel.add(jTextFieldFiyat);
		panel.add(jButtonKaydet);
		panel.add(jButtonIptal);
		
		return panel;
	}
	@Override
	public JMenuBar initBar() {
		return null;
	}
	@Override
	public JTabbedPane initTabs() {
		return null;
	}
}