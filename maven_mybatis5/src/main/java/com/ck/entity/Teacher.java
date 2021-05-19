package com.ck.entity;

public class Teacher {

    private int t_id;
    private String t_name;

    public Teacher() {
    }

    public Teacher(int t_id, String t_name) {
        this.t_id = t_id;
        this.t_name = t_name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "t_id=" + t_id +
                ", t_name='" + t_name + '\'' +
                '}';
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }
}
