package com.example.security.demo.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.security.demo.entity.SysUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author master Feng
 * @since 2021-02-07
 */
public interface ISysUserService extends IService<SysUser> {

    SysUser selectByName(String username);
}
