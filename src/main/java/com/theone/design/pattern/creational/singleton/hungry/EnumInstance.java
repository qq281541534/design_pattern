package com.theone.design.pattern.creational.singleton.hungry;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/13 19:54
 * @Description: 推荐使用枚举的方式来实现单例模式
 *
 * 通过反编译工具可以看到枚举类是 final static 修饰的，INSTANCE也是final static的，并且构造器是私有化的，属于饥饿模式；
 * 由于java反射机制不允许反射枚举类型的构造器和IO序列化都对枚举类型做了处理，所以枚举类型实现的单例模式是最安全的。
 *
 */
public enum EnumInstance {
    INSTANCE {
        // 通过反编译可以看到该方法是在static静态块中的，所以是线程安全的
        @Override
        protected void printTest() {
            System.out.println("say something");
        }
    };
    // 外部必须声明方法才能使用，具体实现在INSTANCE内部
    protected abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}

// 反编译后
//public abstract class EnumInstance extends Enum
//{
//
//    public static EnumInstance[] values()
//    {
//        return (EnumInstance[])$VALUES.clone();
//    }
//
//    public static EnumInstance valueOf(String name)
//    {
//        return (EnumInstance)Enum.valueOf(com/theone/design/pattern/creational/singleton/hungry/EnumInstance, name);
//    }
//
//    private EnumInstance(String s, int i)
//    {
//        super(s, i);
//    }
//
//    protected abstract void printTest();
//
//    public Object getData()
//    {
//        return data;
//    }
//
//    public void setData(Object data)
//    {
//        this.data = data;
//    }
//
//    public static EnumInstance getInstance()
//    {
//        return INSTANCE;
//    }
//
//
//    public static final EnumInstance INSTANCE;
//    private Object data;
//    private static final EnumInstance $VALUES[];
//
//    static
//    {
//        INSTANCE = new EnumInstance("INSTANCE", 0) {
//
//            protected void printTest()
//            {
//                System.out.println("say something");
//            }
//
//        }
//        ;
//        $VALUES = (new EnumInstance[] {
//                INSTANCE
//        });
//    }
//}
