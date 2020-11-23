import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gallery extends JFrame implements  ActionListener{
private JLabel one;
private JLabel two;
private JButton back;
private JLabel three;
private JLabel four;
private JLabel five;
private JLabel six;
private Whole whole;

public Gallery(Whole w)
{super("ABOUT us > Gallery");
	this.whole=w;
	
		one=new JLabel(new ImageIcon("image/1.jpg"));
		two=new JLabel(new ImageIcon("image/2.jpg"));
		three=new JLabel(new ImageIcon("image/3.jpg"));
		four=new JLabel(new ImageIcon("image/4.jpg"));	
		five=new JLabel(new ImageIcon("image/5.jpg"));
		six=new JLabel(new ImageIcon("image/6.jpg"));
		back =new JButton ("Back");
		
		
	  one.setText("Certification trophy");
	  one.setHorizontalTextPosition(JLabel.CENTER);
      one.setVerticalTextPosition(JLabel.BOTTOM);
	  two.setText("Inter Dhaka Championship");
	  two.setHorizontalTextPosition(JLabel.CENTER);
      two.setVerticalTextPosition(JLabel.BOTTOM);
	  three.setText("Bd u-19 champion");
	  three.setHorizontalTextPosition(JLabel.CENTER);
      three.setVerticalTextPosition(JLabel.BOTTOM);
	   four.setText("West Bengal champion  ");
	  four.setHorizontalTextPosition(JLabel.CENTER);
      four.setVerticalTextPosition(JLabel.BOTTOM);
	  five.setText("Clemon dhaka hunt chamion");
	  five.setHorizontalTextPosition(JLabel.CENTER);
      five.setVerticalTextPosition(JLabel.BOTTOM);
	  six.setText("Frooto runner up");
	  six.setHorizontalTextPosition(JLabel.CENTER);
      six.setVerticalTextPosition(JLabel.BOTTOM);
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		add(one);
		add(two);
		add(three);
		add(four);
		add(five);
		add(six);
		add(back);
		
		back.setBounds(10,600,70,30);
		one.setBounds(20,20,200,240);
		two.setBounds(320,20,200,240);
		three.setBounds(620,20,200,240);
		four.setBounds(20,320,200,240);
		five.setBounds(320,320,200,240);
		six.setBounds(620,320,200,240);
		
		
		
		
		back.addActionListener(this);
		
		setSize(1000,700);
		setLocation(100,100);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
	
	
}
	public void actionPerformed(ActionEvent e){

			whole.about.setVisible(true);
			whole.gallery.setVisible(false);

	}
}


