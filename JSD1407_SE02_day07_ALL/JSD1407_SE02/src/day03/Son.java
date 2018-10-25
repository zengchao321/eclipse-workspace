package day03;

import java.sql.SQLException;



public class Son extends Father{
	//不抛出异常可以
//	public void dosome(){
//	}
	
	//可以抛出父类抛出的部分异常
//	public void dosome()
//						throws IOException{
//	}
	
	//可以抛出父类抛出异常的子类异常
//		public void dosome()
//					throws FileNotFoundException{
//		}
	
	
	//不可以抛出额外异常
//		public void dosome()
//								throws SQLException{
//		}
	
	//不可以抛出父类抛出异常的父类异常
//	public void dosome()
//								throws Exception{
//	}
}
