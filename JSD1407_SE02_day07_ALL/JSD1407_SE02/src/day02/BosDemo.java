package day02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲输出流写出数据的注意事项
 * @author Administrator
 *
 */
public class BosDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos
			= new FileOutputStream("bos.txt");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);				
		String str = "伟大领袖毛主席";
		byte[] buf = str.getBytes("UTF-8");
		bos.write(buf);
		/*
		 * 强制将当前缓冲流中的缓冲区中的数据
		 * 全部写出，无论缓冲区是否被装满
		 */
		bos.flush();
		//close时，也会自动调用一次flush
		bos.close();
	}
}
