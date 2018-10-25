package day04;
/**
 * �߳�����API
 * @author Administrator
 *
 */
public class ThreadDemo5 {
	public static void main(String[] args){
		//��ȡ����main�������̵߳������Ϣ
		Thread t = Thread.currentThread();
		//��ȡ�߳�id��ͨ����ϵͳ����
		long id = t.getId();
		System.out.println("id:"+id);
		
		/*
		 * ��ȡ�̵߳�����,ͨ����ϵͳָ��
		 * ��ʽΪ:Thread-X
		 * ������main�������߳����ֲ��������
		 */
		String name = t.getName();
		System.out.println("name:"+name);
		
		//��ȡ�̵߳����ȼ�
		int p = t.getPriority();
		System.out.println("���ȼ�:"+p);
		//��ȡ�߳�״̬
		System.out.println(
					"state"+t.getState());
		//��ȡ�߳��Ƿ����
		System.out.println(
						"alive"+t.isAlive());
		//��ȡ�߳��Ƿ�Ϊ��̨�߳�
		System.out.println(
						"daemon"+t.isDaemon());
		//��ȡ�߳��Ƿ��ж�
		System.out.println(
				"interrupt"+t.isInterrupted());
	}
}









