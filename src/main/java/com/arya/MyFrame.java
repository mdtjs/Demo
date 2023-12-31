package com.arya;

import com.arya.Utils.FocusListenerUtil;
import com.arya.Utils.Format;
import com.arya.Utils.KeyTypeUtil;

import javax.swing.*;
import java.awt.*;

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
    JTextField min_input = new FocusListenerUtil("min");
    JTextField max_input = new FocusListenerUtil("max");

    /** 生成结果按钮 */
    JButton generate_button = new JButton("生成");

    /** 重置按钮 */
    JButton reset_button = new JButton("重置");

    /** 记录时间 */
    JButton start_time = new JButton("开始计时");

    // 构造函数
    public MyFrame(String title) {

        super(title);

        Container panel = getContentPane();
        panel.setLayout(null);

        /** 标题文本样式 */
        content_title.setBounds(0, 30, 500, 50);
        content_title.setFont(Format.title);
        content_title.setForeground(Color.BLACK);
        panel.add(content_title);

        /** 正文文本样式 */
        input_tip.setBounds(80, 100, 300, 50);
        input_tip.setFont(Format.text);
        input_tip.setForeground(Color.BLACK);
        panel.add(input_tip);

        /** 输入框设置 */
        min_input.setBounds(150, 200, 50, 30);
        // 键盘输入监听
        min_input.addKeyListener(new KeyTypeUtil());
        panel.add(min_input);

        max_input.setBounds(300, 200, 50, 30);
        max_input.addKeyListener(new KeyTypeUtil());
        panel.add(max_input);

        /** 按钮样式 */
        generate_button.setBounds(150, 300, 80, 35);
        generate_button.setFont(Format.button);
        panel.add(generate_button);
        reset_button.setBounds(300, 300, 80, 35);
        reset_button.setFont(Format.button);
        panel.add(reset_button);
        start_time.setBounds(150, 350, 160, 35);
        start_time.setFont(Format.button);
        panel.add(start_time);

        /** 生成 - 点击事件 */
        generate_button.addActionListener(e -> {
            onButtonGenerate();
        });

        /** 重置 - 点击事件 */
        reset_button.addActionListener(e -> {
            onButtonReset();
        });

        /** 计时器 */
        start_time.addActionListener(e -> {
            onStartButton();
        });
    }

    /**
     * 生成按钮的事件处理
     */
    private void onButtonGenerate() {

//        String min = min_num.getText();
//        String max = max_num.getText();
//
//        // 判断输入值是否为空
//        Object[] options = {"确认", "取消"};
//        if(min.equals("") || max.equals("")) {
//            JOptionPane.showOptionDialog(null,
//                    "请输入数字",
//                    "错误提示",
//                    JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.WARNING_MESSAGE,
//                    null,
//                    options,
//                    options[0]);
//        }

        // 判断输入值是否为空
        if(!"".equals(min_input.getText()) && !"".equals(max_input.getText())) {
            int min = Integer.parseInt(min_input.getText());
            int max = Integer.parseInt(max_input.getText());

            // 判断输入值是否合法
            if(min > 0 && max <= 2922 && max > min) {
                // 输出随机值
                int randomNum = GenerateNum.getNum(min, max);
                JOptionPane.showMessageDialog(this, "今日题号：" + randomNum);
            }
        }  else {
            Object[] options = {"确认", "取消"};
            JOptionPane.showOptionDialog(null,
                    "输入值不合法",
                    "错误提示",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null,
                    options,
                    options[0]);
        }
    }

    /**
     * 重置按钮的事件处理
     */
    private void onButtonReset() {

        // 将文本框置为空
        min_input.setText("");
        max_input.setText("");
    }

    /**
     * 做题计时器
     */
    private void onStartButton() {

    }
}
