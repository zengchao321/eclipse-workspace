package day04;
/**
 * join����ʹ�߳�ͬ��
 * @author Administrator
 *
 */
public class ThreadDemo9 {
	//��ʾͼƬ�Ƿ��������
	public static boolean isFinish;
	public static void main(String[] args){
		//�����߳�
		final Thread download = new Thread(){
			public void run(){
				System.out.println("down:��ʼ����ͼƬ..");
				for(int i=1;i<=100;i++){
					System.out.println(
							"down:�����"+i+"%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("down:ͼƬ�������");
				isFinish = true;
			}
		};

		Thread show = new Thread(){
			public void run(){
				System.out.println("show:��ʼ��ʾͼƬ..");
				//����Ӧ���ȴ������߳̽�ͼƬ�������
				try {
					download.join();
				} catch (InterruptedException e) {
				}
				if(!isFinish){
					throw new RuntimeException(
														"ͼƬû���ҵ�");
				}
				System.out.println(
											"show:��ʾͼƬ���..");
			}
		};	
		download.start();
		show.start();
		
	}
}


