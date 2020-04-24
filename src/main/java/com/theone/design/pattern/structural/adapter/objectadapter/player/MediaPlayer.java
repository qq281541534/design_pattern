package com.theone.design.pattern.structural.adapter.objectadapter.player;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/20 10:54
 * @Description: 播放器
 */
public interface MediaPlayer {
    /**
     * 播放功能
     * @param audioType 音频类型
     * @param fileName  文件名称
     */
    void play(String audioType, String fileName);
}
