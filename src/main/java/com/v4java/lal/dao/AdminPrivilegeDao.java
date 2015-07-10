package com.v4java.lal.dao;

import java.util.List;

import com.v4java.lal.pojo.AdminPrivilege;

public interface AdminPrivilegeDao {

    void insertAdminPrivilege(AdminPrivilege adminPrivilege)  throws Exception;
    
    void insertAdminPrivilegeAnduseGeneratedKeys(AdminPrivilege adminPrivilege) throws Exception;
    
    void batchInsertAdminPrivilege(List<AdminPrivilege> adminPrivileges) throws Exception;

    
}