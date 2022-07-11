package com.example.bossplugin.Test;


import com.example.bossplugin.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.List;


public class CompanyTest {

    @Autowired
    private static CompanyMapper companyMapper;

    public static void main(String[] args) {
        System.out.println("开始");
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.forEach(System.out::println);
    }
}
