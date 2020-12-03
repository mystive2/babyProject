import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;


public class CUS {

	JFrame frame;
	int k=0,jan=0;
	String value2="아이가 선택되지 않았습니다",value10="공란",value11="공란",value12="공란",value13="공란",value14="공란";
	ImageIcon icon[]=new ImageIcon[300];
	private JTextField textField;
	private JTextField textField_1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CUS window = new CUS();
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
	public CUS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		customer2 customer = new customer2();
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 960);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		icon[0]=new ImageIcon(this.getClass().getResource("/develop.jpg"));
		icon[1]=new ImageIcon(this.getClass().getResource("/bear.jpg"));
		icon[2]=new ImageIcon(this.getClass().getResource("/menu1.jpg"));
		icon[3]=new ImageIcon(this.getClass().getResource("/menu2.jpg"));
		icon[4]=new ImageIcon(this.getClass().getResource("/menu3.jpg"));
		icon[5]=new ImageIcon(this.getClass().getResource("/menu4.jpg"));
		icon[6]=new ImageIcon(this.getClass().getResource("/menu5.jpg"));
		icon[7]=new ImageIcon(this.getClass().getResource("/back2.jpg"));
		
		icon[101]=new ImageIcon(this.getClass().getResource("/huhu.gif"));
		icon[102]=new ImageIcon(this.getClass().getResource("/pic3.gif"));
		

		///장업공간/////////////////
		
	
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(517, 0, 747, 495);
		frame.getContentPane().add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(100, 46, 187, 158);
		panel_2_1.add(lblNewLabel_6);
		
		JLabel label_1 = new JLabel("\uC774\uB984 :");
		label_1.setBounds(350, 59, 57, 15);
		panel_2_1.add(label_1);
		
		JLabel lblNewLabel_7 = new JLabel(value2);
		lblNewLabel_7.setBounds(419, 59, 57, 15);
		panel_2_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\uC0DD\uB144\uC6D4\uC77C :");
		lblNewLabel_8.setBounds(323, 84, 57, 15);
		panel_2_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label"); //내용 추가할것 작업1
		lblNewLabel_9.setBounds(402, 84, 57, 15);
		panel_2_1.add(lblNewLabel_9);
		panel_2_1.setVisible(false);
		
	
		
		////////////작업 공간////////////////////////////
		
	
		
		
		
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(517, 0, 747, 495);
		frame.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\uC0AC\uC9C4");
		lblNewLabel_2.setBounds(35, 25, 321, 250);
		lblNewLabel_2.setIcon(icon[101]);
		panel1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(489, 58, 140, 29);
		panel1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(489, 226, 140, 29);
		panel1.add(textField_1);
		
		panel1.setVisible(false);
		
		JComboBox comboBox = new JComboBox(new String[] {"남자","여자"});
		JComboBox comboBox_1 = new JComboBox(new String[] {"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"});
		comboBox_1.setBounds(489, 120, 79, 21);
		panel1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox(new String[] {"01","02","03","04","05","06","07","08","09","10","11","12"});
		comboBox_2.setBounds(599, 120, 48, 21);
		panel1.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox(new String[] {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"});
		comboBox_3.setBounds(672, 120, 48, 21);
		panel1.add(comboBox_3);
		comboBox.setBounds(489, 172, 140, 29);
		panel1.add(comboBox);
		
		JPanel panel4 = new JPanel();
		panel4.setBounds(0, 494, 1268, 426);
		frame.getContentPane().add(panel4);
		panel4.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 32));
		textArea.setText("                    \uC774\uBBF8\uC9C0 \uC124\uBA85\uCE78");
		textArea.setBounds(0, 0, 1268, 240);
		panel4.add(textArea);
		panel4.setVisible(false);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(517, 0, 747, 495);
		frame.getContentPane().add(panel3);
		panel3.setLayout(null);
		
		
		
		JLabel lblNewLabel_5 = new JLabel("d");
		lblNewLabel_5.setBounds(158, 47, 509, 372);
		
		panel3.add(lblNewLabel_5);
		lblNewLabel_5.setIcon(icon[102]);
		panel3.setVisible(false);
		
		
		
		
		JButton btnNewButton_5 = new JButton("\uC800\uC7A5\uD558\uAE30");    //아이등록의 저장하기버튼
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nametxt=textField.getText();
				String weighttxt=textField_1.getText();
				String gendertxt=comboBox.getSelectedItem().toString();
				String yeartxt=comboBox_1.getSelectedItem().toString();
				String monthtxt=comboBox_2.getSelectedItem().toString();
				String daytxt=comboBox_3.getSelectedItem().toString();
				System.out.println(textField.getText());
				System.out.println(gendertxt);
				String birthtxt=yeartxt+monthtxt+daytxt;
				customer2.createTable(nametxt);
				//customer2.createCustomer(nametxt, yeartxt, monthtxt, daytxt, gendertxt);
				customer2.createCustomer2(nametxt, birthtxt, gendertxt,weighttxt);
				JOptionPane.showMessageDialog(null, "Your data has been saved succesfully");
				panel1.setVisible(false);
				
				
			}
		});
		btnNewButton_5.setBounds(562, 403, 140, 36);
		panel1.add(btnNewButton_5);
		
		JLabel lblNewLabel_3 = new JLabel("\uC774\uB984 :");
		lblNewLabel_3.setFont(new Font("휴먼모음T", Font.BOLD, 25));
		lblNewLabel_3.setBounds(408, 51, 67, 36);
		panel1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uC0DD\uB144\uC6D4\uC77C :");
		lblNewLabel_4.setFont(new Font("휴먼모음T", Font.BOLD, 25));
		lblNewLabel_4.setBounds(368, 113, 119, 29);
		panel1.add(lblNewLabel_4);
		
		JLabel label = new JLabel("\uC131\uBCC4 :");
		label.setFont(new Font("휴먼모음T", Font.BOLD, 25));
		label.setBounds(408, 165, 67, 36);
		panel1.add(label);
		
		JLabel label_2 = new JLabel("\uCCB4\uC911 :");
		label_2.setFont(new Font("휴먼모음T", Font.BOLD, 25));
		label_2.setBounds(408, 219, 67, 36);
		panel1.add(label_2);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1280, 960);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(0, 0, 518, 100);
		btnNewButton.setIcon(icon[2]);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[][] data=customer2.getCustomers2();
