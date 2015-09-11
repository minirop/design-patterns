package com.formation.iterators;

public class MainIterator {

	public static void main(String[] args) {
		ChannelCollectionImpl cci = new ChannelCollectionImpl();
		cci.addChannel(new Channel("TF1", ChannelTypeEnum.NEWS));
		cci.addChannel(new Channel("France 2", ChannelTypeEnum.NEWS));
		cci.addChannel(new Channel("France 3", ChannelTypeEnum.GENERAL));
		cci.addChannel(new Channel("Eurosport", ChannelTypeEnum.SPORT));
		cci.addChannel(new Channel("Gulli", ChannelTypeEnum.KIDS));
		
		for(Channel c : cci) {
			System.out.println(c.getName());
		}
		
		System.out.println("-----------------");
		
		ChannelIterator ci = cci.iterator(ChannelTypeEnum.KIDS);
		while(ci.hasNext()) {
			System.out.println(ci.next().getName());
		}
	}

}
