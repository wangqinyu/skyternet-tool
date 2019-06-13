package com.sky.skyserver.util.qrcode;

import com.google.zxing.WriterException;
import com.sky.skyserver.util.qrcode.util.NumUtil;
import com.sky.skyserver.util.qrcode.wrapper.QrCodeGenWrapper;

import java.io.IOException;

public class Test {
    //简单样式使用
    public static void main(String[] args) throws IOException, WriterException {
        String preColor = "0xFF000000";//前景颜色(16进制0x表示，前两位透明度)
        String bgColor = "0xFFFFFFFF";//背景颜色(16进制0x表示，前两位透明度)
        String content = "content";//内容
        int width = 300;//长度
        int height = 300;//宽度
        String style = "RECT";//样式形状(RECT：矩形，CIRCLE：圆点，TRIANGLE：三角形，DIAMOND：五边形，SEXANGLE：六边形，OCTAGON：八边形)
        String bufferedImage = QrCodeGenWrapper.of(content)
                .setW(width)
                .setH(height)
                .setDrawPreColor(NumUtil.decode2int(preColor,16))
                .setDrawBgColor(NumUtil.decode2int(bgColor,16))
                .setDrawStyle(style)
                .asString();
    }
}
