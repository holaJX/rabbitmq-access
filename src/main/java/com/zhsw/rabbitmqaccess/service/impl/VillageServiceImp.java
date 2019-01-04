package com.zhsw.rabbitmqaccess.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhsw.rabbitmqaccess.dao.VillageDao;
import com.zhsw.rabbitmqaccess.entity.Village;
import com.zhsw.rabbitmqaccess.service.VillageService;
import org.springframework.stereotype.Service;

@Service
public class VillageServiceImp extends ServiceImpl<VillageDao,Village> implements VillageService {
}
