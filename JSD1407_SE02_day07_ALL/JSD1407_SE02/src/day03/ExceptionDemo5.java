package day03;
/**
 * ��ȡ�����ԭ��
 * ���������һ���쳣��������ʵ�ʿ���ʱ
 * ����Ϊ�˱�֤�׳��쳣�ķ��ͳһ����ʵ���쳣
 * ��װ֮�����׳��������ȡ��ʵԭ�򣬿��Ե���
 * �쳣��getCause()
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




