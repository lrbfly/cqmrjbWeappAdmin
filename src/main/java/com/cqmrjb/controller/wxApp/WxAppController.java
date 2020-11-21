package com.cqmrjb.controller.wxApp;

import com.cqmrjb.service.app.WxAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;


@Controller
@RequestMapping("/app")
public class WxAppController {

    @Autowired
    private WxAppService appService;

    @RequestMapping("/addApp")
    @ResponseBody
    public Map<String,Object> save (@RequestBody Map<String,Object> params)
    {
        return appService.addApp(params);
    }

    @RequestMapping("/selectApp")
    @ResponseBody
    public Map<String,Object> selectApp (@RequestBody Map<String,Object> params)
    {
        return appService.selectApp(params);
    }

    @RequestMapping("/updateApp")
    @ResponseBody
    public Map<String,Object> updateApp (@RequestBody Map<String,Object> params)
    {
        return appService.updateApp(params);
    }
}
