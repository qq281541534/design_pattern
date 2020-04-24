package com.theone.design.pattern.structural.flyweight.demo1;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/21 10:43
 * @Description: 使用随机的部门，获取部门经理做报告
 */
public class Test {
    private static final String[] departments = {"RD","QA","PM"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int) (Math.random()*departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
