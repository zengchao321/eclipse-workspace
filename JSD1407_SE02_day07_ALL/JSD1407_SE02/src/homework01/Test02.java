package homework01;
/**
 * 1+2...100
 * @author Administrator
 *
 */
public class Test02 {

	public static void main(String[] args) {
		System.out.println(add(100));
	}
	/**
	 * ʹ�õ�ǰ�������ۼ���֮ǰ��ÿһ������
	 * ֱ��1Ϊֹ
	 * �ݹ飺
	 * 1:���ȿ��Ǽ��������ʲôʱ��ֹͣ
	 * 2:ÿһ�ֿ��ܷ���������Ƿ񶼿�����
	 * 3:�����ڲ������ظ��������ʱ������
	 *   �÷�������(������ǵݹ����)
	 * @param n
	 */
	public static int add(int n){
		if(n==1){
			return 1;
		}else{	
			return n+add(n-1);
		}
		
	}
}
