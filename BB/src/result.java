import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class result {
	ImageIcon icon[]=new ImageIcon[300];
	private JFrame frame;
	String b="9";
	String a=b+"개월";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					result window = new result();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public result() {
		icon[7]=new ImageIcon(this.getClass().getResource("/back2.jpg"));
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(517, 0, 747, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 731, 456);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("사진 들어갈곳");
		lblNewLabel_1.setBounds(223, 10, 275, 172);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(a);
		lblNewLabel_2.setBounds(183, 210, 78, 26);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(icon[7]);
		lblNewLabel.setBounds(0, 0, 731, 456);
		panel.add(lblNewLabel);
	}
}
