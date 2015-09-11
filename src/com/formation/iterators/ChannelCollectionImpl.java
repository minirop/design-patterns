package com.formation.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection, Iterable<Channel> {

	private List<Channel> channels;
	
	public ChannelCollectionImpl() {
		channels = new ArrayList<>();
	}

	@Override
	public void addChannel(Channel c) {
		channels.add(c);
	}

	@Override
	public void removeChannel(Channel c) {
		channels.remove(c);
	}

	@Override
	public ChannelIterator iterator(ChannelTypeEnum type) {
		return new ChannelIteratorImpl(type, this.channels);
	}
	
	private class ChannelIteratorImpl implements ChannelIterator {
		private ChannelTypeEnum type;
		private List<Channel> channels;
		private int position;
		
		public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
			this.position = 0;
			this.channels = channels;
			this.type = type;
		}

		@Override
		public boolean hasNext() {
			while(position < channels.size()) {
				Channel c = channels.get(position);
				if(type == ChannelTypeEnum.ALL || c.getType() == type) {
					return true;
				} else {
					position++;
				}
			}
			return false;
		}

		@Override
		public Channel next() {
			Channel c = channels.get(position);
			position++;
			return c;
		}
		
	}

	@Override
	public Iterator<Channel> iterator() {
		return iterator(ChannelTypeEnum.ALL);
	}

}
