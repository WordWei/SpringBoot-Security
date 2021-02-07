package com.example.security.demo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.security.demo.entity.SysUserRole;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author master Feng
 * @since 2021-02-07
 */
public interface ISysUserRoleService extends IService<SysUserRole> {

    List<SysUserRole> listByUserId(Integer id);
}
