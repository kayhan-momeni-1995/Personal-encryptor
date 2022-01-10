package graphics;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import calculator.TextProcessor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import java.awt.SystemColor;

public class MainWindow extends JFrame {
	
	private static final long serialVersionUID = -7185258066666349819L;
	private JPanel contentPane;
	private JPasswordField textField;
	
	@SuppressWarnings("deprecation")
	public MainWindow()
	{
		MainWindow self = this;
		ImageIcon saveIcon = new ImageIcon(this.getClass().getResource("/save.png"));
		ImageIcon loadIcon = new ImageIcon(this.getClass().getResource("/load.png"));
		ImageIcon okIcon = new ImageIcon(this.getClass().getResource("/ok.png"));
		ImageIcon successIcon = new ImageIcon(this.getClass().getResource("/tick.png"));
		ImageIcon errorIcon = new ImageIcon(this.getClass().getResource("/Cross.png"));

		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight()-104;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(0, 0, (int)width, (int)height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		
		JLabel lblInput = new JLabel("Input");
		lblInput.setBounds(6, 6, 37, 16);
		contentPane.add(lblInput);
		
		JTextArea editorPane = new JTextArea();
		JTextArea editorPane_1 = new JTextArea();

		editorPane.addKeyListener(new KeyListener(){

			@Override
			public void keyTyped(KeyEvent e)
			{
				editorPane_1.setText("");				
			}

			@Override
			public void keyPressed(KeyEvent e)
			{				
				editorPane_1.setText("");				
			}

			@Override
			public void keyReleased(KeyEvent e)
			{		
				editorPane_1.setText("");				
			}
			
		});
		editorPane.setBackground(SystemColor.activeCaptionBorder);
		editorPane.setToolTipText("");
		editorPane.setBounds(-23, 363, (int)width-12, (int)height/2-75);
		contentPane.add(editorPane);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(6, (int)height/2-35, (int)width-12, 12);
		contentPane.add(separator);
		
		JLabel lblOutput = new JLabel("Output");
		lblOutput.setBounds(6, (int)height/2-20, 48, 16);
		contentPane.add(lblOutput);
		
		editorPane_1.setBackground(SystemColor.window);
		editorPane_1.setEditable(false);
		editorPane_1.setBounds(6, (int)height/2+5, (int)width-12, (int)height/2-75);
		contentPane.add(editorPane_1);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(100, 6, 63, 16);
		contentPane.add(lblPassword);
		
		textField = new JPasswordField();
		textField.addKeyListener(new KeyListener(){

			@Override
			public void keyTyped(KeyEvent e)
			{
				editorPane_1.setText("");				
			}

			@Override
			public void keyPressed(KeyEvent e)
			{				
				editorPane_1.setText("");				
			}

			@Override
			public void keyReleased(KeyEvent e)
			{		
				editorPane_1.setText("");				
			}
			
		});
		textField.setEnabled(true);
		textField.setEditable(true);
		textField.setBounds(165, 0, 150, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnEncrypt = new JRadioButton("Encrypt");
		JRadioButton rdbtnDycrypt = new JRadioButton("Decrypt");
		JButton btnLoad = new JButton("Load");
		JButton btnSave = new JButton("Save");
		JButton btnGo = new JButton("Encrypt");

		rdbtnEncrypt.setSelected(true);
		rdbtnEncrypt.setBounds(363, 2, 79, 23);
		rdbtnEncrypt.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				btnLoad.setEnabled(false);
				btnSave.setEnabled(true);
				btnGo.setText("Encrypt");
				editorPane_1.setText("");
				if (rdbtnEncrypt.isSelected())
				{
					rdbtnDycrypt.setSelected(false);

				}
				else
				{
					rdbtnEncrypt.setSelected(true);
					
				}
			}
		});
		contentPane.add(rdbtnEncrypt);
		
