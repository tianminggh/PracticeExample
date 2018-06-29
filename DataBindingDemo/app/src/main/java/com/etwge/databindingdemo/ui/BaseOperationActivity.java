package com.etwge.databindingdemo.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.etwge.databindingdemo.R;
import com.etwge.databindingdemo.data.Poem;
import com.etwge.databindingdemo.databinding.ActivityBaseOperationBinding;

public class BaseOperationActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActivityBaseOperationBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_base_operation);
		Poem poem = new Poem("静夜思", "床前明月光，疑是地上霜。\n举头望明月，低头思故乡。");
		binding.setPoem(poem);
	}
}
