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
import android.os.Environment;

public class UserInfoUtils {
	public static boolean saveInfo(String username,String pwd) {
		
		try {			
			String result = username + "##" + pwd;
			//创建file类 指定我们要把数据储存的位置 保存到sd卡
			
			String sdPath = Environment.getExternalStorageDirectory().getPath();
			File file = new File(sdPath, "haha.txt");
			
			//创建一个文件输出流
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(result.getBytes());
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	
	//读取用户的信息
	public static Map<String, String> readInfo() {
		try {
			Map<String, String> maps = new HashMap<String, String>();
			String sdPath = Environment.getExternalStorageDirectory().getPath();
			File file = new File(sdPath, "haha.txt");
			FileInputStream fis = new FileInputStream(file);
			BufferedReader bufr = new BufferedReader(new InputStreamReader(fis));
			//读取一行
			String content = bufr.readLine();
			//切割字符串 封装到map集合中
			String[] splits = content.split("##");
			String name = splits[0];
			String pwd = splits[1];
			//把name和pwd 放入map中
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
