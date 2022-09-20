package com.example.app_utils.utils.splash;

/**
 * @author
 * @Date 2022/9/20
 * @Edit
 * @describe
 * @From or To
 * @Mark
 */
public class GuideItem {
    String name;
    int id;

    public GuideItem(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
