package day02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ�û������ӿ��дЧ��
 * 
 * @author Administrator
 */
public class CopyDemo2 {
	public static void main(String[] args)throws IOException {
		FileInputStream fis 
			= new FileInputStream("src.AVI");
		BufferedInputStream bis
			= new BufferedInputStream(fis);
		
		
		FileOutputStream fos 
			= new FileOutputStream("copy2.AVI");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);
		
		
		int d = -1;
		while ((d = bis.read()) != -1) {
			bos.write(d);
		}
		
		System.out.println("�������");
		/*
		 * �ر���ʱ��ֻ�ر������ĸ߼�������
		 */
		bis.close();
		bos.close();

	}
}
