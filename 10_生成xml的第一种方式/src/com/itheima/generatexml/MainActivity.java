package com.itheima.generatexml;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	private List<Sms> smsLists;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		smsLists = new ArrayList<Sms>();
		
		for (int i = 0; i < 10; i++) {
			Sms sms = new Sms();
			sms.setAdress("1008"+i);
			sms.setBody("nihao"+i);
			sms.setDate("201"+i);
			smsLists.add(sms);
		}
	}
	//点击按钮通过StingBuffer的方式生成一个xml文件
	public void click(View v) {
		//创建stringbuffer对象
		StringBuffer sb = new StringBuffer();
		
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
		sb.append("<smss>");
		for (Sms sms : smsLists) {
			sb.append("<sms>");
			sb.append("<address>");
			sb.append(sms.getAdress());
			sb.append("</address>");
			sb.append("<body>");
			sb.append(sms.getBody());
			sb.append("</body>");
			sb.append("<date>");
			sb.append(sms.getDate());
			sb.append("</date>");
			sb.append("</sms>");
		}
		
		sb.append("</smss>");
		
		try {
			//把数据存到sd卡中
			File file = new File(Environment.getExternalStorageDirectory().getPath(), "smsbackup.xml");
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(sb.toString().getBytes());
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
