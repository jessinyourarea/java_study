package com.sist.io;
/*
 	웹을 읽어올때 한글깨짐방지를 어떻게 처리하는지(관건)
 	
 	상속도)
 	URLConnection  => url.openConnection()
 			|
 	---------------------
 	|					|
 	HttpURLConnection  HttpsURLConnection
 	
 	
 */
import java.io.*;
import java.net.*;
public class 입출력_5_URLconn {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		URL url=new URL("https://www.10000recipe.com/recipe/list.html");
		HttpURLConnection conn=
				(HttpURLConnection)url.openConnection();
		//if connected
		if(conn!=null)
		{
			// 브라우저 => 1byte씩 전송 
			// 1byte => 2byte로 변환
			// InputStreamReader
			BufferedReader in=
					new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));	//InputStreamReader 한글이 안 깨진 이유, 
																								//그래도 깨진다면!? conn.getInputStream(),"UTF-8" 으로 입력/변환
			while(true)
			{
				String data=in.readLine();
				if(data==null) break;
				System.out.println(data);
			}
			in.close();
			conn.disconnect();
		}
		
		
	}

}
