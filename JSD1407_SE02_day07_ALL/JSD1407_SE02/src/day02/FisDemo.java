package day02;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream
 * �ڵ���
 * ���ڴ��ļ��ж�ȡ�ֽڵ���
 * @author Administrator
 *
 */
public class FisDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis
			= new FileInputStream("fos.dat");		
		int i = fis.read();
		System.out.println(i);//97
		
		byte[] buf = new byte[21];
		int len = fis.read(buf);
		String str = new String(buf,"UTF-8");
		System.out.println(str);
		
		fis.close();
	}
}





