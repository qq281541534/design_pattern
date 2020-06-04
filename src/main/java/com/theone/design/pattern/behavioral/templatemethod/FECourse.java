package com.theone.design.pattern.behavioral.templatemethod;

/**
 * @Author: liuyu
 * @DateTime: 2020/6/4 16:10
 * @Description: 前端课程
 */
public class FECourse extends AbsCourse {

    private boolean needWriteArticleFlag = false;

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程源码");
        System.out.println("提供课程所需素材相关图片");
    }

    /**
     * 由于前端课程范围很广，并不能确定是否需要编写手记，所以实现一个更加灵活的操作，由应用类来确定是否编写手记
     * @return
     */
    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
