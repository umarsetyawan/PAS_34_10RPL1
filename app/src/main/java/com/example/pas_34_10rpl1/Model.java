package com.example.pas_34_10rpl1;

public class Model {

    private String Name, Desc;
    private int img;

    public Model(String name, String desc, int img) {
        Name = name;
        Desc = desc;
        this.img = img;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
