package day04;
/**
 * 线程其他API
 * @author Administrator
 *
 */
public class ThreadDemo5 {
	public static void main(String[] args){
		//获取调用main方法的线程的相关信息
		Thread t = Thread.currentThread();
		//获取线程id，通常由系统分配
		long id = t.getId();
		System.out.println("id:"+id);
		
		/*
		 * 获取线程的名字,通常由系统指定
		 * 格式为:Thread-X
		 * 但调用main方法的线程名字不是这个。
		 */
		String name = t.getName();
		System.out.println("name:"+name);
		
		//获取线程的优先级
		int p = t.getPriority();
		System.out.println("优先级:"+p);
		//获取线程状态
		System.out.println(
					"state"+t.getState());
		//获取线程是否活着
		System.out.println(
						"alive"+t.isAlive());
		//获取线程是否为后台线程
		System.out.println(
						"daemon"+t.isDaemon());
		//获取线程是否被中断
		System.out.println(
				"interrupt"+t.isInterrupted());
	}
}









