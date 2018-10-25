package day03;
/**
 * Exception常用的方法
 * @author Administrator
 *
 */
public class ExceptionDemo4 {
	public static void main(String[] args){
		System.out.println("程序开始了");
		try{
			String str = "a";
			System.out.println(str.length());
			System.out.println(Integer.parseInt(str));
		}catch(Exception e){
			e.printStackTrace();
			//查看错误的信息
			System.out.println(e.getMessage());
			System.out.println("出错了");
		}
		System.out.println("程序结束了");
	}
}
