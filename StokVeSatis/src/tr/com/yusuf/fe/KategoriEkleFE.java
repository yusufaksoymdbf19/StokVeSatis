package tr.com.yusuf.fe;

import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import tr.com.yusuf.interfaces.FeInterfaces;

public class KategoriEkleFE extends JDialog implements FeInterfaces {

	public KategoriEkleFE() {
		initPencere();
	}

	@Override
	public void initPencere() {
		setTitle("Kategori Ekle");
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setModalityType(DEFAULT_MODALITY_TYPE);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		
		
		
	}

	@Override
	public JPanel initPanel() {
		
		return null;
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
