package day01;

import java.io.File;

/**
 * ��ȡһ��Ŀ¼�µ���������
 * @author Administrator
 *
 */
public class FileDemo {
	public static void main(String[] args){
		/*
		 * �鿴��ǰ��Ŀ��Ŀ¼�µ���������
		 */
		File dir = new File(".");
		//�����ж��Ƿ�Ϊһ��Ŀ¼
		if(dir.isDirectory()){
			//��ȡ��ǰĿ¼�µ���������
			File[] subs = dir.listFiles();
			for(File sub : subs){
				String name = sub.getName();
				//Ŀ¼��û�г��ȵ�
				long length = sub.length();
				System.out.println(name+":"+length);
			}
		}
	}
	/*
	 * ɾ���������ļ���Ŀ¼(Ŀ¼�����Ƕ༶��)
	 * 
	 * �ݹ飿
	 * 
	 * ��д���룬���벻����20��
	 * ѭ����� 1+2+3...+100
	 * ÿ��һ�Σ����һ�ν��
	 * �������5050
	 * �ó����в��ó���for while�ȹؼ���
	 */
}





