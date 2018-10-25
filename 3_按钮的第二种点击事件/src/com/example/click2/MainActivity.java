package com.example.click2;

import android.app.Activity;
import android.content.DialogInterface;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText et_number;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//����һ������
		setContentView(R.layout.activity_main);
		et_number = (EditText) findViewById(R.id.editText1);
		//2.�ҵ���ť
		Button btn_call = (Button) findViewById(R.id.button1);
		
		//3.����ť����һ������¼�
		
		//�ť�ĵڶ��ֵ���¼� �����ڲ���ķ�ʽ
		
		btn_call.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				callPhone();
				
			}
		});
	
		
	}
	
	private void callPhone() {
		//4.��ȡedittext�ı�����
		String number = et_number.getText().toString().trim();
		if("".equals(number)) {
			Toast.makeText(MainActivity.this, "number����Ϊ��", 1).show();
			return;
		}
		//5.���в���绰 ��ͼIntent
		Intent intent = new Intent();//����һ����ͼ
		//���ö���
		intent.setAction(Intent.ACTION_CALL);
		//����Ҫ���������
		/**
		 * uri:ͳһ��Դ��ʾ�����������Լ�����ģ�
		 * url:ͳһ��Դ��λ����������
		 */
		intent.setData(Uri.parse("tel:"+number));
		
		//6.������ͼ
		startActivity(intent);
	}
	
	

	
}
