package com.company.design.facede;

public class Reader {
    private String fileName;

    public Reader(String fileName){
        this.fileName = fileName;
    }

    public void fileConnect(){
        String msg = String.format("Reader %s 연결합니다.", fileName);
        System.out.println(msg);
    }

    public void fileRead(){
        String msg = String.format("Reader %s 의 내용을 읽어옵니다.", fileName);
        System.out.println(msg);
    }

    public void fileDisconnect(){
        String msg = String.format("Reader %s 연결 종료 니다.", fileName);
        System.out.println(msg);
    }
}

