package day04;
/**
 * �߳����ȼ�
 * 1-10
 * �����ϣ��߳����ȼ��ߵ��̣߳�������ʱ��
 * Ƭ�εĴ�����
 * @author Administrator
 *
 */
public class ThreadDemo6 {
	public static void main(String[] args){
			Thread max = new Thread(){
				public void run(){
					for(int i=0;i<5000;i++){
						System.out.println("max");
					}
				}
			};
			Thread norm = new Thread(){
				public void run(){
					for(int i=0;i<5000;i++){
						System.out.println("norm");
					}
				}
			};
			Thread min = new Thread(){
				public void run(){
					for(int i=0;i<5000;i++){
						System.out.println("min");
					}
				}
			};			
			max.setPriority(
					Thread.MAX_PRIORITY);
			min.setPriority(
					Thread.MIN_PRIORITY);		
			min.start();
			norm.start();
			max.start();
	}
}





