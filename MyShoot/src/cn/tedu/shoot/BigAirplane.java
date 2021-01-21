package cn.tedu.shoot;
import java.awt.image.BufferedImage;
/** ��л�:�Ƿ����Ҳ�ܵ÷� */
public class BigAirplane extends FlyingObject implements Enemy{
	private int speed; //�ƶ��ٶ�
	/** ���췽�� */
	public BigAirplane(){
		super(66,89);
		speed = 2;
	}
	
	/** ��дstep()�������ƶ� */
	public void step(){
		y+=speed; //y+(����)
	}
	
	int index = 1; //�±�
	/** ��дgetImage()��ȡͼƬ */
	public BufferedImage getImage(){ //ÿ10������һ��
		if(isLife()){ //��Ϊ���ŵ�
			return Images.bigairplanes[0]; //���ص�1��ͼ
		}else if(isDead()){ //��Ϊ���˵�
			BufferedImage img = Images.bigairplanes[index++];
			if(index==Images.bigairplanes.length){
				state = REMOVE;
			}
			return img;
			
		}
		return null; //ɾ����״̬ʱ��ֱ�ӷ���null
	}
	
	/** ��дgetScore()�÷� */
	public int getScore(){
		return 3; //�����л�����ҵ�3��
	}
	
}








