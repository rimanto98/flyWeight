package interfacciaGrafica;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import pattern.VettoreDiImmagini;

public class Pannello extends JPanel{
	
	VettoreDiImmagini vettore;
	
	public Pannello(VettoreDiImmagini v) {

		vettore = v;
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		Graphics2D grafica2d = (Graphics2D) g;
		
		for (int i =0;i<vettore.getSize();i++)
			grafica2d.drawImage(vettore.prendiImmagineI(i),vettore.prendiXI(i),
					vettore.prendiYI(i),this);
	}

}
