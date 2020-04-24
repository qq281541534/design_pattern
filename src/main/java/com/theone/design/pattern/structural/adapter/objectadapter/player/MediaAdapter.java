package com.theone.design.pattern.structural.adapter.objectadapter.player;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/20 11:04
 * @Description: 媒体适配器
 */
public class MediaAdapter implements MediaPlayer {

    // 被适配者
    private AdvancedMediaPlayer advancedMediaPlayer;

    /**
     * 播放功能
     *
     * @param audioType 音频类型
     * @param fileName  文件名称
     */
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
            advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
