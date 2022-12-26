package com.technews.testModel;

import java.util.Objects;

public class demo {
    private String name;
    private int age;
    public demo(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        demo demo = (demo) o;
        return age == demo.age && Objects.equals(name, demo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
