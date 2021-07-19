package com.design.patterns.manager.dispatcher;

import java.util.HashMap;
import java.util.Map;

import com.design.patterns.manager.manager.Server;
import com.design.patterns.manager.store.Store;
import com.design.patterns.manager.utils.FrameType;

public class DispatcherPrototype {
	
	private Map<FrameType, Dispatcher> dispatcherMap;

	public DispatcherPrototype(Store store, Server server) {
		dispatcherMap = new HashMap<FrameType, Dispatcher>();
		dispatcherMap.put(FrameType.ADD, new AddDispatcher(store, server));
		dispatcherMap.put(FrameType.REMOVE, new RemoveDispatcher(store, server));
		dispatcherMap.put(FrameType.EXIST, new ExistDispatcher(store, server));
		dispatcherMap.put(FrameType.LIST, new ListDispatcher(store, server));
	}

	public void dispatch(FrameType frameType) {
		dispatcherMap.get(frameType).clone().dispatch();
	}
}
