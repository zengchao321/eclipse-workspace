package homework03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

/**
 * ˼·:
 * 	����ʹ�û����ַ������ж�ȡÿһ���ַ���
 *  Ȼ������ƴ����һ��
 *  ������ļ���׷��д���������ַ���д��
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
			 * ׷��д��������Ҫʹ��FileOutputStream��
			 * ���췽��FileOutputStream(
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




