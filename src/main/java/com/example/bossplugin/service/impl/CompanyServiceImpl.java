package com.example.bossplugin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.bossplugin.entity.Company;
import com.example.bossplugin.service.CompanyService;
import com.example.bossplugin.mapper.CompanyMapper;
import org.springframework.stereotype.Service;

/**
* @author c2
* @description 针对表【company(外包，外派公司表)】的数据库操作Service实现
* @createDate 2022-06-23 00:18:00
*/
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company>
implements CompanyService{

}
