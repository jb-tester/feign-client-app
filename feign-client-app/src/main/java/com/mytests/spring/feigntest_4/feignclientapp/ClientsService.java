package com.mytests.spring.feigntest_4.feignclientapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 06.11.2020.</p>
 * <p>Project: feignTest3</p>
 * *
 */
@Service
public class ClientsService {
    @Autowired
    private com.mytests.spring.feigntest_4.feignclientapp.MyClient0 myClient0;
    
    @Autowired
    private com.mytests.spring.feigntest_4.feignclientapp.MyClient2 myClient2;

    @Autowired(required = false)
    private com.mytests.spring.feigntest_4.feignclientapp.MyClient1 myClient1;

    public String checkClients(){
        String rez =  "myclient0.m1: "+ myClient0.m1()+
                "\n myclient0.m2: "+ myClient0.m2()+
      //          " myclient1.m1: " + myClient1.m1();
       // rez = rez + "\n myclient1.m2: " + myClient1.m2();
        // rez = rez + 
                "\n myclient2.m1: " + myClient2.m1();
        rez = rez + "\n myclient2.m2: " + myClient2.m2();
        return rez;
        
    }
}
