package com.example.connectionactivity;

import java.io.Serializable;

public class HocSinh implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HocSinh(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
