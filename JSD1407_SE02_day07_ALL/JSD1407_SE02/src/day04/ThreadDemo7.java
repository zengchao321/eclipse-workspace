package day04;
/**
 * ��̨�̣߳��ػ��߳�
 * �ص㣺
 * 	������������ǰ̨�̶߳�����ʱ����̨�߳�
 * ���������ۺ�̨�߳��Ƿ�������
 * @author Administrator
 *
 */
public class ThreadDemo7 {
	public static void main(String[] args){
		//rose ������:ǰ̨�߳�
		Thread rose = new Thread(){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println(
							"rose:let me go!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println(
							"rose:AAAAAAaaaaaa.....");
				System.out.println(
							"��Ч����ͨ����");				
			}
		};
		
		//jack ������:��̨�߳�
		Thread jack = new Thread(){
			public void run(){
				while(true){
					System.out.println(
							"jack:you jump!i jump!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		
		rose.start();
		//���ú�̨�߳�Ӧ��start����֮ǰ����
		jack.setDaemon(true);
		jack.start();
	}
}





