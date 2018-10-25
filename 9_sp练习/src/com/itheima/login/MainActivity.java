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
		
		//�ȳ�ʼ��spʵ��
		/**
		 * name �������������һ��xml�ļ�
		 * mode ģʽ
		 */
		sp = getSharedPreferences("config", 0);
		//1.�ҵ� ���ǹ��ĵĿؼ�
		et_name = (EditText) findViewById(R.id.et_username);
		et_password = (EditText) findViewById(R.id.et_password);
		
		cb_ischeck = (CheckBox) findViewById(R.id.cb_ischeck);
		//2.��config.xml�ļ��а�����ȡ������Ȼ����ʾ��edittext
		String name = sp.getString("name", "");
		String pwd = sp.getString("pwd", "");
		
		boolean result = sp.getBoolean("ischecked", false);
		if (result) {
			cb_ischeck.setChecked(true);
		}
		
		//3.��name��pwd���õ�edittext��
		et_name.setText(name);
		et_password.setText(pwd);
		 
		//TODO С��ҵ
		
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
					//2.4ʹ��SharePreferencesȥ��������  �õ�spʵ��
				
				
					//2.5 ��ȡsp�ı༭��
					Editor edit = sp.edit();
					edit.putString("name", name);
					edit.putString("pwd", pwd);
					
					//����checkbox��״̬
					edit.putBoolean("ischecked", true);
					
					edit.commit();
					
				} else {
					Toast.makeText(MainActivity.this, "�빴ѡcb", 1).show();
				}
			}
	}
	
}