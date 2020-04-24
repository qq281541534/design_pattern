package com.theone.design.pattern.structural.adapter.objectadapter.player;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/20 11:00
 * @Description: 具体的播放器（被适配者的具体实现）
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("播放vlc格式的文件，文件名：" + fileName);
    }

    public void playMp4(String fileName) {

    }
}
