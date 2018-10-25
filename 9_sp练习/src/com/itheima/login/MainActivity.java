package com.itheima.login;

import java.util.Map;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import com.itheima.sptest.R;

public class MainActivity extends Activity {

	private EditText et_name;
	private EditText et_password;
	private CheckBox cb_ischeck;
	private SharedPreferences sp;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//先初始化sp实例
		/**
		 * name 会帮助我们生成一个xml文件
		 * mode 模式
		 */
		sp = getSharedPreferences("config", 0);
		//1.找到 我们关心的控件
		et_name = (EditText) findViewById(R.id.et_username);
		et_password = (EditText) findViewById(R.id.et_password);
		
		cb_ischeck = (CheckBox) findViewById(R.id.cb_ischeck);
		//2.在config.xml文件中吧数据取出来，然后显示到edittext
		String name = sp.getString("name", "");
		String pwd = sp.getString("pwd", "");
		
		boolean result = sp.getBoolean("ischecked", false);
		if (result) {
			cb_ischeck.setChecked(true);
		}
		
		//3.把name和pwd设置到edittext上
		et_name.setText(name);
		et_password.setText(pwd);
		 
		//TODO 小作业
		
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
					//2.4使用SharePreferences去保存数据  拿到sp实例
				
				
					//2.5 获取sp的编辑器
					Editor edit = sp.edit();
					edit.putString("name", name);
					edit.putString("pwd", pwd);
					
					//储存checkbox的状态
					edit.putBoolean("ischecked", true);
					
					edit.commit();
					
				} else {
					Toast.makeText(MainActivity.this, "请勾选cb", 1).show();
				}
			}
	}
	
}