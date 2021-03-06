package cn.tedu.shoot;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
/** ͼƬ������ */
public class Images {
	public static BufferedImage start;    //����ͼ
	public static BufferedImage pause;    //��ͣͼ
	public static BufferedImage gameover; //��Ϸ����ͼ
	
	public static BufferedImage background1;     //����ͼ
	public static BufferedImage bullet;         //�ӵ�ͼ 
	public static BufferedImage[] heros;        //Ӣ�ۻ�ͼ
	public static BufferedImage[] airplanes;    //С�л�ͼ
	public static BufferedImage[] bigairplanes; //��л�ͼ
	public static BufferedImage[] bees;         //С�۷�ͼ
	
	static{ //��ʼ����̬��Դ
		start = readImage("start.png");
		pause = readImage("pause.png");
		gameover = readImage("gameover.png");
		
		background1 = readImage("background1.png");
		bullet = readImage("bullet.png");
		
		heros = new BufferedImage[2];
		heros[0] = readImage("hero0.png");
		heros[1] = readImage("hero1.png");
		
		airplanes = new BufferedImage[5];
		bigairplanes = new BufferedImage[5];
		bees = new BufferedImage[5];
		airplanes[0] = readImage("airplane0.png");
		bigairplanes[0] = readImage("bigairplane0.png");
		bees[0] = readImage("bee0.png");
		for(int i=1;i<bees.length;i++){
			airplanes[i] = readImage("bom"+i+".png");
			bigairplanes[i] = readImage("bom"+i+".png");
			bees[i] = readImage("bom"+i+".png");
		}
	}
	
	/** ��ȡͼƬ */
	public static BufferedImage readImage(String fileName){
		try{
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName)); //ͬ���¶�ȡͼƬ
			return img;
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
