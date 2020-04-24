package com.theone.design.pattern.structural.flyweight.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/21 10:32
 * @Description: 容器单例
 */
public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<String, Employee>();

    /**
     * 获取经理
     * 享元模式+容器单例 实现
     *
     * 根据传入的部门获取经理，如果是第一次进入，则给对应的部门创建经理，并生成对应的报告内容
     * @param department
     * @return
     */
    public static Employee getManager(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            manager = new Manager(department);
            System.out.print("创建部门经理："+department);
            String reportContent = department+"部门汇报，汇报内容。。。";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告:" + reportContent);
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
