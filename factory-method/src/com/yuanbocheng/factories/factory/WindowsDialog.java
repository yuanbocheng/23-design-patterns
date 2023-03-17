package com.yuanbocheng.factories.factory;

import com.yuanbocheng.factories.buttons.Button;
import com.yuanbocheng.factories.buttons.WindowsButton;

/**
 * @authoer:yuanbo.cheng
 * Windows对话框将产生Windows按钮。
 */
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
