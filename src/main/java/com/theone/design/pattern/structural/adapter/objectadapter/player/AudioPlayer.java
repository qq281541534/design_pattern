package com.theone.design.pattern.structural.adapter.objectadapter.player;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/20 10:57
 * @Description: 音频播放器
 * AudioPlayer 使用适配器类 MediaAdapter 传递所需的音频类型，不需要知道能播放所需格式音频的实际类
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    /**
     * 播放功能
     *
     * @param audioType 音频类型
     * @param fileName  文件名称
     */
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("播放MP3格式的媒体文件， 文件名：" + fileName);
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("invalid media." + audioType + " format not supported");
        }

    }
}
