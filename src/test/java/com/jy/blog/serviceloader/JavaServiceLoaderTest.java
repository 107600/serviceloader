package com.jy.blog.serviceloader;

import java.util.Iterator;
import java.util.ServiceLoader;
import org.testng.annotations.Test;

public class JavaServiceLoaderTest {

    @Test
    public void java_service_loader_should_load_correct_implementations() {
        ServiceLoader<UploadCDN> serviceLoader = ServiceLoader.load(UploadCDN.class);
        Iterator<UploadCDN> it = serviceLoader.iterator();
        while (it != null && it.hasNext()){
            UploadCDN uploadCDN = it.next();
            System.out.println("class:" + uploadCDN.getClass().getName());
            uploadCDN.upload("myFile");
        }
    }
}
