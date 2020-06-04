package com.theone.design.pattern.structural.proxy.db;

/**
 * @Author: liuyu
 * @DateTime: 2020/5/25 15:32
 * @Description: 数据源上下文持有者
 */
public class DataSourceContextHolder {

    /**
     * ThreadLocal 用于提供线程局部变量，在多线程环境可以保证各个线程里的变量独立于其它线程里的变量。
     * 也就是说 ThreadLocal 可以为每个线程创建一个【单独的变量副本】，相当于线程的 private static 类型变量。
     */
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();

    public static void setDBType(String dbType){
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType(){
        return CONTEXT_HOLDER.get();
    }

    public static void clearDBType(){
        CONTEXT_HOLDER.remove();
    }
}
