package com.theone.design.pattern.behavioral.templatemethod;

/**
 * @Author: liuyu
 * @DateTime: 2020/6/4 15:37
 * @Description: 抽象的课程类
 * 对于其他课程来说，AbsCourse就是模板，定义了一套标准，把行为及流程都固定好；
 * 对于可选项的行为增加钩子方法开放出去，由具体的课程进行选择；而对于writeArticle的行为，子类是没有异议的；
 * packageCourse完全交给子类来实现。
 */
public abstract class AbsCourse {

    /**
     * 调用制作课程时所有的流程步骤，将个性化的行为开放给子类重写或实现；譬如是否需要编写手记，如何包装课程
     * makeCourse必须使用final来实现，模板方法就不想让其他子类把固定好的流程步骤打乱。
     */
    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        if (this.needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    /**
     * 用final修饰说明不希望子类重写该方法，说明该行为是固定不变的
     */
    final void makePPT() {
        System.out.println("制作PPT");
    }

    /**
     * 用final修饰说明不希望子类重写该方法，说明该行为是固定不变的
     */
    final void makeVideo() {
        System.out.println("制作视频");
    }

    /**
     * 编写手记的行为大家是认可的，不会需要对该行为进行修改，所以也用final修饰；
     * 但是编写手记是可选项，所以需要一个钩子方法
     */
    final void writeArticle() {
        System.out.println("编写手记");
    }

    /**
     * 编写手记的钩子方法，默认情况下不需要编写手记
     *
     * @return
     */
    protected boolean needWriteArticle() {
        return false;
    }

    /**
     * 包装课程
     * 由于不同的课程需要的素材不同，有些需要提供源码，有些需要提供图片素材，所以具体的需要子类去实现
     */
    abstract void packageCourse();




}
