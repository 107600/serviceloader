package com.jy.blog.serviceloader;

public class ChinaNetCDN implements UploadCDN {

    @Override
    public void upload(String file) {
        System.out.println("upload chinaNet cdn" + file);
    }
}

