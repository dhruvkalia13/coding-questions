package com.practice;

import java.util.HashMap;
import java.util.Map;

public class MapLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stopCodeMappingList = "hm-sweden:07,hm-greatbritain:06,hm-ireland:";
        Map<String, String> stopCodeVariantMap = new HashMap<>();
        Map<String, String> stopCodeMap = new HashMap<>();
		
		 if (stopCodeVariantMap.isEmpty()) { stopCodeMap.putAll(stopCodeVariantMap); }
		 
        String[] stopCodeMapingStringArray = stopCodeMappingList.split(",");
        for (String markeStopCode : stopCodeMapingStringArray) {
            String[] marketStopCodeArray = markeStopCode.split(":",-1);
            if (marketStopCodeArray.length > 1) {
                String market = marketStopCodeArray[0];
                String stopCode = marketStopCodeArray[1];
                stopCodeMap.put(market, stopCode);            }
        }
        System.out.println(stopCodeMap);
	}
	

}
