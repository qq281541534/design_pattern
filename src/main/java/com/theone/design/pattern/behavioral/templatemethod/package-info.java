/**
 * @Author: liuyu
 * @DateTime: 2020/6/4 15:36
 * @Description: 模板方法模式
 * 项目中的使用场景：
 * BaseMapper/BaseService/BaseController，在BaseController中增删改查都会调用固定的业务逻辑，但是返回的是不同的DTO，
 * 所以可以在BaseController中针对返回不同DTO的行为，创建钩子方法；然后在具体的业务controller中转换不同的DTO。
 */
package com.theone.design.pattern.behavioral.templatemethod;