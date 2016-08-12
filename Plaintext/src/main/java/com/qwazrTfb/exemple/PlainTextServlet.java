package com.qwazrtfb.exemple;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PlainTextServlet extends HttpServlet {
	private static final byte[] HelloWorldByte = ("Hello, World!").getBytes(StandardCharsets.ISO_8859_1);

	protected final void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/plain");
		resp.setHeader("Server", "Qwazr");
		resp.getOutputStream().write(HelloWorldByte);
	}
}