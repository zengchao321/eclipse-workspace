package day01;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ����д��һ���ֽ�
 * @author Administrator
 *
 */
public class RandomAccessFileDemo4 {
	public static void main(String[] args) throws IOException{
			
			RandomAccessFile raf
				= new RandomAccessFile(
											"test.txt","rw");
			
			String str = "�Ұ������찲��";
			/*
			 * String��getBytes()����:
			 * ����ǰ�ַ������յ�ǰϵͳĬ�ϵ�
			 * �ַ���ת��Ϊ��Ӧ���ֽڡ�
			 */
			byte[] buf = str.getBytes("gbk");
			
			raf.write(buf);
			
			raf.close();
	}
}







