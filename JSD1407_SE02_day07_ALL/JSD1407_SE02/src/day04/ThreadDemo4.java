package day04;
/**
 * ��ȡִ�е�ǰ����Ƭ�ε��߳�
 * 
 * Thread currentThread()
 * ���Ե���Thread�ṩ�ľ�̬����
 * 
 * @author Administrator
 *
 */
public class ThreadDemo4 {
	public static void main(String[] args){
		//��ȡ�ľ��ǵ���main�������߳�
		Thread t = Thread.currentThread();
		System.out.println(
				"����main�������߳���:"+t);
		
		testCurrent();
		
		//����һ���߳�
		Thread t1 = new Thread(){
			public void run(){
				//��ȡ��ǰ�߳�
				Thread myt = 
								Thread.currentThread();
				System.out.println(
								"�Լ��������߳���:"+myt);
				testCurrent();
			}
		};
		t1.start();
	}
	
	public static void testCurrent(){
		Thread t = Thread.currentThread();
		System.out.println(
				"����testCurrent�������߳��ǣ�"+t);
	}
}







