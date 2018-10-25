package day02;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * int skipBytes(int n)
 * 该方法会尝试跳过n个字节，返回值为实际
 * 跳过的字节数
 * @author Administrator
 *
 */
public class RandomAccessFileDemo2 {
	public static void main(String[] args) throws IOException{
		RandomAccessFile raf
			= new RandomAccessFile(
												"raf.dat","r");		
		//跳过1个字节
		raf.skipBytes(1);
		int i = raf.readInt();
		System.out.println(i);
		raf.close();
		
	}
}




