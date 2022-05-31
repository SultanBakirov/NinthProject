package org.example;

import org.springframework.beans.factory.annotation.Value;

public class Cat {
    @Value("${cat.name}")
    private String name;
    @Value("${cat.age}")
    private int age;

    public Cat() {
    }

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
}
