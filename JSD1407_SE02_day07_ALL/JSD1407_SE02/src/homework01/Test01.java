package homework01;

import java.io.File;

/**
 * ɾ���������ļ���Ŀ¼
 * @author Administrator
 */
public class Test01 {
	public static void main(String[] args){
		File file = new File("aa");
		deleteFile(file);
	}
	/**
	 * ����һ��File����Ȼ����ɾ��
	 * @param file
	 * 
	 * ��������10����   
	 * һ�ֶ������
	 * һ�ֲ��������
	 */
	public static void deleteFile(
														File file){
		if(file.isDirectory()){
			//�����Ŀ¼����Ҫ���Ƿ�������
			File[] subs = file.listFiles();
			//��ɾ����������
			for(File sub : subs){
				deleteFile(sub);
			}			
		}
		file.delete();
	}
}



