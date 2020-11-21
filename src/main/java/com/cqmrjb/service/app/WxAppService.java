package com.cqmrjb.service.app;

import com.cqmrjb.entity.app.WxApp;

import java.util.List;
import java.util.Map;

public interface WxAppService {
    Map addApp(Map map);
    Map selectApp(Map map);
    Map updateApp(Map map);
}
