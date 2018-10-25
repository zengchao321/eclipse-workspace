package com.itheima.xmlparser;

import java.io.InputStream;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		try {
			//显示天气信息
			TextView tv_weather = (TextView) findViewById(R.id.tv_weather);
			//获取资产管理者（arrests）
			InputStream in = getAssets().open("weather.xml");
			//调用xml解析方法
			List<Sms> weatherlists = WeatherParser.parserXml(in);
			StringBuffer sb = new StringBuffer();
			for (Sms sms : weatherlists) {
				sb.append(sms.toString());
			}
			//把数据显示到textview上
			tv_weather.setText(sb.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