//System.out.println(data[jan][0]);
				panel1.setVisible(true);
				//panel_2.setVisible(false);
				panel3.setVisible(false);
				panel4.setVisible(false);
				
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton);
		
		
		
		
		JButton btnNewButton_6 = new JButton("\uD560\uC218\uC5C6\uC74C");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				k-=1;
			}
		});
		btnNewButton_6.setBounds(218, 269, 249, 91);
		panel4.add(btnNewButton_6);
		
		JButton button = new JButton("\uD560\uC218\uC788\uC74C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				k+=1;
			}
		});
		button.setBounds(667, 269, 249, 91);
		panel4.add(button);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(0, 99, 518, 100);
		btnNewButton_1.setIcon(icon[3]);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panel2 = new JPanel();
				panel2.setBounds(517, 0, 747, 495);
				String[][] data=customer2.getCustomers2();
				String[] headers = new String[] {"이름","생년월일","성별","체중"};
				
				DefaultTableModel model=new DefaultTableModel(data,headers);
				JTable table = new JTable(model);
				table.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {			
						int index=table.getSelectedRow();
						TableModel model=table.getModel();
						String value1=model.getValueAt(index, 0).toString();
						String value9=model.getValueAt(index, 1).toString();
						String value8=model.getValueAt(index, 3).toString();
						System.out.println(value1);	
						System.out.println(value9);
						value11=value8;
						value10=value9;
						value2=value1;
						jan=index;
					}
				});
				
				panel2.setLayout(null);
				table.setRowHeight(30);
				table.setFont(new Font ("Sanserif", Font.BOLD, 15));
				table.setAlignmentX(0);
				table.setSize(800,600);
				table.setPreferredScrollableViewportSize(new Dimension(800, 600));
				
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(0, 56, 763, 633);
				panel2.add(scrollPane);
				
				
				frame.getContentPane().add(panel2);
				
				JButton btnNewButton_7 = new JButton("\uC0C8\uB85C\uACE0\uCE68");
				btnNewButton_7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String[][] data=customer2.getCustomers2();
						DefaultTableModel model=new DefaultTableModel(data,headers);
						model.fireTableDataChanged();
					}
				});
				btnNewButton_7.setBounds(12, 10, 97, 23);
				panel2.add(btnNewButton_7);
				panel1.setVisible(false);
				panel3.setVisible(false);
				//panel_3.setEnabled(false);
				panel2.setVisible(true);
				
				
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(icon[4]);
		btnNewButton_2.setBounds(0, 198, 518, 100);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				//k= DB로부터 birth값 넘겨 받고 오늘날짜에서 birth값 빼고 30으로 나누기..
				panel1.setVisible(false);
				//panel_2.setVisible(false);
				panel3.setVisible(true);
				panel4.setVisible(true);
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setIcon(icon[5]);
		btnNewButton_3.setBounds(0, 297, 518, 100);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b[]=value10.split("");
				String year=b[0]+b[1]+b[2]+b[3];
				String month=b[4]+b[5];
				String day=b[6]+b[7];
				
				
				
				customer2.getCustomers();
				String cvc=jj.getBdd();
				
				
				
				
				
				System.out.println("aaa");
				
				JFrame rep=new JFrame();
				
				rep.setBounds(517, 0, 747, 495);
				rep.getContentPane().setLayout(null);
				rep.setVisible(true);
				rep.setBounds(517, 0, 747, 495);
				rep.getContentPane().setLayout(null);
				rep.getContentPane().setLayout(null);
