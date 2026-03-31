package com.app.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Result;
import com.app.product.controller.ProductWriteController;
import com.app.product.controller.ProductWriteOkController;

// req.setCharacterEncoding("UTF-8");
// resp.setContentType("text/html; charset=utf-8;");

public class ProductFrontController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=utf-8;");

		String target = req.getRequestURI().split("\\.")[0].replace(req.getContextPath() + "/", "");
		System.out.println(target);
		Result result = null;
		
		if(target.equals("write")) {
			result = new ProductWriteController().excute(req, resp);
		} else if(target.equals("write-ok")) {
			result = new ProductWriteOkController().excute(req, resp);
		} else  {
			//404
		}

		if(result != null) {
			resp.sendRedirect(req.getContextPath() + result.getPath());
		} else {
			//포워드
			req.getRequestDispatcher(result.getPath()).forward(req, resp);
		}
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
