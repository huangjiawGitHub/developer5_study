package com.ck.entity;

public class booktype {
    private int btid;
    private String btname;

    public booktype() {
    }

    public booktype(int btid, String btname) {
        this.btid = btid;
        this.btname = btname;
    }

    @Override
    public String toString() {
        return "booktype{" +
                "btid=" + btid +
                ", btname='" + btname + '\'' +
                '}';
    }

    public int getBtid() {
        return btid;
    }

    public void setBtid(int btid) {
        this.btid = btid;
    }

    public String getBtname() {
        return btname;
    }

    public void setBtname(String btname) {
        this.btname = btname;
    }
}
