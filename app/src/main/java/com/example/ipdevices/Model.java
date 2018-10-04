package com.example.ipdevices;

public class Model
{
	String ip,name;

	public Model(String ip, String name)
	{
		this.ip = ip;
		this.name = name;
	}

	public String getIp()
	{
		return ip;
	}

	public void setIp(String ip)
	{
		this.ip = ip;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}
