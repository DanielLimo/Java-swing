package limo;
import java.awt.event.*;//	Provides interfaces and classes for dealing with different types of events
import javax.swing.*;// package which is stored in javax which has number of classes like jlabel,jtextfield,jbutton,etc.
import java.awt.*;//	Contains all of the classes for creating user interfaces and for painting graphics and images
public class CalculatorApp extends JFrame implements ActionListener{
	//Creating a frame
	 static JFrame Frame;
	 //creating a textfield
	 static JTextField t;
	 //storing the operators and the operands
	 String s0, s1, s2;
	 //creating a constructor 
	 CalculatorApp()
	    {
	        s0 = s1 = s2 = "";
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Frame = new JFrame("Calculator");
	
	 try {
        
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
     }
     catch (Exception e) {
         System.err.println(e.getMessage());
     }
	 //creating a new object for the class
	  CalculatorApp c = new CalculatorApp();
	  t = new JTextField(16);
	  t.setEditable(false);
	  // Creating  buttons
	  
	  JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bd, bm, be, beq, beq1;
	  b0 = new JButton("0");
      b1 = new JButton("1");
      b2 = new JButton("2");
      b3 = new JButton("3");
      b4 = new JButton("4");
      b5 = new JButton("5");
      b6 = new JButton("6");
      b7 = new JButton("7");
      b8 = new JButton("8");
      b9 = new JButton("9");
      beq1 = new JButton("=");
      ba = new JButton("/");
      bs = new JButton("+");
      bd = new JButton("-");
      bm = new JButton("*");
      beq = new JButton("C");
      be = new JButton(".");
     // Creating a panel
      
      JPanel Panel = new JPanel();
       //adding the action listeners which is The listener interface for receiving action events
      bm.addActionListener(c);
      bd.addActionListener(c);
      bs.addActionListener(c);
      ba.addActionListener(c);
      b9.addActionListener(c);
      b8.addActionListener(c);
      b7.addActionListener(c);
      b6.addActionListener(c);
      b5.addActionListener(c);
      b4.addActionListener(c);
      b3.addActionListener(c);
      b2.addActionListener(c);
      b1.addActionListener(c);
      b0.addActionListener(c);
      be.addActionListener(c);
      beq.addActionListener(c);
      beq1.addActionListener(c);
      // Adding the elements to the Panel
      Panel.add(t);
      Panel.add(ba);
      Panel.add(b1);
      Panel.add(b2);
      Panel.add(b3);
      Panel.add(bs);
      Panel.add(b4);
      Panel.add(b5);
      Panel.add(b6);
      Panel.add(bm);
      Panel.add(b7);
      Panel.add(b8);
      Panel.add(b9);
      Panel.add(bd);
      Panel.add(be);
      Panel.add(b0);
      Panel.add(beq);
      Panel.add(beq1);
      // setting the background color of the panel
      Panel.setBackground(Color.black);
      //  add the panel o the frame
      Frame.add(Panel);
      // setting the size of the Panel
      Frame.setSize(200, 220);
      Frame.show();
}
	
	public void actionPerformed(ActionEvent e) {
		 String s = e.getActionCommand();
		 
	       
	        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
	            
	            if (!s1.equals(""))
	                s2 = s2 + s;
	            else
	                s0 = s0 + s;
	 
	           
	            t.setText(s0 + s1 + s2);
	        }
	        else if (s.charAt(0) == 'C') {
	            
	            s0 = s1 = s2 = "";
	 
	           
	            t.setText(s0 + s1 + s2);
	        }
	        else if (s.charAt(0) == '=') {
	 
	            double te;
	 
	            
	            if (s1.equals("+"))
	                te = (Double.parseDouble(s0) + Double.parseDouble(s2));
	            else if (s1.equals("-"))
	                te = (Double.parseDouble(s0) - Double.parseDouble(s2));
	            else if (s1.equals("/"))
	                te = (Double.parseDouble(s0) / Double.parseDouble(s2));
	            else
	                te = (Double.parseDouble(s0) * Double.parseDouble(s2));
	 
	            
	            t.setText(s0 + s1 + s2 + "=" + te);
	 
	            
	            s0 = Double.toString(te);
	 
	            s1 = s2 = "";
	        }
	        else {
	            
	            if (s1.equals("") || s2.equals(""))
	                s1 = s;
	            
	            else {
	                double te;
	 if (s1.equals("+"))
	                    te = (Double.parseDouble(s0) + Double.parseDouble(s2));
	                else if (s1.equals("-"))
	                    te = (Double.parseDouble(s0) - Double.parseDouble(s2));
	                else if (s1.equals("/"))
	                    te = (Double.parseDouble(s0) / Double.parseDouble(s2));
	                else
	                    te = (Double.parseDouble(s0) * Double.parseDouble(s2));
	 
	                
	                s0 = Double.toString(te);
	 
	                
	                s1 = s;
	 
	                
	                s2 = "";
	            }
	 
	           
	            t.setText(s0 + s1 + s2);
	        }
		
	}}