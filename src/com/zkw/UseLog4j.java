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
		//读取使用Java的特性文件编写的配置文件
		config();
        //PropertyConfigurator.configure( "C:\\Users\\zhkw\\workspaceweb\\zkwJava\\src\\log4j.properties" );
        //输出日志信息，测试日志级别的作用（配置在配置文件中），仅仅输出大于等于目前有效级别的日志信息
        LOGGER.debug("[1]-my level is DEBUG Godtrue 说：今天天气很好呀！");
        LOGGER.info("[2]-my level is INFO");
        LOGGER.warn("[3]-my level is WARN");
        LOGGER.error("[4]-my level is ERROR");


	}

}
