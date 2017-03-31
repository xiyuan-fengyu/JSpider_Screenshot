package com.xiyuan.screenshot.task;

import com.google.gson.JsonElement;
import com.xiyuan.spider.annotation.OnStart;
import com.xiyuan.spider.annotation.Task;

/**
 * Created by xiyuan_fengyu on 2017/3/31.
 */
@Task
public class Screenshot {

    @OnStart(name = "截图功能", url = "https://www.baidu.com", js = "js/Screenshot.js", timeout = 30)
    public void test(String url, JsonElement result) {
        System.out.println(result);
    }

}
