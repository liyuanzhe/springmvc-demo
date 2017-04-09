package com.lifeoflyz.myfirstmvc.mail;

/**
 * Created by liyuanzhe on 17-4-9.
 */
public class Mail {

    private String from;

    private String to;

    private String setSubject;

    private String content;

    public Mail(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSetSubject() {
        return setSubject;
    }

    public void setSetSubject(String setSubject) {
        this.setSubject = setSubject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
