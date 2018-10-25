package com.itheima.xmlparser;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;

import android.util.Xml;

public class WeatherParser {
	public static List<Sms> parserXml(InputStream in) throws Exception{
		List<Sms> weatherLists = null;
		Sms sms = null;
		//获取XmlPullParser解析实例
		XmlPullParser pullParser = Xml.newPullParser();
		//设置参数
		pullParser.setInput(in, "utf-8");
		//获取事件类型
		int type = pullParser.getEventType();
		while (type != XmlPullParser.END_DOCUMENT) {
			switch (type) {
			case XmlPullParser.START_TAG://解析开始标签
				if ("smss".equals(pullParser.getName())) {
					//创建一个集合
					weatherLists = new ArrayList<Sms>();
				}else if ("sms".equals(pullParser.getName())) {
					//创建Sms对象
					sms = new Sms();
					String id = pullParser.getAttributeValue(0);
					sms.setId(id);
				}else if ("address".equals(pullParser.getName())) {
					String address = pullParser.nextText();
					sms.setAddress(address);
				}else if ("body".equals(pullParser.getName())) {
					String body = pullParser.nextText();
					sms.setBody(body);
				}else if ("date".equals(pullParser.getName())) {
					String date = pullParser.nextText();
					sms.setDate(date);
				}
				break;

			case XmlPullParser.END_TAG://解析结束标签
				if ("sms".equals(pullParser.getName())) {
					//把javabean存到集合中
					weatherLists.add(sms);
				}
				break;
			}
			
			type = pullParser.next();//不停向下解析
		}
		
		return weatherLists;
	}
}
