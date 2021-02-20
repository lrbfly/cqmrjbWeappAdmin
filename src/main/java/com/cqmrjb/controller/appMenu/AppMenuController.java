package com.cqmrjb.controller.appMenu;

import com.cqmrjb.service.appMenu.AppMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/appMenu")
public class AppMenuController {
    @Autowired
    private AppMenuService appMenuService;

    @RequestMapping("/addAppMenu")
    @ResponseBody
    public Map<String,Object> addAppMenu(@RequestBody Map map){
        return appMenuService.addAppMenu(map);
    }


    @RequestMapping("/selectAppMenu")
    @ResponseBody
    public Map<String,Object> selectAppMenu(@RequestBody Map map){
        return appMenuService.selectAppMenu(map);
    }

    @RequestMapping("/updateAppMenu")
    @ResponseBody
    public Map<String,Object> updateAppMenu(@RequestBody Map map){
        return appMenuService.updateAppMenu(map);
    }


}
