package com.yuan.utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class IDutils {
    public static String getId() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    @Test
    public void test() {
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
        System.out.println(IDutils.getId());
    }


}