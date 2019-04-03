package com.cebbank.nrdp.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KinitTask {
    private String keyTypeFile;
    private String krb5path;
    private String userProy;
    private String configdir;

    private static final Logger LOGGER= LoggerFactory.getLogger(KinitTask.class);

    public KinitTask(String keyTypeFile,String krb5path,String userProy,String configdir){
        this.keyTypeFile=keyTypeFile;
        this.krb5path=krb5path;
        this.userProy=userProy;
        this.configdir=configdir;
    }

    public void init(){

    }
}
