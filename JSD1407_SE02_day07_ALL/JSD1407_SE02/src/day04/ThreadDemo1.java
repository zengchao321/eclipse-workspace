package day04;
/**
 * 第一种创建线程的方式
 * 继承Thread类，重写run方法
 * @author Administrator
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args){		
		//有先后顺序的运行方式是同步运行。
//		for(int i=0;i<1000;i++){
//			System.out.println("你是谁啊");
//		}
//		for(int i=0;i<1000;i++){
//			System.out.println("我是查水表的");
//		}
	
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		/*
		 * start方法用于将线程纳入线程调度
		 * 这时，线程进入runnable状态，等待
		 * 线程调度分配时间片段。
		 * 当线程调度将时间片段分配给当前线程
		 * 该线程的run方法才开始被执行。
		 * 直到线程的run方法执行完毕，线程结束
		 * 最终被回收。
		 * 在线程的run方法执行期间，该线程处于
		 * 走走停停。
		 */
		t1.start();
		t2.start();
		
	}
}

class MyThread1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("你是谁啊");
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("我是查水表的");
		}
	}
}


