package day04;
/**
 * 线程并发安全问题
 * @author Administrator
 *
 */
public class SyncDemo {
	//桌子上有20个豆子
	public static int beans = 20;
	//从桌子上取一个豆子
	public synchronized static int getBean(){
		if(beans==0){
			throw new RuntimeException(
												"没有豆子了");
		}
		Thread.yield();
		return beans--;
	}
	public static void main(String[] args){
		Thread t1 = new Thread(){
			public void run(){
				int bean = 0;
				while(true){
					bean = getBean();
					System.out.println(
							this.getName()+":"+bean
					);
				}
			}
		};
		Thread t2 = new Thread(){
			public void run(){
				int bean = 0;
				while(true){
					bean = getBean();
					Thread.yield();
					System.out.println(
							this.getName()+":"+bean
					);
				}
			}
		};
		t1.start();
		t2.start();
	}
	
	
}



