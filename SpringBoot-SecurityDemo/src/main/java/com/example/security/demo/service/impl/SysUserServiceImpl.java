package com.example.security.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.security.demo.entity.SysUser;
import com.example.security.demo.mapper.SysUserMapper;
import com.example.security.demo.service.ISysUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author master Feng
 * @since 2021-02-07
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Override
    public SysUser selectByName(String username) {
        return this.getOne(new QueryWrapper<SysUser>().lambda().eq(SysUser::getName, username));
    }
}
