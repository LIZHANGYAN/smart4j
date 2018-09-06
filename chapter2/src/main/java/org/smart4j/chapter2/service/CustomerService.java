package org.smart4j.chapter2.service;

import org.smart4j.chapter2.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 */
public class CustomerService {

    /**
     * 获取客户列表
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList(String keyword){
        // TODO
        return null;
    }


    /**
     * 获取客户信息
     * @param id
     * @return
     */
    public Customer getCustomer(long id){
        // TODO
        return null;
    }

    /**
     * 创建客户
     * @param filedMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> filedMap){
        // TODO
        return false;
    }

    /**
     * 更新客户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap){
        // TODO
        return false;
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id){
        // TODO
        return false;
    }
}
