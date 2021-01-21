package cn.tedu.shoot;
import java.awt.image.BufferedImage;
/** С�л�:�Ƿ����Ҳ�ܵ÷� */
public class Airplane extends FlyingObject implements Enemy{
	private int speed; //�ƶ��ٶ�
	/** ���췽�� */
	public Airplane(){
		super(48,50);
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
			return Images.airplanes[0]; //���ص�1��ͼ
		}else if(isDead()){ //��Ϊ���˵�
			BufferedImage img = Images.airplanes[index++];
			if(index==Images.airplanes.length){
				state = REMOVE;
			}
			return img;
			/*
			 *                      index=1
			 * 10M img=airplanes[1] index=2 ����img
			 * 20M img=airplanes[2] index=3 ����img
			 * 30M img=airplanes[3] index=4 ����img
			 * 40M img=airplanes[4] index=5(REMOVE) ����img
			 * 50M ֱ�ӷ���null
			 */
		}
		return null; //ɾ����״̬ʱ��ֱ�ӷ���null
		
	}
	
	/** ��дgetScore()�÷� */
	public int getScore(){
		return 1; //���С�л�����ҵ�1��
	}
	
}













