package day03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * PrintWriter
 * 缓冲字符输出流，带有自动行刷新
 * 可以以行为单位写出字符串
 * @author Administrator
 *
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws IOException{
		FileOutputStream fos
			= new FileOutputStream("pw.txt");
		
		OutputStreamWriter osw
			=	new OutputStreamWriter(
													fos,"UTF-8");
		/*
		 * 创建具有自动航刷新的PrintWriter
		 * 后，每当我们使用println方法写出
		 * 字符串后，都会自动flush
		 * 但一定要清楚：这无疑会增加写出次数
		 *             而降低写出效率
		 */
		PrintWriter pw
			= new PrintWriter(osw,true);
		
		pw.println("我爱北京天安门");
		
		pw.println("快使用双节棍");

		pw.close();
	}
}



