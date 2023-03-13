package com.ctx.filter;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: gateway
 * @ClassName Arrtest
 * @description:
 * @author: ctx
 * @create: 2023-02-02 11:10
 * @Version 1.0
 **/
public class Arrtest {
    public static void main(String[] args) {
        String[] arr=new String[]{"1","4","9","5","11"};
        List<String> list = Arrays.asList(arr);
        ArrayList<String> list1 = new ArrayList<>();
        List<String> collect9 = list.stream().filter(p -> StringUtils.equalsAny(p, "9")).collect(Collectors.toList());
        List<String> collect1 = list.stream().filter(p -> StringUtils.equalsAny(p,  "1")).collect(Collectors.toList());
        List<String> collect11 = list.stream().filter(p -> StringUtils.equalsAny(p, "12")).collect(Collectors.toList());
        list1.addAll(collect9);
        list1.addAll(collect1);
        list1.addAll(collect11);
        System.out.println(list1);
        try {
            System.out.println(1/0);

        }catch (Exception e){

        }
        System.out.println("1");
    }
}
