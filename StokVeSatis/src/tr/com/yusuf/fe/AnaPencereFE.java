package tr.com.yusuf.fe;
import javax.swing.JFrame;
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
