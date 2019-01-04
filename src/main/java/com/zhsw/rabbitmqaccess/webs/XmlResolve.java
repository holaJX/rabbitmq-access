package com.zhsw.rabbitmqaccess.webs;


import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * 解析xml返回值
 * @author ck
 *
 */
public class XmlResolve {

	
	public static String resolve(String result) {
		 Document document = null;
		 try {  
		        document = DocumentHelper.parseText(result);
		        Element rootElement = document.getRootElement();
		        Element childElement = (Element) rootElement.elements().get(0);
		        System.out.println(childElement.getTextTrim());
		        return childElement.getTextTrim();
		    } catch (Exception ex) {  
		        ex.printStackTrace();  
		    }  
		    return null;  
	}
}
