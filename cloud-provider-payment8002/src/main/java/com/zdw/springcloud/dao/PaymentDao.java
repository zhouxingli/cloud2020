package com.zdw.springcloud.dao;

import com.zdw.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao  {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
