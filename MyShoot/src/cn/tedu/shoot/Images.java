package cn.tedu.shoot;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
/** 图片工具类 */
public class Images {
	public static BufferedImage start;    //启动图
	public static BufferedImage pause;    //暂停图
	public static BufferedImage gameover; //游戏结束图
	
	public static BufferedImage background1;     //背景图
	public static BufferedImage bullet;         //子弹图 
	public static BufferedImage[] heros;        //英雄机图
	public static BufferedImage[] airplanes;    //小敌机图
	public static BufferedImage[] bigairplanes; //大敌机图
	public static BufferedImage[] bees;         //小蜜蜂图
	
	static{ //初始化静态资源
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
	
	/** 读取图片 */
	public static BufferedImage readImage(String fileName){
		try{
			BufferedImage img = ImageIO.read(FlyingObject.class.getResource(fileName)); //同包下读取图片
			return img;
		}catch(Exception e){
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
}
