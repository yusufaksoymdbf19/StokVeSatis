package tr.com.yusuf.fe;
import tr.com.yusuf.interfaces.FeInterfaces;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;
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