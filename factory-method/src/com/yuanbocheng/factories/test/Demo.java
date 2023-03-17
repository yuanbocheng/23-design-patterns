package com.yuanbocheng.factories.test;

import com.yuanbocheng.factories.factory.Dialog;
import com.yuanbocheng.factories.factory.HtmlDialog;
import com.yuanbocheng.factories.factory.WindowsDialog;

/**
 * @authoer:yuanbo.cheng
 * 演示类。这里的一切都在一起。
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * 具体的工厂的选择通常取决于配置或环境选项。
     */
    static void configure(){
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        }else{
            dialog = new HtmlDialog();
        }
    }

    /**
     * 所有客户端代码都应该与工厂和产品一起工作抽象的接口。这样它就不关心它在哪个工厂工作和什么样的产品它返回。
     */
    static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
