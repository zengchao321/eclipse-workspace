package day02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���������д�����ݵ�ע������
 * @author Administrator
 *
 */
public class BosDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos
			= new FileOutputStream("bos.txt");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);				
		String str = "ΰ������ë��ϯ";
		byte[] buf = str.getBytes("UTF-8");
		bos.write(buf);
		/*
		 * ǿ�ƽ���ǰ�������еĻ������е�����
		 * ȫ��д�������ۻ������Ƿ�װ��
		 */
		bos.flush();
		//closeʱ��Ҳ���Զ�����һ��flush
		bos.close();
	}
}
