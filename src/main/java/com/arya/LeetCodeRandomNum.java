package com.arya;

import javax.swing.*;
import java.awt.*;

/**
 * @author Arya
 * @version v1.0
 * @since v1.0
 */
public class LeetCodeRandomNum {

    public static void main(String[] args) {
        // swing组件非同步，需要将修改外观的代码放在单独的线程中
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                initialize();
            }
        });
    }

    /**
     * 初始化窗口
     */
    private static void initialize() {

        MyFrame frame = new MyFrame("LeetCode随机题号生成器");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // 设置窗口大小
        frame.setSize(500, 500);

        // 大小不可调整
        frame.setResizable(false);

        // 窗口居中
        frame.setLocationRelativeTo(null);

        // 窗口可见
        frame.setVisible(true);
    }
}
