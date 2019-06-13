package com.sky.skyserver.util.captcha;

public class Test {
    //简单使用
    public static void main(String[] args) throws Exception {
        //gif格式
        Captcha captcha_gif = new GifCaptcha();
        String gifByBase64 = captcha_gif.getPicByBase64();
        //png格式
        Captcha captcha_png = new SpecCaptcha();
        String pngByBase64 = captcha_png.getPicByBase64();
    }
}
