package An_Package;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.event.*;
import java.awt.event.*;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtLoadPath_2;
	private JTextField txtLoadPath_1;
	public static String Result_1;
	public static String Result_2;
	private final Action action = new SwingAction();
	public static String SEXSEXBOJI;
	private JTextField yourname;
	public static double ResultA;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();

					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("Analogous");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uBE44\uAD50\uBB3C");
		label.setBounds(345, 32, 62, 18);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\uC791\uC5C5\uBB3C");
		lblNewLabel.setBounds(33, 32, 62, 18);
		contentPane.add(lblNewLabel);
		
		
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(33, 54, 300, 424);
		contentPane.add(scrollPane_1);
		
		JTextPane txt_result_1 = new JTextPane();
		scrollPane_1.setViewportView(txt_result_1);
		
		JButton Load_button1 = new JButton("Load");
		Load_button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String path = txtLoadPath_1.getText();

				

				 try

			     {

			      BufferedReader br = new BufferedReader(new FileReader(path));

			      String line = "";

			      String s = "";

			      while((line = br.readLine()) != null)

			      {

			       s += line + "\n";

			      }

			      txt_result_1.setText(s);

			      if (br != null)

			       br.close();

			     }

			     catch (Exception k)

			     {

			      JOptionPane.showMessageDialog(null, k.getMessage());

			     }
			}
		
			});
		
		Load_button1.setBounds(268, 491, 65, 27);
		contentPane.add(Load_button1);
		
		txtLoadPath_1 = new JTextField();
		txtLoadPath_1.setText("C:\\Users\\Public\\save1.txt");
		txtLoadPath_1.setColumns(10);
		txtLoadPath_1.setBounds(33, 491, 218, 27);
		contentPane.add(txtLoadPath_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(345, 54, 300, 424);
		contentPane.add(scrollPane_2);
		
		JTextPane txt_result_2 = new JTextPane();
		scrollPane_2.setViewportView(txt_result_2);
		Result_2 = txt_result_2.getText();
		
		txtLoadPath_2 = new JTextField();
		txtLoadPath_2.setText("C:\\Users\\Public\\save2.txt");
		txtLoadPath_2.setColumns(10);
		txtLoadPath_2.setBounds(345, 491, 218, 27);
		contentPane.add(txtLoadPath_2);
		
		JButton Load_button2 = new JButton("Load");
		Load_button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String path = txtLoadPath_2.getText();

				

				 try

			     {

			      BufferedReader br = new BufferedReader(new FileReader(path));

			      String line = "";

			      String s = "";

			      while((line = br.readLine()) != null)

			      {

			       s += line + "\n";

			      }

			      txt_result_2.setText(s);

			      if (br != null)

			       br.close();

			     }

			     catch (Exception k)

			     {

			      JOptionPane.showMessageDialog(null, k.getMessage());

			     }
			}
		});
		Load_button2.setBounds(580, 491, 65, 27);
		contentPane.add(Load_button2);
		
		JButton Save1_Button = new JButton("\uC791\uC5C5\uBB3C");
		Save1_Button.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				Result_1 = txt_result_1.getText();

				
			}
		});
		Save1_Button.setBounds(665, 91, 107, 27);
		contentPane.add(Save1_Button);
		
		JButton Save2_Button = new JButton("\uBE44\uAD50\uBB3C");
		Save2_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Result_2 = txt_result_2.getText();
			}
		});
		Save2_Button.setBounds(665, 128, 107, 27);
		contentPane.add(Save2_Button);
		
		yourname = new JTextField();
		yourname.setBounds(665, 220, 108, 21);
		contentPane.add(yourname);
		yourname.setColumns(10);
		
		JLabel lblSimilarity = new JLabel("similarity");
		lblSimilarity.setBounds(665, 195, 57, 15);
		contentPane.add(lblSimilarity);

		
		
		JButton Starting = new JButton("\uAC80\uC0AC \uC2DC\uC791");
		Starting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CompareTxt AS = new CompareTxt();
				ResultA = AS.similarity*100;
				yourname.setText(""+(int)ResultA+"%");
			}
		});
		Starting.setBounds(665, 58, 107, 23);
		contentPane.add(Starting);
		
		JButton save_1 = new JButton("save");
		save_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String path = txtLoadPath_1.getText();

				try
				{
					FileWriter fstream = new FileWriter(path, true);
					FileOutputStream fos = new FileOutputStream(path);
					BufferedWriter out = new BufferedWriter(fstream);
					out.write(txt_result_1.getText());
					out.close();
				}
				catch(Exception k)
				{
					k.printStackTrace();
				}
			}
		});
		save_1.setBounds(268, 524, 65, 27);
		contentPane.add(save_1);
		

		
		
		JButton save_2 = new JButton("save");
		save_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String path = txtLoadPath_2.getText();

				try
				{
					FileWriter fstream = new FileWriter(path, true);
					FileOutputStream fos = new FileOutputStream(path);
					BufferedWriter out = new BufferedWriter(fstream);
					out.write(txt_result_2.getText());
					out.close();
				}
				catch(Exception k)
				{
					k.printStackTrace();
				}
			}
		});
		save_2.setBounds(580, 524, 65, 27);
		contentPane.add(save_2);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}

