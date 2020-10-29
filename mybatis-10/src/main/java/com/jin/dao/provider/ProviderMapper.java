package com.jin.dao.provider;

import com.jin.pojo.Provider;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProviderMapper {
    // 增加用户信息
    int add(Provider provider) throws Exception;

    // 通过条件查询providerList
    List<Provider> getProviderList(@Param("proName") String proName, @Param("proCode") String proCode,
                                   @Param("from") Integer currentPageNo, @Param("pageSize") Integer pageSize) throws Exception;

    // 获取供应商列表
    List<Provider> getProList() throws Exception;

    // 通过条件查询供应商表记录数
    int getProviderCount(@Param("proName") String proName, @Param("proCode") String proCode) throws Exception;

    // 通过供应商id删除供应商信息
    int deleteProviderById(@Param("id") Integer id) throws Exception;

    // 通过供应商id获取供应商信息
    Provider getProviderById(@Param("id")Integer id) throws Exception;

    // 修改供应商
    int modify(Provider provider) throws Exception;
}
