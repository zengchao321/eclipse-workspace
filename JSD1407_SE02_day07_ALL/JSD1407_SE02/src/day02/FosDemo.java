package day02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream
 * �ڵ���
 * �������ļ���д���ֽڵ���
 * @author Administrator
 *
 */
public class FosDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos
			= new FileOutputStream("fos.dat");
		
		fos.write(97);
		
		String str = "�찲����̫����";
		byte[] buf = str.getBytes("UTF-8");
		fos.write(buf);
		
		fos.close();
	}
}



