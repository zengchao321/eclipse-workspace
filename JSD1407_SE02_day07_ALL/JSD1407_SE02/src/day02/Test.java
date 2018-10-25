package day02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile(
					"person.obj","rw");
		/*
		 * 写字符串到硬盘中，要经历两件事
		 * 1: 将字符串转换成一组字节
		 * 2: 将一组字节写入硬盘做长久保存
		 */
		raf.write("你好".getBytes());
		/*
		 * 写int值到硬盘中，要经历两件事
		 * 1: 将int转换成一组字节
		 * 2: 将一组字节写入硬盘做长久保存
		 * 
		 * 1:将一个特定的数据结构转换为一组字节
		 *   的过程，称之为序列化
		 * 2:将数据写入硬盘做长久保存的过程
		 *   称之为:持久化  
		 *   
		 * 序列化与反序列化一般用于:
		 * 1:传输
		 * 2:保存  
		 */
		raf.writeInt(123);
		raf.writeChar('男');
		raf.writeDouble(1231.123);
		
		raf.close();
		
	}

}
