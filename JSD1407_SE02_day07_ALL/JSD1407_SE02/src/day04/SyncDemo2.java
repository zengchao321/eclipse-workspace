package day04;
/**
 * ��Ч�ļ�Сͬ����Χ������߲���Ч��
 * @author Administrator
 *
 */
public class SyncDemo2 {
	public static void main(String[] args){
		final SyncDemo2 demo1 = new SyncDemo2();
		final SyncDemo2 demo2 = new SyncDemo2();
		Thread t1 = new Thread(){
			public void run(){
				demo1.buy(getName());
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				demo1.buy(getName());
			}
		};
		t1.start();
		t2.start();
	}
	
	public synchronized void buy(String name){
		System.out.println(name+"�������·�");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+"�����·���");		
			System.out.println(name+"׼�����·�");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name+"�����·���");
		System.out.println(name+"���ˡ�");
	}
}



