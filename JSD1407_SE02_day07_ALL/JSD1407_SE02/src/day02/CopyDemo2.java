package day02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用缓冲流加快读写效率
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
		
		System.out.println("复制完毕");
		/*
		 * 关闭流时，只关闭最外层的高级流即可
		 */
		bis.close();
		bos.close();

	}
}
