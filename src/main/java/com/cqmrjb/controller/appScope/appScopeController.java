package com.cqmrjb.controller.appScope;

import com.cqmrjb.service.appScope.AppScopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/appScope")
public class appScopeController {
    @Autowired
    private AppScopeService appScopeService;

    @RequestMapping("/selectAppScopeList")
    @ResponseBody
    public Map<String,Object> selectAppScopeList(@RequestBody Map map){
        Map<String,Object> result = new HashMap<>();
        result = appScopeService.selectAppScope(map);
        return result;
    }
}
