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
		//1.�ҵ� ���ǹ��ĵĿؼ�
		et_name = (EditText) findViewById(R.id.et_username);
		et_password = (EditText) findViewById(R.id.et_password);
		
		cb_ischeck = (CheckBox) findViewById(R.id.cb_ischeck);
		//1.1��ȡdata/data��info.txt����Ϣ
		Map<String, String> maps = UserInfoUtils.readInfo(MainActivity.this);
		if (maps!=null) {
			//��name��pwdȡ���� 
			String name = maps.get("name");
			String pwd = maps.get("pwd");
			
			//��name��pwd��ʾ��editText�ؼ���
			
			et_name.setText(name);
			et_password.setText(pwd);
		}
	}
	
	//д��ť�ĵ���¼�
	public void login(View v) {
		
		//2.1��ȡ�û���������
			String name = et_name.getText().toString().trim();
			String pwd = et_password.getText().toString().trim();
			//2.2�ж�name��pwd�Ƿ�Ϊ��
			if(TextUtils.isEmpty(name)||TextUtils.isEmpty(pwd)) {
				Toast.makeText(MainActivity.this, "�û��������벻��Ϊ��", 1).show();
			}else {
				//2.3���е�¼���߼�
				System.out.println("���ӷ�����");
				
				if (cb_ischeck.isChecked()) {
					if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageDirectory())) {
						//2.4���û��������������
						boolean result = UserInfoUtils.saveInfo(MainActivity.this,name, pwd);
						if (result) {
							Toast.makeText(MainActivity.this, "����ɹ�", 1).show();
						}else {
							Toast.makeText(MainActivity.this, "����ʧ��", 1).show();
						}
					} else {
						Toast.makeText(MainActivity.this, "�빴ѡcb", 1).show();
					}
					} else {
						Toast.makeText(MainActivity.this, "sd��������--", 1).show();
					}
					
					
			}
	}
	
}