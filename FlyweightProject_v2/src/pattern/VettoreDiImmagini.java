package pattern;

import java.awt.Image;
import java.util.ArrayList;

public class VettoreDiImmagini {
	
	private ArrayList<ImmagineEstrinseca> immagini;
	
	public VettoreDiImmagini() {
		
		immagini = new ArrayList<ImmagineEstrinseca>();
		
		int x = 0;
		int y = 0;
		
		ImmagineIntrinseca j = new ImmagineIntrinseca();
		
		for (int i=0;i<100000;i++)
		{
			immagini.add(new ImmagineEstrinseca(x, y, j));
			System.out.println(i);
			x+=120;
			if (x >=100000)
			{
				y+=100;
				x = 0;
			}
		}
		
	}
	
	public int getSize() {
		return immagini.size();
	}
	
	public Image prendiImmagineI(int i)
	{
		return immagini.get(i).getImgIn().getImg();
	}
	
	public int prendiXI(int i)
	{
		return immagini.get(i).getX();
	}
	
	public int prendiYI(int i)
	{
		return immagini.get(i).getY();
	}

}