//				
				JButton tts=new JButton();
				tts.setBounds(400, 50, 78, 26);
				tts.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rep.dispose();
					}
				});
				
				JPanel panel77 = new JPanel();
				panel77.setBounds(0, -20, 747, 495);
				rep.getContentPane().add(panel77);
				panel77.setLayout(null);
			panel77.add(tts);
				
			String[][] data2=customer2.getCustomers2();
			
				JLabel last_1 = new JLabel("사진 들어갈곳");
				last_1.setIcon(icon[1]);
				last_1.setBounds(0, 0, 300, 300);
							
				JLabel rname = new JLabel(value2);
				rname.setBounds(320, 50, 78, 26);
				
				System.out.println(value10);
				
				System.out.println(year); //
				System.out.println(month);//
				System.out.println(day);//
				
				JLabel rbirth1 = new JLabel(year);
				rbirth1.setBounds(320, 100, 70, 26);
				
				JLabel rbirth2 = new JLabel(month);
				rbirth2.setBounds(390, 100, 70, 26);
				
				JLabel rbirth3 = new JLabel(day);
				rbirth3.setBounds(460, 100, 70, 26);

				JLabel rweight = new JLabel(value11);
				rweight.setBounds(320, 150, 70, 26);
				
				JLabel aweight = new JLabel(cvc);
				aweight.setBounds(390, 150, 70, 26);
				
				//String birthno=
				panel77.add(rname);
				panel77.add(rbirth1);
				panel77.add(rbirth2);
				panel77.add(rbirth3);
				panel77.add(rweight);
				panel77.add(aweight);
				panel77.add(last_1);
				JLabel last = new JLabel("New label");
				last.setIcon(icon[7]);
				last.setBounds(0, -20, 747, 495); 
				last.setLayout(null);
				panel77.add(last);
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setIcon(icon[6]);
		btnNewButton_4.setBounds(0, 397, 518, 100);
		
		panel.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 494, 1268, 426);
		lblNewLabel.setIcon(icon[0]);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(519, 0, 749, 497);
		lblNewLabel_1.setIcon(icon[1]);
		panel.add(lblNewLabel_1);
		
		
		
		
		
		
		
		
	}
}
