package day04;
/**
 * ��һ�ִ����̵߳ķ�ʽ
 * �̳�Thread�࣬��дrun����
 * @author Administrator
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args){		
		//���Ⱥ�˳������з�ʽ��ͬ�����С�
//		for(int i=0;i<1000;i++){
//			System.out.println("����˭��");
//		}
//		for(int i=0;i<1000;i++){
//			System.out.println("���ǲ�ˮ���");
//		}
	
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/*
		 * start�������ڽ��߳������̵߳���
		 * ��ʱ���߳̽���runnable״̬���ȴ�
		 * �̵߳��ȷ���ʱ��Ƭ�Ρ�
		 * ���̵߳��Ƚ�ʱ��Ƭ�η������ǰ�߳�
		 * ���̵߳�run�����ſ�ʼ��ִ�С�
		 * ֱ���̵߳�run����ִ����ϣ��߳̽���
		 * ���ձ����ա�
		 * ���̵߳�run����ִ���ڼ䣬���̴߳���
		 * ����ͣͣ��
		 */
		t1.start();
		t2.start();
		
	}
}

class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("����˭��");
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("���ǲ�ˮ���");
		}
	}
}


