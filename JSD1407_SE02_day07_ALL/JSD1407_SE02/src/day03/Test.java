package day03;

import java.util.Collection;
import java.util.List;

/**
 * JAVA就近调用原则
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args){
		Double s = null;
		/*
		 * java就近调用原则
		 */
		dosome(null);
	}
	public static void dosome(long d){
		System.out.println("long");
	}
	public static void dosome(double d){
		System.out.println("double");
	}
	public static void dosome(Double d){
		System.out.println("Double");
	}
}
