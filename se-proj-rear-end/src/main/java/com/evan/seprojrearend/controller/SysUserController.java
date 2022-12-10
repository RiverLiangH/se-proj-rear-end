package com.evan.seprojrearend.controller;

import com.evan.seprojrearend.po.SysUser;
import com.evan.seprojrearend.service.JsonResult;
import com.evan.seprojrearend.service.SysUserService;
import oracle.jdbc.proxy.annotation.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SysUserController {
    @Autowired
    private SysUserService SysUserService;

    @GetMapping("user/v1/{email}")
    public JsonResult findSysUser(@PathVariable String email)throws Exception {
        return JsonResult.isOk(SysUserService.findSysUser(email));
    }

    //1.1用户登录验证
    @GetMapping("user/v2/{email}/{password}")
    public JsonResult validSysUser(@PathVariable String email,@PathVariable String password)throws Exception{
        return JsonResult.isOk(SysUserService.isInSysUser(email,password));
    }

    //1.2用户注册
    @PostMapping("user/v3/{email}/{password}")
    public JsonResult newSysUser(@PathVariable String email,@PathVariable String password)throws Exception{
        return JsonResult.isOk(SysUserService.newSysUser(email,password));
    }

    //1.3批量导入数据

    //1.4用户绑定虚拟账户
    @PostMapping("user/v4/{email}/{school_id}")
    public JsonResult bindVirtualAccount(@PathVariable String email,@PathVariable Integer school_id)throws Exception{
        //return JsonResult.isOk(SysUserService.newSysUser(email,password));
        return JsonResult.isOk(SysUserService.bindVirtualAccount(email,school_id));
    }




}
