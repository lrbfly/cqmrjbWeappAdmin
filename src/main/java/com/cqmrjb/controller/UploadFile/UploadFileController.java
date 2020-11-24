package com.cqmrjb.controller.UploadFile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/uploadFile")
public class UploadFileController {

    @RequestMapping("/uploadImg")
    @ResponseBody
    public Map<String,Object> uploadImg(MultipartFile file){
        Map<String,Object> result = new HashMap<>();

        System.out.println(file);

        return result;
    }
}
