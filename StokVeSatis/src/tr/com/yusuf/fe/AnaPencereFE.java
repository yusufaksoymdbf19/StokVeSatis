package tr.com.yusuf.fe;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
import tr.com.yusuf.interfaces.FeInterfaces;
public class AnaPencereFE extends JFrame implements FeInterfaces {
	public AnaPencereFE() {
		initPencere();
	}
	@Override
	public void initPencere() {
		JTabbedPane tabs = new JTabbedPane();
		JMenuBar bar = new JMenuBar();
		//add(tabs);
		setJMenuBar(bar);//
		setTitle("Satýþ ve Stok Programý");
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	@Override
	public JPanel initPanel() {
		return null;
	}
	@Override
	public JMenuBar initBar() {
		JMenuBar bar = new JMenuBar();
		JMenu dosyaMenu = new JMenu("Dosya");
		bar.add(dosyaMenu);
		return bar;
	}
	@Override
	public JTabbedPane initTabs() {
		return null;
	}
}
