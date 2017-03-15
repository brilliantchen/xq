package com.xq.lite.net.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(5678);
			Socket client = server.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			PrintWriter out = new PrintWriter(client.getOutputStream());
			while (true) {
				String str = in.readLine();
				System.out.println(str);
				out.println("has receive....");
				out.flush();
				if (str.equals("end"))
					break;
			}
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
