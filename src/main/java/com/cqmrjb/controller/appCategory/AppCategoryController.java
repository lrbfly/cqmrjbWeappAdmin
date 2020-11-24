package com.cqmrjb.controller.appCategory;

import com.cqmrjb.entity.appCategory.AppCategory;
import com.cqmrjb.service.appCategory.AppCategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/appCategory")
public class AppCategoryController {
    @Resource
    private AppCategoryService appCategoryService;

    @RequestMapping("/selectAppCategoryList")
    @ResponseBody
    public Map<String,Object> selectAppCategoryList(@RequestBody Map<String,Object> params){
        Map<String,Object> result = new HashMap<>();
        result = appCategoryService.selectAppCategory(params);
        return result;
    }
}
