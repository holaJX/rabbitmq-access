package com.zhsw.rabbitmqaccess.webs;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.springframework.stereotype.Component;


@Component
public class AxisUtil {

	
	public static String sendMeterCommand(String url ,String method,String [] paramsValue) throws AxisFault {
		EndpointReference targetEPR=new EndpointReference(url);
		System.out.println("visitorInfo="+paramsValue[0]+",jsonParams="+paramsValue[1]);
		String paramsName[] = new String[]{"visitorInfo","jsonParams"};
		Options options=new Options();
		options.setTo(targetEPR);
		ServiceClient sender=new ServiceClient();
		sender.setOptions(options);
		options.setAction("http://tempuri.org/"+method);
		
		OMFactory fac=OMAbstractFactory.getOMFactory();  
		
		OMNamespace omNs = fac.createOMNamespace("http://tempuri.org/","tc");
		
		OMElement methodSH = fac.createOMElement(method,omNs);
	
		for(int i=0;i<paramsName.length;i++) {
			OMElement value = fac.createOMElement(paramsName[i], omNs);
			value.addChild(fac.createOMText(value,paramsValue[i]));
			methodSH.addChild(value);
		}
		
		OMElement result=sender.sendReceive(methodSH); 
		return result.toString();
	}


	
}
