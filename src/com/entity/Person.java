package com.entity;

public class Person {
	//����
    private String name;
    //�Ա�
    private char sex;
    //����
    private int age;
    
  //�вι��캯��
    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    //�޲ҹ��캯��
    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
    
    

}
