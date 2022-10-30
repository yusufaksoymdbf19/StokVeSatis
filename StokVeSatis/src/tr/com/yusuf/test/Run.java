package tr.com.yusuf.test;
import javax.swing.SwingUtilities;
import tr.com.yusuf.fe.AnaPencereFE;
public class Run {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new AnaPencereFE();
			}
		});
	}
}
