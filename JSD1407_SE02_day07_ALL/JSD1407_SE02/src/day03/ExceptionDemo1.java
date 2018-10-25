package day03;
/**
 * java异常处理机制中的try catch
 * @author Administrator
 *
 */
public class ExceptionDemo1 {
	public static void main(String[] args){
		System.out.println("程序开始啦");
		try{
			String str = "a";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(
									Integer.parseInt(str));
			
		}catch(NullPointerException e){
			System.out.println("出现了一个空指针");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("出现了一个字符串下标越界");
		}catch(Exception e){
			System.out.println("反正就是出了个错");
		}
		
		System.out.println("程序结束啦");
	}
}
