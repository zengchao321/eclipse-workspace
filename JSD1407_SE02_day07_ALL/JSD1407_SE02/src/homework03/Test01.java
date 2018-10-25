package homework03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/**
 * 思路:
 * 	首先使用缓冲字符流按行读取每一行字符串
 *  然后将他们拼接在一起
 *  最后在文件中追加写操作，将字符串写出
 * @author Administrator
 *
 */
public class Test01 {
	public static void main(String[] args){
		try{
			BufferedReader br
				= new BufferedReader(
						new InputStreamReader(
								new FileInputStream(
										"pw.txt"),"UTF-8"));
			
			
			StringBuilder builder
				= new StringBuilder();
			
			String str = null;
			
			while((str = br.readLine())!=null){
				builder.append(str);
			}
			
			str = builder.toString();
			
			/*
			 * 追加写操作，需要使用FileOutputStream的
			 * 构造方法FileOutputStream(
			 * 						String s,boolean append)
			 */
			FileOutputStream fos
				= new FileOutputStream("pw.txt",true);
			
			fos.write(str.getBytes("UTF-8"));
			
			br.close();
			fos.close();
		}catch(Exception e){
			
		}
	}
}




