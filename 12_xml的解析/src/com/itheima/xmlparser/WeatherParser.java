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
		//��ȡXmlPullParser����ʵ��
		XmlPullParser pullParser = Xml.newPullParser();
		//���ò���
		pullParser.setInput(in, "utf-8");
		//��ȡ�¼�����
		int type = pullParser.getEventType();
		while (type != XmlPullParser.END_DOCUMENT) {
			switch (type) {
			case XmlPullParser.START_TAG://������ʼ��ǩ
				if ("smss".equals(pullParser.getName())) {
					//����һ������
					weatherLists = new ArrayList<Sms>();
				}else if ("sms".equals(pullParser.getName())) {
					//����Sms����
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

			case XmlPullParser.END_TAG://����������ǩ
				if ("sms".equals(pullParser.getName())) {
					//��javabean�浽������
					weatherLists.add(sms);
				}
				break;
			}
			
			type = pullParser.next();//��ͣ���½���
		}
		
		return weatherLists;
	}
}
