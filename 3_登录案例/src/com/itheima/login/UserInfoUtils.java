package com.itheima.login;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import android.content.Context;

public class UserInfoUtils {
	public static boolean saveInfo(String username,String pwd) {
		
		try {
			
			
			String result = username + "##" + pwd;
			//����file�� ָ������Ҫ�����ݴ����λ��
			File file = new File("/data/data/com.itheima.login/info.txt");
			
			//����һ���ļ������
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(result.getBytes());
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	
	//��ȡ�û�����Ϣ
	public static Map<String, String> readInfo() {
		try {
			Map<String, String> maps = new HashMap<String, String>();
			File file = new File("/data/data/com.itheima.login/info.txt");
			FileInputStream fis = new FileInputStream(file);
			BufferedReader bufr = new BufferedReader(new InputStreamReader(fis));
			//��ȡһ��
			String content = bufr.readLine();
			//�и��ַ��� ��װ��map������
			String[] splits = content.split("##");
			String name = splits[0];
			String pwd = splits[1];
			//��name��pwd ����map��
			maps.put("name", name);
			maps.put("pwd", pwd);
			fis.close();
			return maps;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
}
