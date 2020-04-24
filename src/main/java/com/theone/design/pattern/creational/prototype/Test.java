package com.theone.design.pattern.creational.prototype;

import java.util.Date;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/14 17:17
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Mail mail = new Mail();
        mail.setContent("模板内容");
        for (int i = 0; i < 10; i++) {
            Mail tmp = (Mail) mail.clone();
            tmp.setName("张" + i + "风");
            tmp.setContent("第" + i + "封信");
            tmp.setAddress(i + "@qq.com");
            tmp.setCreateDate(new Date());
            MailUtil.sendMail(tmp);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
