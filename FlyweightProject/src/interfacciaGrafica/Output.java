package interfacciaGrafica;

import javax.swing.JFrame;

import pattern.*;

public class Output {
	
JFrame frame;
	
	Pannello pannello;
	
	public Output(VettoreDiImmagini v) {
		
		frame = new JFrame("Output");
		
		pannello = new Pannello(v);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(pannello);
		frame.setSize(1280, 720);
		
		frame.setLocation(0, 0);
		
		frame.setVisible(true);
		
	}

}
