package com.theone.design.pattern.structural.flyweight.demo1;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/21 10:24
 * @Description: 经理
 */
public class Manager implements Employee {

    private String reportContent;
    // department属于外部状态，需要根据外部的改变而改变
    private String department;
    // title属于内部状态，不需要根据外部的传入的参数而改变
    private String title = "部门经理";

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public void report() {
        System.out.println(department + "作报告, 报告内容：" + reportContent);
    }

}
