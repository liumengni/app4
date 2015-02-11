package com.example.app4;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;




public class MainActivity extends Activity {
	//��ʾ����ͼƬ
//	private ImageView[] img = new ImageView[4];
//	private int[] imagePath = new int[]{R.drawable.background,R.drawable.background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//��ʾ����ͼƬ
//        setContentView(R.layout.main);
//        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
//        for(int i = 0;i < imagePath.length;i++){
//        	img[i] = new ImageView(this);
//        	img[i].setImageResource(imagePath[i]);
//        	img[i].setPadding(5, 5, 5, 5);
//        	LayoutParams params = new LayoutParams(500,500);
//        	img[i].setLayoutParams(params);
//        	layout.addView(img[i]);
//        }
        
//        �滻���ͼ��
//        setContentView(R.layout.main);
//        FrameLayout framelayout = (FrameLayout) findViewById(R.id.mylayout);
//        final RabbitView rabbit = new RabbitView(MainActivity.this);
//        rabbit.setOnTouchListener(new OnTouchListener(){
//        	public boolean onTouch(View v,MotionEvent event){
//        		rabbit.bitmapX = event.getX();
//        		rabbit.bitmapY = event.getY();
//        		rabbit.invalidate();
//        		return true;
//        	}
//        });
//        framelayout.addView(rabbit);
        
//intentʹ��
        setContentView(R.layout.table);
        Button next = (Button) findViewById(R.id.button_next);
        next.setOnClickListener(new View.OnClickListener(){
        	
        	public void onClick(View v){
        		
//        		Intent intent = new Intent();
//        		intent.setClass(MainActivity.this, NewActivity.class);
//        		startActivity(intent);
//        		��ʽintentʵ�ֻ�����ת

//        		Intent intent = new Intent("com.example.app4.ACTION");
//        		startActivity(intent);
//        		��ʽintentʵ�ֻ�����ת1
        		
//        		Intent intent = new Intent("com.example.app4.ACTION");
//        		intent.addCategory("com.example.app4.MY_CATEGORY");
//        		startActivity(intent);
//        		��ʽintentʵ�ֻ�����ת2
        		
//        		Intent intent = new Intent(Intent.ACTION_VIEW);
//        		intent.setData(Uri.parse("http://www.baidu.com"));
//        		startActivity(intent);
//        		��ʽintentʵ�ֵ���������򿪰ٶ�ҳ��
        		
//        		Intent intent = new Intent(Intent.ACTION_DIAL);
//        		intent.setData(Uri.parse("tel:7225418"));
//        		startActivity(intent);
//        		��ʽintentʵ�ֵ��ô򿪲��Ž���
        		
//        		String data = "hello new activity";
//        		Intent intent = new Intent();
//        		intent.setClass(MainActivity.this, NewActivity.class);
//        		intent.putExtra("extra_data", data);
//        		startActivity(intent);
//        		ʹ��intent��������
        		
        		Intent intent = new Intent();
        		intent.setClass(MainActivity.this, NewActivity.class);
        		startActivityForResult(intent,1);
//        		ʹ��intentʹ�ô�NewActivity�ܹ���������
        		
        		
        	}
        	
        });
        
    }
    
    

    
//��ȡ��ͨ��intent��NewActivity���ص�����    
@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch(requestCode){
		case 1:
			if(resultCode == RESULT_OK){
				String returnedData = data.getStringExtra("data_return");
				Log.d("MainActivity",returnedData);
			}
			break;
		default:
		}
	}


	//    �˵��������
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //�˵����ʹ��
    	
        int id = item.getItemId();
        if (id == R.id.add_item) {
            Toast.makeText(this, "you click add", Toast.LENGTH_SHORT).show();
        }else if(id == R.id.remove_item) {
        	Toast.makeText(this, "you click remove", Toast.LENGTH_SHORT).show();
        }else {
        	Toast.makeText(this, "you click none", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
