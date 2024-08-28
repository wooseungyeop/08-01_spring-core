package com.ohgiraffers.section03.properties.subsection01.properties;

import com.ohgiraffers.common.Berverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.util.Date;

@Configuration
// resources 하위의 경로로 기술한다.
@PropertySource("section03/properties/subsection01/properties/product-info.properties")
public class ContextConfiguration {

    @Value("${bread.carpbread.name:팥붕어빵}")
    private String carpBreadName;

    @Value("${bread.carpbread.price:0}")
    private int carpBreadPrice;

    @Value("${berverage.milk.name:걍우유}")
    private String milkName;

    @Value("${berverage.milk.price:0}")
    private int milkPrice;

    @Value("${berverage.milk.capacity:0}")
    private int milkCapacity;

    @Bean
    public Product carpBread(){
        return new Bread(carpBreadName, carpBreadPrice, new Date());
    }

    @Bean
    public Product milk(){
        return new Berverage(milkName, milkPrice,milkCapacity);
    }

    @Bean
    public Product water(@Value("${berverage.water.name:걍물}") String waterName,
                         @Value("${berverage.water.price:0}") int waterPrice,
                         @Value("${berverage.water.capacity:0}") int waterCapacity){
        return new Berverage(waterName, waterPrice, waterCapacity);
    }

    @Bean
    @Scope("prototype")
    public ShoppingCart cart(){
        return new ShoppingCart();
    }


}
