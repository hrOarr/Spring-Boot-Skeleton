package com.teamdemo.springbootskeleton.utils;

public class Commons {
    public static boolean isEmpty(String str) {
        return (str == null || "".equals(str.trim()));
    }
}
