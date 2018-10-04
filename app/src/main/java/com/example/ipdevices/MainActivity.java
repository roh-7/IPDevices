package com.example.ipdevices;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
	Adapter adapter;
	List<Model> devices = new ArrayList<>();

	RecyclerView recyclerView;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		recyclerView = findViewById(R.id.recycler);
		recyclerView.setLayoutManager(new LinearLayoutManager(this));
		init();
		adapter = new Adapter(this,devices);
		recyclerView.setAdapter(adapter);
	}

	private void init()
	{
		devices.add(new Model("192.168.43.221","Macbook Pro"));
		devices.add(new Model("192.168.41.224","Macbook Air"));
		devices.add(new Model("192.168.44.221","Dell Inspiron"));
		devices.add(new Model("192.168.43.223","OnePlus X"));
	}
}
