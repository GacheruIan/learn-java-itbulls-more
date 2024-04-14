package awtRecap;
import java.awt.*;

public class awtRecap{
	 awtRecap(){
		Frame f = new Frame("AWT Counter");
		
		Label count = new Label("counter");
		count.setBounds(80,80,100,100);
		
		TextField t = new TextField("enter number here");
		t.setBounds(150,100,200,50);		
		t.setBackground(Color.BLUE);
		
		Button b = new Button("Count");
		b.setBounds(400,100,100,50);
		b.setBackground(Color.blue);
		
		f.add(count);
		f.add(t);
		f.add(b);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true); 
	 }


	public static void main(String[] args) {
		new awtRecap();
	}

}
