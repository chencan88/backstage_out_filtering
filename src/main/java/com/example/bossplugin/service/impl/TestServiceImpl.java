package com.example.bossplugin.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.bossplugin.entity.Test;
import com.example.bossplugin.service.TestService;
import com.example.bossplugin.mapper.TestMapper;
import org.springframework.stereotype.Service;

/**
* @author c2
* @description 针对表【test】的数据库操作Service实现
* @createDate 2022-06-23 00:12:48
*/
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test>
implements TestService{

}
