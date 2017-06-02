package com.example.xy.smartbutler.entity;

/*
 *   项目名: SmartButler
 *     包名:  com.example.xy.smartbutler.entity
 *    文件名: CourierData
 *  创建时间: 2017/6/2 10:33
 *   描述 :   快递查询实体类
 */
public class CourierData {
    //时间
    private String datetime;
    //状态
    private String remark;
    //城市
    private String zone;

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "CourierData{" +
                "datetime='" + datetime + '\'' +
                ", remark='" + remark + '\'' +
                ", zone='" + zone + '\'' +
                '}';
    }
}
