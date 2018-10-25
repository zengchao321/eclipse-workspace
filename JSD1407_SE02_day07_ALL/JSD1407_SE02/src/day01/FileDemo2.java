package day01;

import java.io.File;
import java.io.FileFilter;

/**
 * listFiles方法支持文件过滤器
 * 
 * FileFilter接口
 * 实现该接口需要实现抽象方法:
 * 	boolean accept(File f)
 * 	该方法要求我们定义过滤条件
 * 
 * listFiles方法会将当前目录下满足accept
 * 方法的子项返回
 * @author Administrator
 *
 */
public class FileDemo2 {
	public static void main(String[] args){
		File dir = new File(".");
		if(dir.isDirectory()){
			//创建过滤器实例
			FileFilter filter
								= new MyFilter();
			//使用过滤器过滤子项
			File[] subs 
							  = dir.listFiles(filter);
			for(File sub : subs){
				System.out.println(
								sub.getName());
			}
		}
	}
}


class MyFilter implements FileFilter{
	public boolean accept(File file) {
		System.out.println(
					"正在过滤:"+file.getName());
		
		return file.getName()
							.startsWith(".");
	}
} 





