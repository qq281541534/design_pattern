package com.theone.design.pattern.creational.simplefactory;

/**
 * @Author: liuyu
 * @DateTime: 2020/4/12 17:03
 * @Description: TODO
 */
public class VideoFactory {

    /**
     * 通过反射的方法实现，可以弥补增加类型的可扩展性
     * @param c
     * @return
     */
    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return video;
    }

    public Video getVideo(String type){
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }
}
