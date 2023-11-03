package com.arya;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

/**
 * 基于JFrame的Frame工具类
 * @author Arya
 * @version v1.0
 * @since v1.0
 */
public class MyFrame extends JFrame implements Format {

    /** 标题文本 */
    JLabel content_title = new JLabel("LeetCode", JLabel.CENTER);

    /** 正文文本 */
    JLabel input_tip = new JLabel("请输入要随机的题号范围：");

    /** 题号范围（min ~ max）输入框 */
    JTextField min_num = new JFormattedTextField(NumberFormat.getIntegerInstance());
    JTextField max_num = new JFormattedTextField(NumberFormat.getIntegerInstance());

    /** 生成结果按钮 */
    JButton generate_button = new JButton("生成");

    /** 重置按钮 */
    JButton reset_button = new JButton("重置");

    // 构造函数
    public MyFrame(String title) {

        super(title);

        Container panel = getContentPane();
        panel.setLayout(new FlowLayout());

        /** 标题文本样式 */
        content_title.setBounds(0, 30, 500, 50);
        content_title.setFont(Format.title);
        content_title.setForeground(Color.BLACK);
        panel.add(content_title);

        /** 正文文本样式 */
        input_tip.setBounds(20, 105, 250, 30);
        input_tip.setFont(Format.text);
        input_tip.setForeground(Color.BLACK);
        panel.add(input_tip);

        /** 输入框设置 */
        min_num.setBounds(400, 100, 50, 30);
        panel.add(min_num);
        max_num.setBounds(400, 100, 50, 30);
        panel.add(max_num);

        /** 按钮样式 */
        generate_button.setBounds(150, 200, 80, 40);
        generate_button.setFont(Format.button);
        panel.add(generate_button);
        reset_button.setBounds(250, 200, 80, 40);
        reset_button.setFont(Format.button);
        panel.add(reset_button);

        // 点击事件
        generate_button.addActionListener(e -> {
            onButtonGenerate();
        });

        reset_button.addActionListener(e -> {
            onButtonReset();
        });

    }

    /**
     * 生成按钮的事件处理
     */
    private void onButtonGenerate() {

        String min = min_num.getText();
        String max = max_num.getText();

        // 输入为空弹出提示窗
        if(min.equals("") || max.equals("")) {

        }
    }

    /**
     * 重置按钮的事件处理
     */
    private void onButtonReset() {

    }
}
