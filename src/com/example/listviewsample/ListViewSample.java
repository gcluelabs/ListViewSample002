package com.example.listviewsample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewSample extends Activity {
	
	/**
	 * ListView
	 */
	ListView mListView;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// Adapterの作成
		ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
		
		// 値を追加
		mAdapter.add("1行目");
		mAdapter.add("2行目");
		mAdapter.add("3行目");
		mAdapter.add("4行目");
		mAdapter.add("5行目");
		mAdapter.add("6行目");
		mAdapter.add("7行目");
		mAdapter.add("8行目");
		mAdapter.add("9行目");
		mAdapter.add("10行目");
		mAdapter.add("11行目");
		mAdapter.add("12行目");
		
		// ListViewの取り込み
		mListView = (ListView)findViewById(R.id.listView1);
		
		// アダプターをセット
		mListView.setAdapter(mAdapter);
	}
}