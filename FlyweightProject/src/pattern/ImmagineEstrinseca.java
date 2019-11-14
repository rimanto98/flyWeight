package pattern;

import java.awt.Image;

public class ImmagineEstrinseca {
	
	private ImmagineIntrinseca imgIn;
	private Image immagine;
	
	private int x;
	private int y;
	
	public ImmagineEstrinseca(int x,int y) {
		immagine=ImmagineIntrinseca.caricaImmagine();
		
		this.x = x;
		this.y = y;
	}
	
	public ImmagineIntrinseca getImgIn() {
		return imgIn;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	

}
