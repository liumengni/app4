package com.example.app4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

//ÖØÐ´Ò»¸öView
public class RabbitView extends View {
	public float bitmapX;
	public float bitmapY;
	
	public RabbitView(Context context) {
		super(context);
		bitmapX = 500;
		bitmapY = 500;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		Paint paint = new Paint();
		Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.ic_launcher);
		canvas.drawBitmap(bitmap, bitmapX, bitmapY, paint);
		if(bitmap.isRecycled()){
			bitmap.recycle();
		}
	}
	

}
