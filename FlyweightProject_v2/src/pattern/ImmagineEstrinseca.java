package pattern;

import java.awt.Image;

public class ImmagineEstrinseca {
	
	private ImmagineIntrinseca imgIn;
	
	private int x;
	private int y;
	
	public ImmagineEstrinseca(int x,int y,ImmagineIntrinseca i) {
		imgIn = i;
		
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
