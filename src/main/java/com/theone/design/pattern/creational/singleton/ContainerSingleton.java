package com.theone.design.pattern.creational.singleton;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/14 10:52
 * @Description: 容器单例
 * 这种模式在android的SDK的源码中使用的比较多，
 * HashMap不是线程安全的，但如果使用HashTable则会降低性能，在频繁取的时候都会有同步锁所以不建议使用HashTable,
 * 并且如果不考虑序列化和反射的场景，还是推荐使用容器模式来实现类的单例化
 */
public class ContainerSingleton {

    private static Map<String, Object> singletonMap = new HashMap();

    private ContainerSingleton() {}

    public static void putInstance(String key, Object instance){
        if(!StringUtils.isEmpty(key) && instance != null){
            if (!singletonMap.containsKey(key)){
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}
