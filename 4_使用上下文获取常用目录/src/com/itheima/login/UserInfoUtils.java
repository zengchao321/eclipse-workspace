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
	public static boolean saveInfo(Context context,String username,String pwd) {
		
		try {
			String result = username + "##" + pwd;
			//3.通过上下文获取FileOutputStream
			FileOutputStream fos = context.openFileOutput("info.txt", 0);
			fos.write(result.getBytes());
			fos.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		
	}
	
	
	//读取用户的信息
	public static Map<String, String> readInfo(Context context) {
		try {
			Map<String, String> maps = new HashMap<String, String>();
//			String path = context.getFilesDir().getPath();
//			//File file = new File("/data/data/com.itheima.login/info.txt");
//			File file = new File(path, "info.txt");
//			FileInputStream fis = new FileInputStream(file);
			FileInputStream fis = context.openFileInput("info.txt");
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
