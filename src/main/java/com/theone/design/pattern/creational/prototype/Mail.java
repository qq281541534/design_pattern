package com.theone.design.pattern.creational.prototype;

import java.util.Date;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/14 17:16
 * @Description: TODO
 */
public class Mail implements Cloneable{

    private String name;

    private String content;

    private String address;

    private Date createDate;

    public Mail(){
        System.out.println("Mail Class Constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", address=" + address +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("clone mail object");
        return super.clone();
    }
}
