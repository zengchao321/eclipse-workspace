package com.example.phonedail;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText et_number;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//加载一个布局
		setContentView(R.layout.activity_main);
		et_number = (EditText) findViewById(R.id.editText1);
		//2.找到按钮
		Button btn_call = (Button) findViewById(R.id.button1);
		
		btn_call.setOnClickListener(new MyClickListener());
		
	}
	
	//定义一个类去实现按钮所需要的接口类型
	private class MyClickListener implements android.view.View.OnClickListener{

		@Override
		public void onClick(View v) {
			//4.获取edittext文本内容
			String number = et_number.getText().toString().trim();
			if("".equals(number)) {
				Toast.makeText(MainActivity.this, "number不能为空", 1).show();
				return;
			}
			//5.进行拨打电话 意图Intent
			Intent intent = new Intent();//创建一个意图
			//设置动作
			intent.setAction(Intent.ACTION_CALL);
			//设置要拨打的数据
			/**
			 * uri:统一资源提示符（别名，自己定义的）
			 * url:统一资源定位符（真名）
			 */
			intent.setData(Uri.parse("tel:"+number));
			
			//6.开启意图
			startActivity(intent);
			
			
		}

	

	}

	
}
