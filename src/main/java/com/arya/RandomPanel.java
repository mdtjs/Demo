//package com.arya;
//
//import javax.swing.*;
//import javax.swing.text.MaskFormatter;
//import java.awt.*;
//import java.text.NumberFormat;
//import java.text.ParseException;
//
///**
// * @author Arya
// * @version v1.0
// * @since v1.0
// */
//public class RandomPanel implements Format {
//
//    public void initialize() {
//
//        /** 构造窗口 */
//        JFrame frame = new JFrame("LeetCodeRandomNum");
//        frame.setSize(500, 500);
//        // 窗口可见
//        frame.setVisible(true);
//        // 大小不可调整
//        frame.setResizable(false);
//        // 窗口居中
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setLayout(null);
//
//        /** 标题文本 */
//        JLabel title = new JLabel("LeetCode", JLabel.CENTER);
//        title.setBounds(0, 30, 500, 50);
//        title.setFont(Format.title);
//        title.setForeground(Color.BLACK);
//
//        /** 正文文本 */
//        JLabel text_1 = new JLabel("请输入要随机的题号范围：");
//        frame.add(text_1);
//        text_1.setBounds(20, 105, 250, 30);
//        text_1.setFont(Format.text);
//        text_1.setForeground(Color.BLACK);
//
//        /** 创建输入框 */
//        // 限制输入格式为四位数字
//        MaskFormatter mask = null;
//        try {
//            mask = new MaskFormatter("####");
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        // 输入框
//        JTextField textField_1 = new JFormattedTextField(mask);
//        textField_1.setBounds(400, 100, 50, 30);
//        frame.add(textField_1);
//        JTextField textField_2 = new JFormattedTextField(mask);
//        textField_2.setBounds(300, 100, 50, 30);
//        frame.add(textField_2);
//
//        /** 按钮 */
//        JButton generate_button = new JButton("生成");
//        generate_button.setBounds(150, 200, 80, 40);
//        generate_button.setFont(Format.button);
//        frame.add(generate_button);
//        JButton reset_button = new JButton("重置");
//        reset_button.setBounds(250, 200, 80, 40);
//        reset_button.setFont(Format.button);
//        frame.add(reset_button);
//    }
//}
