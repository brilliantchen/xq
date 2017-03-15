package com.xq.lite.net.socket;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketService {
	
	public static void main(String[] args) {
		SocketService server = new SocketService();
		server.startUpServer();
		
	}
	
	public void startUpServer(){
        ServerSocket server=null;
        try{
            server=new ServerSocket(5209);
            Socket socket=server.accept();
            System.out.println("服务器启动成功");
            
            InputStream is = socket.getInputStream();
            InputStreamReader isr =new InputStreamReader(is);
            BufferedReader br =new BufferedReader(isr);
            
            String info =null;
            while((info=br.readLine())!=null){
            System.out.println("Hello,我是服务器，客户端说："+info);
            }
            socket.shutdownInput();//关闭输入流
            
            //获取输出流，响应客户端的请求
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.write("Hello World！");
            pw.flush();
            
            pw.close();
            os.close();
            br.close();
            isr.close();
            is.close();
            socket.close();
            server.close();
            
        }catch(Exception e) {
                System.out.println("没有启动监听："+e); //出错，打印出错信息
        }finally{
        	
        }
        
    }
	
	
}
