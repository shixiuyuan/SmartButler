package com.example.xy.smartbutler.entity;

/*
 *   项目名: SmartButler
 *     包名:  com.example.xy.smartbutler.entity
 *    文件名: ChatListData
 *  创建时间: 2017/6/1 18:11
 *   描述 :   对话列表的实体类
 */
public class ChatListData {

    //type,区分左边还是右边
    private int type;

    //文本
    private String text;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
