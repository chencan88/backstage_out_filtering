package com.example.bossplugin;



import com.example.bossplugin.entity.Company;
import com.example.bossplugin.mapper.CompanyMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public  class BossPlugInApplicationTests {
    @Autowired
    private CompanyMapper companyMapper;

    @Test
    public   void contextLoads() {
        System.out.println("开始");
        List<Integer> list= Arrays.asList(1);
        List<Company> list1=companyMapper.selectBatchIds(list);
        list1.forEach(System.out::println);

    }

}
