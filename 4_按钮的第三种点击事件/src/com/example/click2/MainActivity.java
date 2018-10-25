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
import com.example.click3.R;

public class MainActivity extends Activity implements OnClickListener {

	private EditText et_number;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//����һ������
		setContentView(R.layout.activity_main);
		
		//1�ҵ��ؼ�
		
		Button btn_call2 = (Button)findViewById(R.id.button2);
		Button btn_call3 = (Button)findViewById(R.id.button3);
		Button btn_call4 = (Button)findViewById(R.id.button4);
		
		et_number = (EditText) findViewById(R.id.editText1);
		//2.�ҵ���ť
		Button btn_call = (Button) findViewById(R.id.button1);
		
		//3.����ť����һ������¼�
		
		//�ť�ĵڶ��ֵ���¼� �����ڲ���
		
		//�����ֵ���¼�
		
		btn_call.setOnClickListener(this);
		btn_call2.setOnClickListener(this);
		btn_call3.setOnClickListener(this);
		btn_call4.setOnClickListener(this);
	
		
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

	@Override
	public void onClick(View v) {
		// �����жϵ�������ĸ���ť
		switch (v.getId()) {
		case R.id.button1: //�������˵�һ��ť
			callPhone();
			break;
		case R.id.button2: //�������˵�һ��ť
			callPhone();
			break;
		case R.id.button3: //�������˵�һ��ť
			callPhone();
			break;
		case R.id.button4: //�������˵�һ��ť
			System.out.println("����˭");
			break;
	

		default:
			break;
		}
		
	}
	
	

	
}
