package com.prasad.learnings;

public class Immutablestring {
    String s = "Sai";
    StringBuilder stringBuilder = new StringBuilder();
    StringBuffer stringBuffer = new StringBuffer();

    public Immutablestring() {
    }

    void change() {
        this.s.concat("Prasad");
        System.out.println(this.s.toString());
        this.s = this.s.concat("Prasad");
        System.out.println(this.s.toString());
        this.stringBuilder.append("Sai");
        this.stringBuilder.append("From String Builder");
        System.out.println(this.stringBuilder);
        this.stringBuffer.append("Sai");
        this.stringBuffer.append("From String Buffer");
        System.out.println(this.stringBuffer);
        new String();
        String str = "Sai ";
        str.concat("str");
        System.out.println(str);
    }
}

