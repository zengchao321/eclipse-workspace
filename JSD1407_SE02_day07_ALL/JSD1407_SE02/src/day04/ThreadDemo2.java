package day04;
/**
 * �ڶ��ִ����̵߳ķ�ʽ
 * �����߳���Runnable
 * @author Administrator
 *
 */
public class ThreadDemo2 {
	public static void main(String []args){
		Runnable runn1 = new MyRunnable1();
		Runnable runn2 = new MyRunnable2();
		
		Thread t1 = new Thread(runn1);
		Thread t2 = new Thread(runn2);
		
		t1.start();
		t2.start();
	}
}

class MyRunnable1 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("����˭��");
		}
	}
}
class MyRunnable2 implements Runnable{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("������ˮ�ܵ�");
		}
	}
}





