package day04;
/**
 * 线程协同工作
 * @author Administrator
 *
 */
public class ThreadDemo10 {
	public static boolean isFinish;
	public static Object obj = new Object();
	public static void main(String[] args){
	//下载线程
		final Thread download = new Thread(){
			public void run(){
				System.out.println("down:开始下载图片..");
				for(int i=1;i<=100;i++){
					System.out.println(
							"down:已完成"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("down:图片下载完毕");
				isFinish = true;
				/*
				 * 当图片下载完毕，就应当通知显示图片的
				 * 线程开始工作了
				 */
				synchronized(obj){
					obj.notify();
				}
				
				System.out.println("down:开始下载附件..");
				for(int i=1;i<=100;i++){
					System.out.println(
							"down:已完成"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("down:附件下载完毕");
			}
		};

		Thread show = new Thread(){
			public void run(){
				System.out.println("show:开始显示图片..");
				//这里应当等待下载线程将图片下载完毕
				try {
//					download.join();
					//在obj对象上等待
					synchronized(obj){
						obj.wait();
					}
				} catch (InterruptedException e) {
				}
				if(!isFinish){
					throw new RuntimeException(
														"图片没有找到");
				}
				System.out.println(
											"show:显示图片完毕..");
			}
		};	
		download.start();
		show.start();
	}
}




