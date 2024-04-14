
import java.awt.*;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

import javax.swing.JFrame;

public class JavaApplets extends Frame implements MouseMotionListener {

	Label l;
	Color c=Color.BLUE;
	JavaApplets(){
	l=new Label();
	l.setBounds(20,40,100,20);
	add(l);
	
	
	addMouseMotionListener(this);
	
	setSize(400,400);
	setLayout(null);
	setVisible(true);

}

	public static void main(String args[]) {
		new JavaApplets();
	}

}
