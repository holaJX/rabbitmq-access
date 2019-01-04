package com.zhsw.rabbitmqaccess.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhsw.rabbitmqaccess.dao.TownshipDao;
import com.zhsw.rabbitmqaccess.entity.Township;
import com.zhsw.rabbitmqaccess.service.TownshipService;
import org.springframework.stereotype.Service;

@Service
public class TownshipServiceImp extends ServiceImpl<TownshipDao,Township> implements TownshipService {
}
