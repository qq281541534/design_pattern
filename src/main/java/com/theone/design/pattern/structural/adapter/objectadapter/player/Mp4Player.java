package com.theone.design.pattern.structural.adapter.objectadapter.player;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/20 11:02
 * @Description: 具体的播放器（被适配者的具体实现）
 */
public class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("播放MP4格式的媒体文件，文件名：" + fileName);
    }
}
