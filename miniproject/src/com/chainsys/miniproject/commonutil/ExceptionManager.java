package com.chainsys.miniproject.commonutil;

public class ExceptionManager {
   public static String handleException(Exception e,String source,String message) {
	   LogManager.logException(e,source);
	 message += message;
	   String errorPage=HtmlHelper.getHtmlTemplate("Error", message);
        return errorPage;
   }
   
}
