package com.zkw;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;


public class test30 {
	public static Logger LOGGER = Logger.getLogger(test30.class);
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		String pattern = "%d [%-5p] - %m%n";
		Layout layout = new PatternLayout(pattern);
		//Appender appender= new ConsoleAppender(layout);
		Appender appender= null;
		
//		try {
//	          appender = new FileAppender(layout,"F:/logs/testFileAppender.log");
////	          appender = new FileAppender(layout,"F:/logs/testFileAppender.log",false);
//	      } catch (IOException e) {
//	          e.printStackTrace();
//	      }
		try {
          appender = new DailyRollingFileAppender(layout,"F:/logs/testDailyRollingFileAppender.log","'.'yyyy-MM-dd-HH-mm");
      } catch (IOException e) {
          e.printStackTrace();
      }


		
        //�Զ����ٵ�ʹ��ȱʡLog4j����
        BasicConfigurator.configure(appender);
              
        LOGGER.setLevel(Level.INFO);
        //��ӡ��ǰ����־��Ϣ��Ч����
        LOGGER.fatal("the effective level is : "+LOGGER.getEffectiveLevel());
        //������־��������ã�����������ڵ���Ŀǰ��Ч�������־��Ϣ
        LOGGER.trace("my level is TRACE");
        LOGGER.debug("my level is DEBUG");
        LOGGER.info(" my level is INFO");
        LOGGER.warn(" my level is WARN");
        LOGGER.error("my level is ERROR");
        LOGGER.fatal("my level is FATAL");


	}


}
