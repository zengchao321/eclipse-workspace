 package com.itheima.generatexml;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlSerializer;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.util.Xml;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.itheima.generatexml2.R;

public class MainActivity extends Activity {

	private List<Sms> smsLists;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		smsLists = new ArrayList<Sms>();
		
		for (int i = 0; i < 10; i++) {
			Sms sms = new Sms();
			sms.setAddress("10086"+i);
			sms.setBody("nihao"+i);
			sms.setDate("201"+i);
			smsLists.add(sms);
		}
	}
	//点击按钮通过Xmlserializer的方式生成一个xml文件
	public void click(View v) {
		try {
			//获取Xmlserializer 实例  通过Xml工具类获取
			XmlSerializer serializer = Xml.newSerializer();
			//设置serializer序列化器的参数
			File file = new File(Environment.getExternalStorageDirectory().getPath(), "smsbackup2.xml");
			FileOutputStream fos = new FileOutputStream(file);
			serializer.setOutput(fos, "utf-8");
			//开始写xml文档
			serializer.startDocument("utf-8", true);
			serializer.startTag(null, "smss");
			for (Sms sms : smsLists) {
				serializer.startTag(null, "sms");
				serializer.startTag(null, "address");
				serializer.text(sms.getAddress());
				serializer.endTag(null, "address");
				serializer.startTag(null, "body");
				serializer.text(sms.getBody());
				serializer.endTag(null, "body");
				serializer.startTag(null, "date");
				serializer.text(sms.getDate());
				serializer.endTag(null, "date");
				serializer.endTag(null, "sms");
			}
			serializer.endTag(null, "smss");
			serializer.endDocument();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
