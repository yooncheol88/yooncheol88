package com.company.design.facede;

public class Writer {

    private String fileName;

    public Writer(String fileName){
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Writer %s 연결합니다.", fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Writer %s 연결종료 합니다.", fileName);
        System.out.println(msg);
    }

    public void wrtie(){
        String msg = String.format("Writer %s 로 파일쓰기를 합니다..", fileName);
        System.out.println(msg);
    }
}
