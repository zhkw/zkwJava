package com.zkw;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class UseLog4j {
	public static Logger LOGGER = Logger.getLogger(UseLog4j.class);
	
	public static void config(){
		String connectdir = System.getProperty("user.dir")+File.separator+"src\\log4j.properties";
		System.out.println(connectdir);
		PropertyConfigurator.configure(connectdir);
	}
	public static void main(String[] args) {
		//��ȡʹ��Java�������ļ���д�������ļ�
		config();
        //PropertyConfigurator.configure( "C:\\Users\\zhkw\\workspaceweb\\zkwJava\\src\\log4j.properties" );
        //�����־��Ϣ��������־��������ã������������ļ��У�������������ڵ���Ŀǰ��Ч�������־��Ϣ
        LOGGER.debug("[1]-my level is DEBUG Godtrue ˵�����������ܺ�ѽ��");
        LOGGER.info("[2]-my level is INFO");
        LOGGER.warn("[3]-my level is WARN");
        LOGGER.error("[4]-my level is ERROR");


	}

}
