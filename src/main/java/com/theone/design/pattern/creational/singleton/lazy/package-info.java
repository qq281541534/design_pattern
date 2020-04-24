/**
 * @Author: liuyu
 * @DateTime: 2020/4/13 16:12
 * @Description: 懒汉单例模式又分为三个版本：
 * 1.普通的单例模式，性能差；
 * 2.基于doubleCheck双重检查实现的线程安全的懒汉模式，volatile共享内存避免重排序带来的空指针异常。
 * 3.基于静态内部类并且是线程安全的类初始化的延迟加载解决方案（非构造线程是不允许看到重排序的）
 */
package com.theone.design.pattern.creational.singleton.lazy;