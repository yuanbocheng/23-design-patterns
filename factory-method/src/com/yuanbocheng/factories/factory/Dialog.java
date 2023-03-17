package com.yuanbocheng.factories.factory;

import com.yuanbocheng.factories.buttons.Button;

/**
 * @authoer:yuanbo.cheng
 * 基工厂类。注意，“工厂”只是类的一个角色。
 * 它应该有一些核心业务逻辑，需要不同的产品来实现创建。
 *
 * 抽象类和抽象方法都使用 abstract 关键字进行声明。抽象类一般会包含抽象方法，抽象方法一定位于抽象类中。
 * 抽象类和普通类最大的区别是，抽象类不能被实例化，需要继承抽象类才能实例化其子类。
 */
public abstract class Dialog {

    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    /**
     * 子类将重写此方法以创建特定的按钮对象。
     */
    public abstract Button createButton();
}
