package com.design.patterns.manager.manager;

import com.design.patterns.manager.dispatcher.DispatcherPrototype;
import com.design.patterns.manager.store.Store;
import com.design.patterns.manager.store.StoreImplementation;
import com.design.patterns.manager.utils.FrameType;
import com.design.patterns.utils.Console;

public class ServerManager {
	
	private Server server;
	
	private Store store;
	
	private DispatcherPrototype dispatcherPrototype;
	
	public ServerManager() {
		server = new Server();
		store = new StoreImplementation();
		dispatcherPrototype = new DispatcherPrototype(store, server);
	}

	private void serve() {
		FrameType frameType = null;
		do {
			String string = server.readLine();
			Console.instance().writeln("llego por socket: " + string);
			frameType = FrameType.parser(string);
			if (frameType != FrameType.CLOSE) {
				dispatcherPrototype.dispatch(frameType);	
			}
		} while (frameType != FrameType.CLOSE);
		server.close();
	}

	public static void main(String[] args) {
		new ServerManager().serve();
	}
}
