package com.cqmrjb.controller.UploadFile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/uploadFile")
public class UploadFileController {

    @RequestMapping("/uploadImg")
    @ResponseBody
    public Map<String,Object> uploadImg(@RequestParam("file") MultipartFile[] file, @RequestParam Map<String,String> map){
        Map <String,Object> result = new HashMap<>();
        List<String> list = new ArrayList<>();

        for(int i=0,l=file.length;i<l;i++){
            String filename = file[i].getOriginalFilename();//上传图片的名字

            String suffixName = filename.substring(filename.lastIndexOf("."));
            String name = UUID.randomUUID().toString();
            filename = name + suffixName;//图片重命名
            String imgFilePath = "E:/jsr_img/";
            String path_img = imgFilePath + filename;//图片存储路径
            //第一次如果没有保存图片的文件夹创建文件夹
            File dest = new File(path_img);
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();
            }
            //将上传文件存储到服务器中
            try {
                file[i].transferTo(dest);
                list.add("img/"+filename);
                result.put("msg","上传成功");
            } catch (IOException e) {
                list = null;
                result.put("msg","上传失败");
                e.printStackTrace();
            }
        }




        result.put("code",200);
        result.put("data",list);

        return result;
    }
}
