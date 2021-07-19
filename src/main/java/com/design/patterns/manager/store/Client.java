package com.design.patterns.manager.store;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import com.design.patterns.manager.utils.FrameType;
import com.design.patterns.utils.Console;

public class Client {

	private Socket socket;
	
	private PrintWriter out; 
	
	private BufferedReader in; 
	
	public Client() {
		try {
			socket = new Socket("localhost", 2020);
			Console.instance().writeln("Cliente: conexion establecida");
			OutputStream outStream = socket.getOutputStream();
			InputStream inStream = socket.getInputStream(); 
			out = new PrintWriter(outStream); 
			in = new BufferedReader( new InputStreamReader(inStream));
		} catch (Exception ex){
			ex.printStackTrace();
			System.exit(0);
		}
	}
	
	public void println(String message) {
		out.println(message);
		out.flush();
	}

	public void println(int value) {
		this.println(""+value);
	}

	public int readInt() {
		int line = 0;
		try {
			line = Integer.parseInt(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}

	public boolean readBoolean() {
		boolean line = false;
		try {
			line = Boolean.parseBoolean(in.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return line;
	}
	
	public void close() {
		try {
			this.println(FrameType.CLOSE.name());
			socket.close();
			out.close();
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
