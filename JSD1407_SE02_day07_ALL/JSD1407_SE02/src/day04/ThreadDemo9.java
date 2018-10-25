package day04;
/**
 * join可以使线程同步
 * @author Administrator
 *
 */
public class ThreadDemo9 {
	//表示图片是否下载完毕
	public static boolean isFinish;
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
			}
		};

		Thread show = new Thread(){
			public void run(){
				System.out.println("show:开始显示图片..");
				//这里应当等待下载线程将图片下载完毕
				try {
					download.join();
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


