package com.changgou.goods.service.impl;

import com.changgou.core.service.impl.CoreServiceImpl;
import com.changgou.goods.dao.BrandMapper;
import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.changgou.goods.service.impl *
 * @since 1.0
 */
@Service
public class TestServiceImpl extends CoreServiceImpl<Brand> implements TestService {

    @Autowired
    public TestServiceImpl(BrandMapper brandMapper) {
        super(brandMapper, Brand.class);
    }
}
