package qc.kitk4t.testslick;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Texture {

	//public static final Texture <variable name> = ...;
	
	private String fileName;
	private BufferedImage img = null;
	
	/**Texture that contains one or many Images by using BufferedImage. It divides the main image, <code>Image img</code>, into others BufferedImage using the <code>getImagePart method</code>.
	 * @param fileName name of the file with the extension: <file name>.<type>*/
	public Texture(String path, String fileName) {
		this.fileName = fileName;
		try {
			this.img = ImageIO.read(new File(path+fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**@return img from the file. If the img was not find, it will return null.*/
	public BufferedImage getImage() {
		return this.img;
	}
	
	/**@param x x location of the buffered image in the main image. Must be positive and under the main image width.
	 * @param y y location of the buffered image in the main image. Must be positive and under the main image height.
	 * @param width width of the buffered image. Must be positive and under the main image width.
	 * @param height height of the buffered image. Must be positive and under the main image height.
	 * @return buffered image from the default image. If the main image is null, it will return null. If the cords are not in the main image, it will return null.*/
	public BufferedImage getImagePart(int x, int y, int width, int height) {
		if(this.img == null)
			return null;
		if(width <=0 || height <= 0)
			return null;
		if(x < 0 || y < 0 || x+width > getWidth() || y+height > getHeight())
			return null;
		return img.getSubimage(x, y, width, height);
	}
	
	/**@return name of the file */
	public String getFileName() {
		return this.fileName;
	}
	
	/**@return width of the main image. If the main image is null, it will return 0.*/
	public int getWidth() {
		if(img == null)
			return 0;
		return img.getWidth(null);
	}
	
	/**@return height of the main image. If the main image is null, it will return 0.*/
	public int getHeight() {
		if(img == null)
			return 0;
		return img.getHeight(null);
	}
}
