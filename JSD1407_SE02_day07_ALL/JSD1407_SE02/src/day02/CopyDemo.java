package day02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ���ļ����ֽ����������ʵ���ļ��ĸ���
 * @author Administrator
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException{
		FileInputStream fis
			= new FileInputStream("src.jpg");		
		FileOutputStream fos
			= new FileOutputStream("copy2.jpg");		
		byte[] buf = new byte[10240];
		int len = -1;
		while((len=fis.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		System.out.println("�������");
		fis.close();
		fos.close();
		
	}
}


