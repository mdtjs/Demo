package com.arya.Utils;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author Arya
 * @version v1.0
 * @since v1.0
 */
public class KeyTypeUtil extends KeyAdapter {

    /**
     * 限制输入值为数字
     * @param e
     */
    @Override
    public void keyTyped(KeyEvent e) {

        if(e.getKeyChar() < '0' || e.getKeyChar() > '9' || e.getKeyCode() == 8) {
            e.consume();
        }
    }
}
