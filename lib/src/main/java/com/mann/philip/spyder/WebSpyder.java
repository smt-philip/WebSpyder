/**
 * 
 */

package com.mann.philip.spyder;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/*******************************************************************************
*<b>Title:</b> WebSpyder.java
*<b>Project:</b> lib
*<b>Description:</b> !!CHANGE ME!!
*<b>Copyright:</b> Copyright (c) 2022
*<b>Company:</b> Silicon Mountain Technologies
@author Philip Mann
@version 1.0
@since Aug 18, 2022
*<b>updates:</b>
*******************************************************************************/

public class WebSpyder {
	
	public enum RequestMethod {
		GET,
		POST,
		UPDATE,
		DELETE
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// get arguements for WebSpyder
		String host = args[0];
		int port = Integer.parseInt(args[1]);
		// pass arguements into process method
		WebSpyder webSpyder = new WebSpyder();
		webSpyder.process(host, port);
	}
	
	/**
	 * 
	 * @param host
	 * @param port
	 */
	public void process(String host, int port) {
		
		// initialize a socket connection
		Socket socket = this.initSocketConn(host, port);
		
		// crawl host's homepage
		this.crawlHost(socket);
		
		// read home page
		
		// parse out all local links
		
		// store homepage in folder, in local system
		
		// save links to a list
		
		// traverse pages in list
		
		// store pages visited, in local system
		
		// visit /admintool endpoint
		 
		// log into admin tool
		
		// save page from admintool endpoint
		
	}

	/**
	 * 
	 * @param host
	 * @param port
	 * @returns a Socket made with host and port
	 */
	public Socket initSocketConn(String host, int port) {
		Socket socket = null;
		try {
			socket = new Socket(host, port);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return socket;
	}
	
	public void crawlHost(Socket socket) {
		System.out.println(socket);
		// read home page
		
		// parse all local links
		
		// add local links to Queue/List
	}

}
