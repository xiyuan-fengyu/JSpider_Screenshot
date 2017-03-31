/**
 * Created by xiyuan_fengyu on 2017/3/31.
 */
loadJQuery(function () {

    //整个网页截图
    screenshot("all.jpeg");

    //dom元素截图
    screenshot("part.jpeg", "#lg");

    //下载图片
    download($("#lg").find("img")[0].src, "logo.png");

    sendResult("ok");

});