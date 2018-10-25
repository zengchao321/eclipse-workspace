package day04;
/**
 * 有效的减小同步范围可以提高并发效率
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
		System.out.println(name+"正在挑衣服");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+"挑完衣服了");		
			System.out.println(name+"准备试衣服");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name+"试完衣服了");
		System.out.println(name+"结账。");
	}
}



