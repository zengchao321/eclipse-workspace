package day01;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * 读取一个字节数组的数据
 * @author Administrator
 *
 */
public class RandomAccessFileDemo5 {
	public static void main(String[] args) throws IOException{
			RandomAccessFile raf
				= new RandomAccessFile(
										"test.txt","r");
			
			/*
			 * int read(byte[] buf)
			 * 一次尝试从文件中读取buf数组length
			 * 个字节并从该数组的第一个位置处起
			 * 存放实际读取到的字节。
			 * 返回值为实际读取到的字节数
			 */
			byte[] buf = new byte[50];
			int len = raf.read(buf);
			System.out.println(len);
			System.out.println(
					Arrays.toString(buf)
			);			
			/*
			 * 从字节数组转换为对应的字符串
			 * 
			 */
			String str = new String(buf,"GBK");
			System.out.println(str.trim());
			raf.close();
	}
}






