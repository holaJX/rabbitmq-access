package com.zhsw.rabbitmqaccess.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhsw.rabbitmqaccess.dao.CountyDao;
import com.zhsw.rabbitmqaccess.entity.County;
import com.zhsw.rabbitmqaccess.service.CountyService;
import org.springframework.stereotype.Service;

@Service
public class CountyServiceImp extends ServiceImpl<CountyDao,County> implements CountyService {
}
