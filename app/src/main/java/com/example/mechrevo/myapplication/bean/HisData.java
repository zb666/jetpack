package com.example.mechrevo.myapplication.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class HisData {
    private String data;

    @Generated(hash = 227576165)
    public HisData(String data) {
        this.data = data;
    }

    @Generated(hash = 2089447536)
    public HisData() {
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
