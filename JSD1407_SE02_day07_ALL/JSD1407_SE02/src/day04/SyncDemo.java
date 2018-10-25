package day04;
/**
 * �̲߳�����ȫ����
 * @author Administrator
 *
 */
public class SyncDemo {
	//��������20������
	public static int beans = 20;
	//��������ȡһ������
	public synchronized static int getBean(){
		if(beans==0){
			throw new RuntimeException(
												"û�ж�����");
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



