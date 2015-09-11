package com.formation.iterators;

public class Channel {
	private String name;
	private ChannelTypeEnum type;
	
	public Channel(String name, ChannelTypeEnum type) {
		this.setName(name);
		this.setType(type);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ChannelTypeEnum getType() {
		return type;
	}

	public void setType(ChannelTypeEnum type) {
		this.type = type;
	}
}
