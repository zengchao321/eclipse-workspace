package day04;
/**
 * 获取执行当前代码片段的线程
 * 
 * Thread currentThread()
 * 可以调用Thread提供的静态方法
 * 
 * @author Administrator
 *
 */
public class ThreadDemo4 {
	public static void main(String[] args){
		//获取的就是调用main方法的线程
		Thread t = Thread.currentThread();
		System.out.println(
				"调用main方法的线程是:"+t);
		
		testCurrent();
		
		//创建一个线程
		Thread t1 = new Thread(){
			public void run(){
				//获取当前线程
				Thread myt = 
								Thread.currentThread();
				System.out.println(
								"自己创建的线程是:"+myt);
				testCurrent();
			}
		};
		t1.start();
	}
	
	public static void testCurrent(){
		Thread t = Thread.currentThread();
		System.out.println(
				"调用testCurrent方法的线程是："+t);
	}
}







