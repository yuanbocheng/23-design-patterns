package com.yuanbocheng.factories.factory;

import com.yuanbocheng.factories.buttons.Button;
import com.yuanbocheng.factories.buttons.HtmlButton;

/**
 * @authoer:yuanbo.cheng
 * HTML对话框将产生HTML按钮。
 */
public class HtmlDialog  extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
