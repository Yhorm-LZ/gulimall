package com.yhorm.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yhorm.product.entity.BrandEntity;
import com.yhorm.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ProductApplicationTests {

    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        for (BrandEntity brandEntity : list) {
            System.out.println(brandEntity);
        }
    }

}
