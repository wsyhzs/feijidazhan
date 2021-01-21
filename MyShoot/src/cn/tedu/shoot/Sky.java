package cn.tedu.shoot;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
/** 天空:是飞行物 */
public class Sky extends FlyingObject {
	private int speed; //移动速度
	private int y1;    //第2张图的y坐标
	/** 构造方法 */
	public Sky(){
		super(World.WIDTH,World.HEIGHT,0,0);
		speed = 1;
		y1 = -World.HEIGHT;
	}
	
	/** 重写step()飞行物移动 */
	public void step(){
		y+=speed;  //y+(向下)
		y1+=speed; //y1+(向下)
		if(y>=World.HEIGHT){ //若y>=窗口的高，说明到最下面了
			y=-World.HEIGHT; //将y修改为负的窗口的高，即:移到最上面
		}
		if(y1>=World.HEIGHT){ //若y1>=窗口的高，说明到最下面了
			y1=-World.HEIGHT; //将y1修改为负的窗口的高，即:移到最上面
		}
	}
	
	/** 重写getImage()获取图片 */
	public BufferedImage getImage(){
		return Images.background1; //直接返回天空图片
	}
	
	/** 重写paintObject()画对象 */
	public void paintObject(Graphics g){
		g.drawImage(this.getImage(),this.x,this.y,null);
		g.drawImage(this.getImage(),this.x,this.y1,null); //画第2张图
	}
	
}











