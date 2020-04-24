package com.theone.design.pattern.structural.decorator.v2;

/**
 * @author liuyu
 */
public abstract class ShapeDecorator implements Shape {

   protected Shape decoratedShape;

   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }

   public void draw(){
      decoratedShape.draw();
   }
}