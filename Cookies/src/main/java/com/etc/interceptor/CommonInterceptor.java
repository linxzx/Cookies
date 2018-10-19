package com.etc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class CommonInterceptor implements  HandlerInterceptor{
	
	@Override  
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {  
	 request.setCharacterEncoding("utf-8"); 
	 response.setCharacterEncoding("utf-8");
	 System.out.println("_____________________________________________");
	 boolean adminLogin =false;
	 if(request.getSession().getAttribute("adminLogin")!=null)
		 adminLogin =  (boolean) request.getSession().getAttribute("adminLogin");

      if(adminLogin ){   
    	    return true;
        }else { 
        	request.getRequestDispatcher("/web/error").forward(request, response);
        	return false;
        }

}

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}
}