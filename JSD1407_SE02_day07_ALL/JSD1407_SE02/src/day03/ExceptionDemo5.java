package day03;
/**
 * 获取错误的原因
 * 当程序出现一个异常后，我们在实际开发时
 * 可以为了保证抛出异常的风格统一，将实际异常
 * 包装之后再抛出，若想获取真实原因，可以调用
 * 异常的getCause()
 * @author Administrator
 *
 */
public class ExceptionDemo5 {
	public static void main(String[] args){
		try{
			dosome();
		}catch(Exception e){
			System.out.println(e.getCause());
		}
	}
	public static void dosome()
										throws Exception{
		try{
			String str = null;
			System.out.println(str.length());
		}catch(NullPointerException e){			
			throw new Exception(e);
		}
	}
}




