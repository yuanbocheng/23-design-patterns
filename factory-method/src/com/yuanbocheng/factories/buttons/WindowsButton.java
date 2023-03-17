package com.yuanbocheng.factories.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @authoer:yuanbo.cheng
 * Windows按钮实现。
 */
public class WindowsButton implements Button{
    JFrame frame = new JFrame(); //创建windows窗口
    JPanel panel = new JPanel(); //创建窗口的容器
    JButton button ; //创建按钮组件
    @Override
    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!"); //创建标签组件
        label.setOpaque(true); //关闭透明度
        label.setBackground(new Color(235,233,126)); //设置背景
        label.setFont(new Font("Dialog",Font.BOLD,44)); //设置字体、字体风格、字体大小
        label.setHorizontalAlignment(SwingConstants.CENTER); //设置标签内的文本对齐方式
        panel.setLayout(new FlowLayout(FlowLayout.CENTER)); //调用流布局，布局格式：居中
        frame.getContentPane().add(panel); //把panel添加到frame上面。panel和frame就不是平级的了
        panel.add(label); //往panel上面添加label
        onClick(); //调用点击事件
        panel.add(button); //往panel上面添加button
        frame.setSize(320,200); //调整此组件的大小，使其宽度为width ，高度为height
        frame.setVisible(true); //设置显示此组件
        onClick();//调用点击事件
    }

    @Override
    public void onClick() {
        button = new JButton("Exit"); //创建“Exit”按钮
        //在按钮上添加侦听器
        button.addActionListener(new AbstractAction() {
            //具体操作
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false); //设置隐藏此组件
                System.exit(0); //正常退出程序
            }
        });
    }
}
