package com.changgou.goods.controller;

import com.changgou.core.controller.CoreController;
import com.changgou.goods.pojo.Brand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.changgou.goods.controller *
 * @since 1.0
 */
@RestController
@RequestMapping("/brand")
public class TestController extends CoreController<Brand> {
}
