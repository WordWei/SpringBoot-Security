package com.example.security.demo.controller;


import com.example.security.demo.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author master Feng
 * @since 2021-02-07
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    ISysUserService iSysUserService;

}
