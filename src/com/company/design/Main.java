package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.facede.Ftp;
import com.company.design.facede.Reader;
import com.company.design.facede.SftpClient;
import com.company.design.facede.Writer;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowsrProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;
import com.company.design.strategy.*;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        /*
        Browser browser = new Browser("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();

        IBrowser iBrowser = new BrowsrProxy("www.naver.com");
        iBrowser.show();
        iBrowser.show();
        iBrowser.show();
        iBrowser.show();
        iBrowser.show();


        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                        System.out.println("before");
                        start.set(System.currentTimeMillis());
                },
                () -> {
                        long now = System.currentTimeMillis();
                        end.set(now - start.get());

                });

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        ICar audi = new Audi(1000);
        audi.showPrice();

        // a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();

        // a4
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();

        // a5
        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();


        Button button = new Button("버튼");
        button.addListener(new IButtonListener() {
            @Override
            public void clickEvent(String event) {
                System.out.println(event);
            }
        });
        button.click("메시지 전달 : click1 ");
        button.click("메시지 전달 : click2 ");
        button.click("메시지 전달 : click3 ");
        button.click("메시지 전달 : click4 ");

        Ftp ftpClient = new Ftp(("www.foo.or.kr", 22 , "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.wrtie();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        reader.fileDisconnect();
        writer.fileDisconnect();
        ftpClient.disconnect();

        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc/", "text.tmp");
        sftpClient.connect();
        sftpClient.write();
        sftpClient.read();

         */

        Encoder encoder = new Encoder();

        // basd64
        EncodingStrategy base64 = new Base64Strategy();

        // normal
        EncodingStrategy normal = new NormalStrategy();

        // normal
        EncodingStrategy appendStrategy = new AppendStrategy();

        String mesaage = "hello java";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMassage(mesaage);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMassage(mesaage);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(appendStrategy);
        String appendResult = encoder.getMassage(mesaage);
        System.out.println(appendResult);

    }

    // 콘센트
    public static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}