package com.xq.lite.collection.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {

  public static void main( String[] args ){

    Object obj = new Object();

    HashMap<String, String> map1 = new HashMap<>();
    System.out.println(map1.put("1", "11"));
    System.out.println(map1.put("2", "22"));
/*
    System.out.println(map1.get("0"));
    System.out.println(map1.get("1"));

    //Collections.synchronizedMap()

    ConcurrentHashMap<String, String> map2 = new ConcurrentHashMap<String, String>();
    System.out.println(map2.put("3", "33"));*/


  }

}
