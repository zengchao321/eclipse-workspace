package day04;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Sleep阻塞
 * @author Administrator
 *
 */
public class ThreadDemo8 {
	public static void main(String[] args){
		/*
		 * 实现电子表
		 * 
		 * 15:51:33
		 */
		SimpleDateFormat sdf
			= new SimpleDateFormat("HH:mm:ss");	
		while(true){
			Date now = new Date();
			System.out.println(
					sdf.format(now));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
	}
}
