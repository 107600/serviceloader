package com.jy.blog.serviceloader;


public class QiyiCDN implements UploadCDN {

    @Override
    public void upload(String file) {
        System.out.println("upload qiyi cdn" + file);
    }
}