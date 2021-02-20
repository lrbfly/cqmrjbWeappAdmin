package com.cqmrjb.controller.appMenu;

import com.cqmrjb.service.appMenu.AppContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/appContent")
public class AppMenuConentController {
    @Autowired
    private AppContentService appContentService;


    @RequestMapping("/addAppContent")
    @ResponseBody
    public Map<String,Object> addAppConent(@RequestBody Map map){
        return appContentService.addAppContent(map);
    }

    @RequestMapping("/selectAppContent")
    @ResponseBody
    public Map<String,Object> selectAppContent(@RequestBody Map map){
        return appContentService.selectAppContent(map);
    }

    @RequestMapping("/updateAppContent")
    @ResponseBody
    public Map<String,Object> updateAppContent(@RequestBody Map map){
        return appContentService.updateAppContent(map);
    }


}
