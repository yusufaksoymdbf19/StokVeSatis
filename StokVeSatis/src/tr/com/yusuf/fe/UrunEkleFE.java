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
public class UrunEkleFE extends JDialog implements FeInterfaces{
	public UrunEkleFE() {
		
	}
	@Override
	public void initPencere() {
		JPanel panel = initPanel();
		add(panel);
		setTitle("urun ekleyiniz.");
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		
	}
	@Override 
	public JPanel initPanel() {
		JPanel panel = new JPanel(new GridLayout(5,2));
		JLabel jLabelAdi = new JLabel("Adi:",JLabel.RIGHT);
		JTextField jTextFieldAdi = new JTextField(10);
		JComboBox jComboBoxKategori = new JComboBox();
		panel.add(jLabelAdi);
		panel.add(jTextFieldAdi);
		panel.add(jComboBoxKategori);
		/////
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