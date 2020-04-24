/**
 * @Author: liuyu
 * @DateTime: 2020/4/14 19:11
 * @Description: 深度clone 的示例
 * 使用原型模式一个坑，如果实现了Cloneable接口的对象中有引用类型，必须在重写的clone方法中对引用类型进行深度克隆；
 * 否则，在使用对象的clone方法创建对象时，该引用类型会指向同一个实例。
 * 容易造成的BUG：当被引用的实例被修改时，所有对象中的引用类型的值都会改变。
 */
package com.theone.design.pattern.creational.prototype.deepclone;