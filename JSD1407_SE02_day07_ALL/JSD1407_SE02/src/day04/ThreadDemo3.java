package day04;
/**
 * ʹ�������ڲ������ʽ�����߳�
 * @author Administrator
 *
 */
public class ThreadDemo3 {
	public static void main(String[] args){
		//1
		Thread t1 = new Thread(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("����˭��");
				}
			}
		};
		
		//2
		Runnable runn = new Runnable(){
			public void run(){
				for(int i=0;i<1000;i++){
					System.out.println("���ǲ�ˮ���");
				}
			}
		};
		Thread t2 = new Thread(runn);
		
		t1.start();
		t2.start();
	}
}
