package com.example.bossplugin.mapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.bossplugin.entity.Company;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
* @author c2
* @description 针对表【company(外包，外派公司表)】的数据库操作Mapper
* @createDate 2022-06-23 00:18:00
* @Entity com.example.bossplugin.entity.Company
*/
@Mapper
public interface CompanyMapper extends BaseMapper<Company> {




}
