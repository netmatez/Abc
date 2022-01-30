package com.demo.utils;

import net.minidev.json.JSONArray;
import org.jsmart.zerocode.core.engine.executor.javaapi.CustomAsserter;

import java.util.ArrayList;
import java.util.Map;

public class MyAsserts {
    public Boolean asserted(Map<String, Object> inputParamMap, Object actual) {
        System.out.println(inputParamMap.get("arr"));
        /*
            we have the array in variable called "arr" (you can change as u want)
            here you can do anything you want to compare those element

         */
        Object[] expectedToArr = ((JSONArray) actual).toArray();
        Object[] actualToArray = ((ArrayList) inputParamMap.get("arr")).toArray();
        boolean equals = true;
        for (int i = 0; i < expectedToArr.length; i++) {
            equals = equals & expectedToArr[i].equals(actualToArray[i]);
        }
        return equals;
    }
}
