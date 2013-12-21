package com.frame.easyandroid;

import com.frame.easyandroid.imageloader.ImageLoaderDemoActivity;
import com.frame.easyandroid.util.Constant;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

	private Button button;

	@Override
	protected int showLayoutView() {

		return R.layout.main;
	}

	@Override
	protected void setUpView() {
		//辅助关闭程序的代码
		if(Constant.isBack){
			Constant.isBack = false;
			this.finish();
		}
		button = getViewById(R.id.main_bt);
	}

	@Override
	protected void fillData() {
		
	}

	@Override
	protected void setListener() {
		button.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent(MainActivity.this, ImageLoaderDemoActivity.class);
		startActivity(intent);
	}
}
