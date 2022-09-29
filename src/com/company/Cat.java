package com.company;

import java.util.LinkedList;

public class Cat {
    private String name;
    private  int age;
    private LinkedList<String> vaclist=new LinkedList<>();


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", vaclist=" + vaclist +
                '}';
    }

    public static class Builder {
        private Cat cat= new Cat();
        public Builder  setName(String name){
            cat.name=name;
            return this;
        }
        public Builder setAge(int age){
            cat.age=age;
            return this;

        }

        public Builder addVaclist(String v){
            cat.vaclist.add(v);
            return this;
        }

        public Cat build(){
            return this.cat;
        }
    }
}
