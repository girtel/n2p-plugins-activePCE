/*
 *  Copyright (c) 2016 Jose-Juan Pedreno-Manresa, Jose-Luis Izquierdo-Zaragoza, Pablo Pavon-Marino
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the GNU Lesser Public License v3
 *  which accompanies this distribution, and is available at
 *  http://www.gnu.org/licenses/lgpl.html
 *
 *  Contributors:
 *          Jose-Juan Pedreno-Manresa
 *          Jose-Luis Izquierdo-Zaragoza
 */

package es.upct.girtel.net2plan.plugins.activepce.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public abstract class RequestHandler
{
	protected Socket       _socket;
	protected InetAddress  _ipAddress;
	protected InputStream  _input;
	protected OutputStream _output;

	public RequestHandler(Socket socket) throws IOException
	{
		_socket = socket;
		_input = _socket.getInputStream();
		_output = _socket.getOutputStream();
		_ipAddress = null;
	}

	public abstract void doService();
	
	public OutputStream getOutputStream() { return _output; }
}
