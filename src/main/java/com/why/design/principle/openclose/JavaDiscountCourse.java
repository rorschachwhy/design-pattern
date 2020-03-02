package com.why.design.principle.openclose; /**
 * @Author: wanghaiyang
 * @Date: 2020/3/1 4:25 PM
 * @Description:
 */

import java.math.BigDecimal;

/**
 * @Author: wanghaiyang
 * @Date: 2020/3/1 4:25 PM
 * @Description:
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, BigDecimal price) {
        super(id, name, price);
    }


//    public BigDecimal getOriginPrice() {
//        return super.getPrice();
//    }

//    @Override
//    public BigDecimal getPrice() {
//        return super.getPrice().multiply(new BigDecimal(0.8));
//    }

    public BigDecimal getDiscountPrice() {
        return super.getPrice().multiply(new BigDecimal(0.8));
    }
}
