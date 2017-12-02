package com.rsk.Java;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name== null || name.equals("")) throw new IllegalArgumentException("name");
        this.name = name;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private String partnerName;
    int age;

}
