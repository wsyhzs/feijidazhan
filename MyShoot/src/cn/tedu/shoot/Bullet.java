package cn.tedu.shoot;
import java.awt.image.BufferedImage;
/** �ӵ�:�Ƿ����� */
public class Bullet extends FlyingObject {
	private int speed; //�ƶ��ٶ�
	/** ���췽�� */
	public Bullet(int x,int y){
		super(8,20,x,y);
		speed = 3;
	}
	
	/** ��дstep()�������ƶ� */
	public void step(){
		y-=speed; //y-(����)
	}
	
	/** ��дgetImage()��ȡͼƬ */
	public BufferedImage getImage(){
		if(isLife()){ //��Ϊ���ŵ�
			return Images.bullet; //ֱ�ӷ����ӵ�ͼƬ
		}else if(isDead()){ //��Ϊ���˵�
			state = REMOVE; //����ǰ״̬�޸�ΪREMOVEɾ��״̬
		}
		return null; //���˵ĺ�ɾ����״̬ʱ��ֱ�ӷ���null
	}
	
	/** ��дoutOfBounds()�ж�Խ�� */
	public boolean outOfBounds(){
		return this.y<=-this.height; //�ӵ���y<=�����ӵ��ĸߣ���ΪԽ����
	}
	
}













