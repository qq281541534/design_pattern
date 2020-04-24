package com.theone.design.pattern.creational.singleton.hungry;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/13 16:31
 * @Description:
 *
 */
public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * 通过序列化和返序列化破坏单例模式，下面两个instance不为同一个实例。
         * 解决办法：查看ObjectInputStream.readObject()方法可以看到可以通过反射序列化类中的readResolve方法解决
         */
//        HungrySingleton instance = HungrySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);





        /**
         * 通过反射构造实例的方式破坏 恶汉单例模式
         * 解决办法：单例模式的私有方法中增加实例是否已经创建的判断，如果已经创建，则抛出异常。
         */
//        // 获取类对象
//        Class objectClass = HungrySingleton.class;
//        // 获类对应的取构造器
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        // 开放构造器实例化权限
//        constructor.setAccessible(true);
//        // 通过类构造器创建实例
//        HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();
//        HungrySingleton instance = HungrySingleton.getInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);


//        // 获取类对象
//        Class objectClass = StaticInnerClassSingleton.class;
//        // 获类对应的取构造器
//        Constructor constructor = objectClass.getDeclaredConstructor();
//        // 开放构造器实例化权限
//        constructor.setAccessible(true);
//        // 通过类构造器创建实例
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);


        // 使用枚举类型实现的单例模式可以防止序列化和反序列化的破坏
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        EnumInstance newInstance = (EnumInstance) ois.readObject();
//
//        System.out.println(instance.getData());
//        System.out.println(newInstance.getData());
//        System.out.println(instance.getData() == newInstance.getData());

        // 枚举类型实现的单例模式是不允许反射构造实例的
//        Class objectClass = EnumInstance.class;
//        Constructor constructor = objectClass.getDeclaredConstructor(String.class, int.class);
//        constructor.setAccessible(true);
//        EnumInstance o = (EnumInstance) constructor.newInstance("aaa", 666);
//        o.setData(new Object());

        EnumInstance o1 = EnumInstance.getInstance();
        o1.printTest();

//        System.out.println(o.getData());
        System.out.println(o1.getData());
//        System.out.println(o.getData() == o1.getData());

    }
}
