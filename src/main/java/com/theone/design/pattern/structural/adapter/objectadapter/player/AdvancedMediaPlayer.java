package com.theone.design.pattern.structural.adapter.objectadapter.player;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/20 10:58
 * @Description: 高级的媒体播放器（被适配者）
 */
public interface AdvancedMediaPlayer {

    void playVlc(String fileName);
    void playMp4(String fileName);
}
