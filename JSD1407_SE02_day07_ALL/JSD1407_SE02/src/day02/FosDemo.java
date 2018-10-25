package day02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream
 * 节点流
 * 用于向文件中写出字节的流
 * @author Administrator
 *
 */
public class FosDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos
			= new FileOutputStream("fos.dat");
		
		fos.write(97);
		
		String str = "天安门上太阳升";
		byte[] buf = str.getBytes("UTF-8");
		fos.write(buf);
		
		fos.close();
	}
}



