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
     * @param event
     */
    public void keyType(KeyEvent event) {

        String key = "0123456789" + (char)8;
        if(key.indexOf(event.getKeyChar()) < 0) {
            // 不是数字取消事件
            event.consume();
        }
    }
}
