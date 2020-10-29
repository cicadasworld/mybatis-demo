package com.jin.dao.bill;

import com.jin.pojo.Bill;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillMapper {
    // 根据供应商id查询订单数量
    int getBillCountByProviderId(@Param("providerId") Integer providerId) throws Exception;

    // 增加订单
    int add(Bill bill) throws Exception;

    // 通过查询条件获取供应商列表getBillList
    List<Bill> getBillList(@Param("productName") String productName, @Param("providerId") Integer providerId, @Param("isPayment") String isPayment,
                           @Param("from") Integer currentPageNo, @Param("pageSize") Integer pageSize) throws Exception;

    // 通过条件查询订单表记录数
    int getBillCount(@Param("productName") String productName, @Param("providerId") Integer providerId, @Param("isPayment") String isPayment) throws Exception;

    // 通过id删除订单
    int deleteBillById(@Param("id") Integer id) throws Exception;

    // 通过Id获取订单
    Bill getBillById(@Param("id") Integer id) throws Exception;

    // 修改订单信息
    int modify(Bill bill) throws Exception;

    // 根据供应商id删除订单信息
    int deleteBillByProviderId(@Param("providerId") Integer providerId) throws Exception;
}