		rdbtnDycrypt.setBounds(449, 2, 89, 23);
		rdbtnDycrypt.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				btnLoad.setEnabled(true);
				btnSave.setEnabled(false);
				btnGo.setText("Decrypt");
				editorPane_1.setText("");
				if (rdbtnDycrypt.isSelected())
					rdbtnEncrypt.setSelected(false);
				else
					rdbtnDycrypt.setSelected(true);
			}
		});
		contentPane.add(rdbtnDycrypt);
		
		btnGo.setIcon(okIcon);
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if (rdbtnEncrypt.isSelected())
				{
					editorPane_1.setText(TextProcessor.encrypt(editorPane.getText(), textField.getText()));
				}
				else
				{
					editorPane_1.setText(TextProcessor.decrypt(editorPane.getText(), textField.getText()));
				}
				textField.setText("");
			}
		});
		btnGo.setBounds(6, (int)height-65, (int)width-12, 40);
		contentPane.add(btnGo);
		
		JScrollPane scrollPane = new JScrollPane(editorPane);
		scrollPane.setBounds(6, 34, (int)width-102, (int)height/2-75);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane(editorPane_1);
		scrollPane_1.setBounds(6, (int)height/2+5, (int)width-102, (int)height/2-75);
		contentPane.add(scrollPane_1);
		
		btnLoad.setEnabled(false);
		btnLoad.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFileChooser fc = new JFileChooser();
			    FileNameExtensionFilter filter1 = new FileNameExtensionFilter("Encrypted file", "enc");
			    fc.addChoosableFileFilter(filter1);
			    fc.setApproveButtonText("Load");
			    fc.setAcceptAllFileFilterUsed(false);
				int returnVal = fc.showOpenDialog(self);
				if (returnVal==0)
				{
					File file = fc.getSelectedFile();
					if (file.getAbsolutePath().endsWith("enc"))
					{
						FileInputStream fis = null;
						try {
							fis = new FileInputStream(file.getAbsolutePath());
						} catch (FileNotFoundException e1) {
							e1.printStackTrace();
						}
						ObjectInputStream ois = null;
						try {
							ois = new ObjectInputStream(fis);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						try {
							editorPane.setText((String) ois.readObject());
						} catch (ClassNotFoundException | IOException e1) {
							e1.printStackTrace();
						}
						try {
							ois.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(self, "File loaded successfully.", "File loaded", JOptionPane.PLAIN_MESSAGE, successIcon);
					}
					else
					{
						JOptionPane.showMessageDialog(self, "File has not been loaded successfully.", "LOADING ERROR", JOptionPane.PLAIN_MESSAGE, errorIcon);
					}
				}
			}
		});
		btnLoad.setIcon(loadIcon);
		btnLoad.setBounds((int)width-90, 34, 85, (int)height/2-75);
		contentPane.add(btnLoad);
		
		btnSave.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFileChooser fc = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Encrypted filed", "enc");
				fc.setFileFilter(filter);
				fc.setAcceptAllFileFilterUsed(false);
				int returnVal = fc.showSaveDialog(self);
				if (returnVal==0)
				{
					File file = fc.getSelectedFile();
					String file_name = file.toString();
					if (!file_name.endsWith(".enc"))
						file_name += ".enc";
					
					file = new File(file_name);
					FileOutputStream fos = null;
					try
					{
						fos = new FileOutputStream(file.getAbsolutePath());
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					ObjectOutputStream oos = null;
					try {
						oos = new ObjectOutputStream(fos);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						oos.writeObject(editorPane_1.getText());
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						oos.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					JOptionPane.showMessageDialog(self, "File saved successfully.", "File saved", JOptionPane.PLAIN_MESSAGE, successIcon);
				}
			}
		});
		btnSave.setIcon(saveIcon);
		btnSave.setBounds((int)width-90, (int)height/2+5, 85, (int)height/2-75);
		contentPane.add(btnSave);
		show();
	}
}
