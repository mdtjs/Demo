package com.arya;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

/**
 * 处理输入值
 * @author Arya
 * @version v1.0
 * @since v1.0
 */
public class GenerateNum {

//    /**
//     * 判断输入值是否在范围内
//     * @param num
//     * @return
//     */
//    public static boolean isValid(int num) {
//
//        Object[] options = {"确认", "取消"};
//        if(num <= 0 || num > 2922) {
//            JOptionPane.showOptionDialog(null,
//                    "请输入[1,2922]内的值",
//                    "错误提示",
//                    JOptionPane.DEFAULT_OPTION,
//                    JOptionPane.WARNING_MESSAGE,
//                    null,
//                    options,
//                    options[0]);
//            return false;
//        }
//        return true;
//    }

    /**
     * 获取随机数
     * @param min
     * @param max
     * @return
     */
    public static int getNum(int min, int max) {

        Random random = new Random();

        return (random.nextInt(max - min + 1) + min);
    }
}
