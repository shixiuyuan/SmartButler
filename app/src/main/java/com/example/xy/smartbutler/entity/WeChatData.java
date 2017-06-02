package com.example.xy.smartbutler.entity;

/*
 *   项目名: SmartButler
 *     包名:  com.example.xy.smartbutler.entity
 *    文件名: WeChatData
 *  创建时间: 2017/6/2 15:41
 *   描述 :   微信精选的数据类(实体类)
 */
public class WeChatData{

    //标题
    private String title;
    //出处
    private String source;
    //图片的url
    private String imgUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
