package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * �����ϻ�Mapת��Ϊ�̰߳�ȫ��
 * @author Administrator
 *
 */
public class SyncAPIDemo {
	public static void main(String[] args){
		List<String> list 
					= new ArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		//�����е�List����ת��Ϊ�̰߳�ȫ��
		list = 
			Collections.synchronizedList(list);
		System.out.println(list);
		
		
		Set<String> set 
			= new HashSet<String>();
		//�����е�Set����ת��Ϊ�̰߳�ȫ��
		set = 
			Collections.synchronizedSet(set);
		
		Map<String,Integer> map
			= new HashMap<String,Integer>();
		
		//�����е�Mapת��Ϊ�̰߳�ȫ��
		map = 
			Collections.synchronizedMap(map);
		
	}
}





