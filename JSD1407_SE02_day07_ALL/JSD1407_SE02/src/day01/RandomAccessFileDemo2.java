package day01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文件
 * @author Administrator
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException{
			RandomAccessFile raf
				= new RandomAccessFile(
										"demo.dat","r");
			/*
			 * 从当前文件中读取【一个字节】
			 * 将该字节存入返回的int值中
			 * int值"低八位"有效
			 * 
			 * 若返回值为-1,则说明读取到了
			 * 文件的末尾 
			 * EOF  end of file
			 */
			int i = raf.read();
			
			System.out.println(i);
			
			//再读取一个字节
			i = raf.read();
			System.out.println(i);
			
			//再读取一个字节
			i = raf.read();
			System.out.println(i);
			raf.close();
	}
}



