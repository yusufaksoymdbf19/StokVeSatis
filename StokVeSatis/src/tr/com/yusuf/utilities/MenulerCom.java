package tr.com.yusuf.utilities;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

import tr.com.yusuf.fe.KategoriEkleFE;
import tr.com.yusuf.fe.UrunEkleFE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MenulerCom {
	public static JMenuBar initBar() {
		JMenuBar bar = new JMenuBar();
		JMenu dosyaMenu = new JMenu("Dosya");
		bar.add(dosyaMenu);
		JMenuItem jMenuItemCikis = new JMenuItem("Çýkýþ");
		dosyaMenu.add(jMenuItemCikis);
		JMenu urunlerMenu = new JMenu("Ürünler");
		bar.add(urunlerMenu);
		JMenuItem urunEkleItem = new JMenuItem("Ürün ekle");
		urunlerMenu.add(urunEkleItem);
		JMenuItem kategoriEkleItem = new JMenuItem("Kategori ekle");
		urunlerMenu.add(kategoriEkleItem);
		urunlerMenu.addSeparator();
		JMenuItem urunDuzenleItem = new JMenuItem("Ürün düzenle");
		urunlerMenu.add(urunDuzenleItem);
		JMenuItem kategoriDuzenleItem = new JMenuItem("Kategori Düzenle");
		urunlerMenu.add(kategoriDuzenleItem);
		urunEkleItem.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
						new UrunEkleFE();
					}
				});
			}
		});

		kategoriEkleItem.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
						new KategoriEkleFE();
					}
				});
			}
		});
		
		return bar;
	}
}
