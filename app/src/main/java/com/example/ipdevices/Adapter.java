package com.example.ipdevices;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>
{
	Context context;
	List<Model> devices = new ArrayList<>();

	public Adapter(Context context, List<Model> devices)
	{
		this.context = context;
		this.devices = devices;
	}

	@NonNull
	@Override
	public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i)
	{
		View view = LayoutInflater.from(context).inflate(R.layout.single_item,viewGroup,false);
		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i)
	{
		viewHolder.name.setText(devices.get(i).getName());
		viewHolder.ip.setText(devices.get(i).getIp());
	}

	@Override
	public int getItemCount()
	{
		if (devices == null)
		{return 0;}
		else
		{
			return (int) devices.size();
		}
	}

	class ViewHolder extends RecyclerView.ViewHolder
	{
		TextView name, ip;

		public ViewHolder(@NonNull View itemView)
		{
			super(itemView);
			name = (TextView) itemView.findViewById(R.id.device_name);
			ip = (TextView) itemView.findViewById(R.id.device_ip);
		}
	}
}
