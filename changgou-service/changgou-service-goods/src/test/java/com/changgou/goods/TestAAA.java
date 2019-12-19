package com.changgou.goods;

import com.changgou.goods.pojo.Brand;
import com.changgou.goods.service.TestService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 描述
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.changgou.goods *
 * @since 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestAAA {

    @Autowired
    private TestService testService;

    @Test
    public void testSelect(){
        List<Brand> brands = testService.selectAll();
        System.out.println(brands);
    }
    @Test
    public void testSelectPage(){
        Brand brandx = new Brand();
        //brandx.setName("白金");
        brandx.setLetter("B");
        PageInfo<Brand> byPage = testService.findByPage(1, 10,brandx);
        List<Brand> list = byPage.getList();
        for (Brand brand : list) {
            System.out.println(brand.getName());
        }
        System.out.println(byPage.getTotal());
    }
}
