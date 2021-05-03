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
import java.io.FileReader;
import java.awt.event.ActionEvent;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.event.*;
import java.awt.event.*;


import java.io.*;
import com.wcohen.ss.JaroWinkler;
import com.wcohen.ss.api.StringDistance;

public class CompareTxt extends MainFrame{
	
	static JaroWinkler jaro = new JaroWinkler();
	static StringDistance distanceChecker = jaro.getDistance();
	public static double similarity =  distanceChecker.score(Result_1, Result_2);
	
}
