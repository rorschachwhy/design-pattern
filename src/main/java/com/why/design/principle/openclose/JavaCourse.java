package com.why.design.principle.openclose;

import java.math.BigDecimal;

/**
 * @Auther: wanghaiyang
 * @Date: 20/2/25 15:43
 * @Description:
 */
public class JavaCourse implements ICourse {

    private Integer id;
    private String name;
    private BigDecimal price;

    public JavaCourse(Integer id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
}