package com.example.app4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class NewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
		
//		Intent intent = getIntent();
//		String data = intent.getStringExtra("extra_data");
//		Log.d("NewActivity",data);
//		获取上个活动通过intent传递的数据
		
		Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.putExtra("data_return", "returndata");
				setResult(RESULT_OK,intent);
				finish();
			}
		});
//		通过intent返回数据给MainActivity
	}

	
//	按返回键时，通过intent返回数据给MainActivity
	@Override
	public void onBackPressed() {
		Intent intent = new Intent();
		intent.putExtra("data_return", "returndata");
		setResult(RESULT_OK,intent);
		finish();
	}
	
	

}
