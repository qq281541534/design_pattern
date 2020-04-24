package com.theone.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/14 17:39
 * @Description: TODO
 */
public class MailUtil {
    public static void sendMail(Mail mail){
        String content = "向{0}同学，邮件地址：{1},邮件内容：{2}发送邮件, 创建时间：{3}";
        System.out.println(MessageFormat.format(content, mail.getName(), mail.getAddress(), mail.getContent(), mail.getCreateDate()));
    }

    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储原始邮件记录，邮件内容：" + mail.getContent());
    }
}
