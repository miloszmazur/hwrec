package hwc;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Mainframe extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame gui;
	
	public static void main(String[]args)
	{
		new Mainframe();
	}
	public Mainframe()
	{
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        } catch (UnsupportedLookAndFeelException ex){
        }
		init();
	}
	public void init()
	{
		gui = new JFrame();
		gui.setSize(800,600);
		gui.setTitle("Hand Writing Recognition");
		gui.setVisible(true);
		gui.setLocationRelativeTo(null);
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
