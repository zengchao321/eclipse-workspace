package day01;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 基于缓存形式复制文件
 * @author Administrator
 *
 */
public class RandomAccessFileDemo6 {
	public static void main(String[] args) throws IOException{
			RandomAccessFile src
				= new RandomAccessFile(
						"src.jpg","r"
				);		
			RandomAccessFile des
				= new RandomAccessFile(
					"copy.jpg","rw"
				);
			long start = System.currentTimeMillis();
			byte[] buf = new byte[1024*10];
			int len = -1;
			/*
			 * int read(byte[] buf)
			 * 若返回值为-1,表示没有数据可读了
			 * EOF
			 */
			while((len = src.read(buf))!=-1){
				/*
				 * void write(
				 * 	byte[] b,int offset,int len
				 * )
				 * 该方法的作用是将给定的字节数组中
				 * offset处开始，连续len个字节写出
				 */
					des.write(buf,0,len);
			}
			long end = System.currentTimeMillis();
			System.out.println("耗时:"+(end-start));
			src.close();
			des.close();
	}
}


