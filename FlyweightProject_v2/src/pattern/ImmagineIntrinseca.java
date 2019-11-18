package pattern;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImmagineIntrinseca {
	
	private Image img;
	
	public ImmagineIntrinseca() {
		caricaImmagine();
	}
	
	private void caricaImmagine()
	{
		if (img == null)
			try {
				img = ImageIO.read(new File("immagine" + File.separator  + "bigFly.png"));
				img = img.getScaledInstance(1000, 1000,Image.SCALE_DEFAULT);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public Image getImg() {
		return img;
	}

}
