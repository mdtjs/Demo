package com.arya.Utils;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * 实现焦点监听
 * @author Arya
 * @version v1.0
 * @since v1.0
 */
public class FocusListenerUtil extends JTextField implements FocusListener {

     private final String hint;

     private boolean showingHint;

    /**
     * 焦点监听构造函数
     * @param hint 提示
     */
    public FocusListenerUtil(final String hint) {

        super(hint);
        this.hint = hint;
        this.showingHint = true;
        super.addFocusListener(this);
    }

    @Override
    public void focusGained(FocusEvent e) {

        // 获取焦点时输入为空，清除提示，将showingHint置为false
        if(this.getText().isEmpty()) {
            super.setText("");
            showingHint = false;
        }
    }

    @Override
    public void focusLost(FocusEvent e) {

        // 失去焦点时，如没有输入内容，显示提示，将showingHint置为true
        if(this.getText().isEmpty()) {
            super.setText(hint);
            showingHint = true;
        }
    }

    @Override
    public String getText() {
        return showingHint ?"" : super.getText();
    }
}
