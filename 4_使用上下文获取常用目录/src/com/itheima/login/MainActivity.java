package com.itheima.login;

import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import com.itheima.usecontext.R;

public class MainActivity extends Activity {

	private EditText et_name;
	private EditText et_password;
	private CheckBox cb_ischeck;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//1.找到 我们关心的控件
		et_name = (EditText) findViewById(R.id.et_username);
		et_password = (EditText) findViewById(R.id.et_password);
		
		cb_ischeck = (CheckBox) findViewById(R.id.cb_ischeck);
		//1.1读取data/data下info.txt的信息
		Map<String, String> maps = UserInfoUtils.readInfo(MainActivity.this);
		if (maps!=null) {
			//把name和pwd取出来 
			String name = maps.get("name");
			String pwd = maps.get("pwd");
			
			//把name和pwd显示在editText控件上
			
			et_name.setText(name);
			et_password.setText(pwd);
		}
	}
	
	//写按钮的点击事件
	public void login(View v) {
		
		//2.1获取用户名和密码
			String name = et_name.getText().toString().trim();
			String pwd = et_password.getText().toString().trim();
			//2.2判断name和pwd是否为空
			if(TextUtils.isEmpty(name)||TextUtils.isEmpty(pwd)) {
				Toast.makeText(MainActivity.this, "用户名或密码不能为空", 1).show();
			}else {
				//2.3进行登录的逻辑
				System.out.println("连接服务器");
				
				if (cb_ischeck.isChecked()) {
					if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageDirectory())) {
						//2.4把用户名和密码存起来
						boolean result = UserInfoUtils.saveInfo(MainActivity.this,name, pwd);
						if (result) {
							Toast.makeText(MainActivity.this, "保存成功", 1).show();
						}else {
							Toast.makeText(MainActivity.this, "保存失败", 1).show();
						}
					} else {
						Toast.makeText(MainActivity.this, "请勾选cb", 1).show();
					}
					} else {
						Toast.makeText(MainActivity.this, "sd卡不存在--", 1).show();
					}
					
					
			}
	}
	
}