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

    // промежуточные методы (intermediate) методы должны: 1.- возврвщать ссылку на текущий объект билдера
    //2. - они не должны прерывать проццес построения
    // конечный (terminated) метод должен завершать процесс построения и возвращать итоговый объект.


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
