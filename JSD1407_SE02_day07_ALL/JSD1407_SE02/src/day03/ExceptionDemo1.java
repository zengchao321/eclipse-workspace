package day03;
/**
 * java�쳣��������е�try catch
 * @author Administrator
 *
 */
public class ExceptionDemo1 {
	public static void main(String[] args){
		System.out.println("����ʼ��");
		try{
			String str = "a";
			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(
									Integer.parseInt(str));
			
		}catch(NullPointerException e){
			System.out.println("������һ����ָ��");
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("������һ���ַ����±�Խ��");
		}catch(Exception e){
			System.out.println("�������ǳ��˸���");
		}
		
		System.out.println("���������");
	}
}
