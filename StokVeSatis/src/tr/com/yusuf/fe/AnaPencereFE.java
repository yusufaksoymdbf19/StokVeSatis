package tr.com.yusuf.fe;
import javax.swing.JFrame;
import tr.com.yusuf.utilities.MenulerCom;
import javax.swing.JMenuItem;
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
		//JTabbedPane tabs = new JTabbedPane();
		JMenuBar bar = initBar();
		//add(tabs);
		setJMenuBar(bar);//
		setTitle("Satýþ ve Stok Programý");
		//pack();
		setSize(600,250);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	@Override
	public JPanel initPanel() {
		JPanel panel = new JPanel();
		return panel;
	}
	@Override
	public JMenuBar initBar() {
		JMenuBar bar = MenulerCom.initBar();
		return bar;
	}
	@Override
	public JTabbedPane initTabs() {
		return null;
	}
}
