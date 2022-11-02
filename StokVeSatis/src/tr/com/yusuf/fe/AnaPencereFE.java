package tr.com.yusuf.fe;
import javax.swing.JFrame;
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
		JTabbedPane tabs = new JTabbedPane();
		JMenuBar bar = initBar();
		//add(tabs);
		setJMenuBar(bar);//
		setTitle("Sat�� ve Stok Program�");
		pack();
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
		JMenuBar bar = new JMenuBar();
		JMenu dosyaMenu = new JMenu("Dosya");
		bar.add(dosyaMenu);
		JMenuItem jMenuItemCikis = new JMenuItem("��k��");
		dosyaMenu.add(jMenuItemCikis);
		JMenu urunlerMenu = new JMenu("�r�nler");
		bar.add(urunlerMenu);
		JMenuItem urunEkleItem = new JMenuItem("�r�n Ekle");
		urunlerMenu.add(urunEkleItem);
		JMenuItem kategoriEkleItem = new JMenuItem("Kategori Ekle");
		urunlerMenu.add(kategoriEkleItem);
		urunlerMenu.addSeparator();
		JMenuItem urunDuzenleItem = new JMenuItem("�r�n d�zenle");
		urunlerMenu.add(urunDuzenleItem);
		JMenuItem kategoriDuzenleItem = new JMenuItem("Kategori D�zenle");
		urunlerMenu.add(kategoriDuzenleItem);
		
		
		
		
		return bar;
	}
	@Override
	public JTabbedPane initTabs() {
		return null;
	}
}
