package com.example.security.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.security.demo.entity.SysUserRole;
import com.example.security.demo.mapper.SysUserRoleMapper;
import com.example.security.demo.service.ISysUserRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author master Feng
 * @since 2021-02-07
 */
@Service
public class SysUserRoleServiceImpl extends ServiceImpl<SysUserRoleMapper, SysUserRole> implements ISysUserRoleService {

    @Override
    public List<SysUserRole> listByUserId(Integer id) {
        return this.list(new QueryWrapper<SysUserRole>().lambda().eq(SysUserRole::getUserId, id));
    }
}
