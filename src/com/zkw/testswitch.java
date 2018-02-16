package com.zkw;

public class testswitch {

	public static void main(String[] args) {
		String ysfs = "海运";
		String ysfsdm = "";
        switch(ysfs){
            case "海运":
            	ysfsdm = "1";
                break;
            case "空运":
            	ysfsdm = "2";
                break;
            case "铁路":
            	ysfsdm = "3";
                break;
            case "公路":
            	ysfsdm = "4";
                break;
            case "海陆联运":
            	ysfsdm = "5";
                break;            
        }

	}

}
