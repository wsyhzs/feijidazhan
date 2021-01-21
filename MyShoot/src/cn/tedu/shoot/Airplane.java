package cn.tedu.shoot;
import java.awt.image.BufferedImage;
/** 小敌机:是飞行物，也能得分 */
public class Airplane extends FlyingObject implements Enemy{
	private int speed; //移动速度
	/** 构造方法 */
	public Airplane(){
		super(48,50);
		speed = 2;
	}
	
	/** 重写step()飞行物移动 */
	public void step(){
		y+=speed; //y+(向下)
	}
	
	int index = 1; //下标
	/** 重写getImage()获取图片 */
	public BufferedImage getImage(){ //每10毫秒走一次
		if(isLife()){ //若为活着的
			return Images.airplanes[0]; //返回第1张图
		}else if(isDead()){ //若为死了的
			BufferedImage img = Images.airplanes[index++];
			if(index==Images.airplanes.length){
				state = REMOVE;
			}
			return img;
			/*
			 *                      index=1
			 * 10M img=airplanes[1] index=2 返回img
			 * 20M img=airplanes[2] index=3 返回img
			 * 30M img=airplanes[3] index=4 返回img
			 * 40M img=airplanes[4] index=5(REMOVE) 返回img
			 * 50M 直接返回null
			 */
		}
		return null; //删除的状态时，直接返回null
		
	}
	
	/** 重写getScore()得分 */
	public int getScore(){
		return 1; //打掉小敌机，玩家得1分
	}
	
}













