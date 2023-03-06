// Java program to convert from 
// rupee to the dollar and vice-versa 
// using Java Swing 

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class Project { 

	// Function to convert from rupee 
	// to the dollar and vice-versa 
	// using Java Swing 
	public static void converter() 
	{ 

		// Creating a new frame using JFrame 
		JFrame f = new JFrame("INR CONVERTER"); 

		// Creating two labels 
		JLabel l1, l2; 

		// Creating two text fields. 
		// One for rupee and one for 
		// the dollar 
		JTextField t1, t2; 

		// Creating three buttons 
		JButton b1, b2, b3, b4, b5, b6, b7,b8,b9; 

		// Naming the labels and setting 
		// the bounds for the labels 
		l1 = new JLabel("Amount:"); 
		l1.setBounds(20, 40, 60, 30); 
		l2 = new JLabel("Result:"); 
		l2.setBounds(200, 40, 60, 30); 

		// Initializing the text fields with 
		// 0 by default and setting the 
		// bounds for the text fields 
		t1 = new JTextField("0"); 
		t1.setBounds(80, 40, 100, 30); 
		t2 = new JTextField("0"); 
		t2.setBounds(250, 40, 100, 30); 

		// Creating a button for INR, 
		// one button for the dollar 
		// and one button to close 
		// and setting the bounds 
		b1 = new JButton("AED"); 
		b1.setBounds(80, 100, 60, 15); 
		b2 = new JButton("Dollar"); 
		b2.setBounds(250, 100, 60, 15); 
		b4 = new JButton("YEN"); 
		b4.setBounds(250, 130, 60, 15); 
		b5 = new JButton("YUAN"); 
		b5.setBounds(80, 130, 60, 15); 
		b6 = new JButton("SNG DLR"); 
		b6.setBounds(250, 160, 60, 15); 
		b7 = new JButton("EURO"); 
		b7.setBounds(80, 160, 60, 15); 
		b8 = new JButton("POUNDS"); 
		b8.setBounds(250, 190, 60, 15); 
		b9 = new JButton("RUBLE"); 
		b9.setBounds(80, 190, 60, 15); 
		b3 = new JButton("close"); 
		b3.setBounds(170, 220, 60, 30); 

		// Adding action listener 
		b1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{ 
				// Converting to double 
				double d 
					= Double.parseDouble(t1.getText()); 

				// Converting AED to RUPEES
				double d1 = (d * 22.25); 

				// Getting the string value of the 
				// calculated value 
				String str1 = String.valueOf(d1); 

				// Placing it in the text box 
				t2.setText(str1); 
			} 
		}); 

		// Adding action listener 
		b2.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{ 
				// Converting to double 
				double d2 
					= Double.parseDouble(t1.getText()); 

				// converting Dollars to rupees 
				double d3 = (d2 * 81.71); 

				// Getting the string value of the 
				// calculated value 
				String str2 = String.valueOf(d3); 

				// Placing it in the text box 
				t2.setText(str2); 
			} 
		}); 


		b4.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{ 
				// Converting to double 
				double d4 
					= Double.parseDouble(t1.getText()); 

				// converting YEN to rupees 
				double d5 = (d4 * 0.60); 

				// Getting the string value of the 
				// calculated value 
				String str3 = String.valueOf(d5); 

				// Placing it in the text box 
				t2.setText(str3); 
			} 
		}); 
		b5.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{ 
				// Converting to double 
				double d6 
					= Double.parseDouble(t1.getText()); 

				// converting YUAN to rupees 
				double d7 = (d6 * 11.83); 

				// Getting the string value of the 
				// calculated value 
				String str4 = String.valueOf(d7); 

				// Placing it in the text box 
				t2.setText(str4); 
			} 
		}); 

		b6.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{ 
				// Converting to double 
				double d8 
					= Double.parseDouble(t1.getText()); 

				// converting SGP DLR to rupees 
				double d9 = (d8 * 60.74); 

				// Getting the string value of the 
				// calculated value 
				String str5 = String.valueOf(d9); 

				// Placing it in the text box 
				t2.setText(str5); 
			} 
		}); 

		b7.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{ 
				// Converting to double 
				double d10
					= Double.parseDouble(t1.getText()); 

				// converting EURO to rupees 
				double d11 = (d10 * 87.03); 

				// Getting the string value of the 
				// calculated value 
				String str6 = String.valueOf(d11); 

				// Placing it in the text box 
				t2.setText(str6); 
			} 
		}); 

		b8.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{ 
				// Converting to double 
				double d12
					= Double.parseDouble(t1.getText()); 

				// converting POUNDS to rupees 
				double d13 = (d12 * 98.34); 

				// Getting the string value of the 
				// calculated value 
				String str7 = String.valueOf(d13); 

				// Placing it in the text box 
				t2.setText(str7); 
			} 
		}); 

		b9.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{ 
				// Converting to double 
				double d14
					= Double.parseDouble(t1.getText()); 

				// converting ruble to rupees 
				double d15 = (d14 * 1.08); 

				// Getting the string value of the 
				// calculated value 
				String str8 = String.valueOf(d15); 

				// Placing it in the text box 
				t2.setText(str8); 
			} 
		}); 

		// Action listener to close the form 
		b3.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) 
			{ 
				f.dispose(); 
			} 
		}); 

		// Default method for closing the frame 
		f.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) 
			{ 
				System.exit(0); 
			} 
		}); 

		// Adding the created objects 
		// to the form 
		f.add(l1); 
		f.add(t1); 
		f.add(l2); 
		f.add(t2); 
		f.add(b1); 
		f.add(b2); 
		f.add(b3); 
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);

		f.setLayout(null); 
		f.setSize(400, 300); 
		f.setVisible(true); 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		converter(); 
	} 
} 

