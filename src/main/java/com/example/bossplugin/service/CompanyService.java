package com.example.bossplugin.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.example.bossplugin.entity.Company;
import com.baomidou.mybatisplus.service.IService;

/**
* @author c2
* @description 针对表【company(外包，外派公司表)】的数据库操作Service
* @createDate 2022-06-23 00:18:00
*/
public interface CompanyService extends IService<Company> {

    boolean  selectCompanyName(Wrapper wrapper);

}
