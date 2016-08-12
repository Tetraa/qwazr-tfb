package com.qwazrtfb.exemple;

import com.qwazr.library.annotations.Library;
import com.qwazr.tools.FreeMarkerTool;
import freemarker.template.TemplateException;
import com.fasterxml.jackson.databind.ObjectMapper;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class JsonController extends HttpServlet {
	public static final class HelloWorldData {
		public final String message = "Hello, world!";
	}

	private static final ObjectMapper mapper = new ObjectMapper();


	public void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");
		resp.setHeader("Server", "Qwazr");
		mapper.writeValue(resp.getOutputStream(), new HelloWorldData());
	}
}