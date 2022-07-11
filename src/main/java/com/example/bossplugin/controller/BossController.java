package com.example.bossplugin.controller;



import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.bossplugin.entity.Company;
import com.example.bossplugin.mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin
@RestController
@RequestMapping(value = "boss")

public class BossController {


    @Autowired
    private CompanyMapper companyMapper;

    @ResponseBody
    @RequestMapping(value = "/queryCompany")
    public List<String>  queryCompany(){
          List<Company> list=companyMapper.selectList(null);
          List<String> list1=new ArrayList<>();
          if (list.size()>0){
              for (Company company:list) {
                  list1.add(company.getName());
              }
          }
        return list1;

    }

    @ResponseBody
    @PutMapping(value = "/addBoss")
    public String  addBoss(String testhtml){

        if(testhtml!=null&&!testhtml.equals(" ")) {
            String[] strs = testhtml.split(" ");
            List<Company> messageList =new ArrayList<>();

//            QueryChainWrapper<Company> queryChainWrapper = new QueryChainWrapper<>();
//
//            companyMapper.selectList(LambdaQuery()
//                    .eq(MessageTemplateDO::getTemplateCode, request.getTemplateCode()))
            return testhtml;
        }

        return "-1";
    }
}
