package com.arya.Utils;

import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * @author Arya
 * @version v1.0
 * @since v1.0
 */
public class FocusListenerUtil implements FocusListener {

    private JTextField jf;

    private String notice;

    public FocusListenerUtil(JTextField jf, String notice) {

        this.jf = jf;
        this.notice = notice;

        jf.setText(notice);
//        jf.setBackground(Color.GRAY);
    }

    @Override
    public void focusGained(FocusEvent e) {

        // 获取焦点时，清空提示
        String gainedFocus = jf.getText();
        if("notice".equals(gainedFocus)) {
            jf.setText("");
//            jf.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {

        // 失去焦点时，如没有输入内容，显示提示
        String lostFocus = jf.getText();
        if ("".equals(lostFocus)) {
//            jf.setForeground(Color.GRAY);
            jf.setText(notice);
        }
    }
}
