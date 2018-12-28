package com.panyu.panyuprojectims.entity;
public class LlPushPipe {
    private String pushPipeId;
    private String pushDesignLength;
    private String pushCompletionLength;
    public LlPushPipe() {
        super();
    }
    public LlPushPipe(String pushPipeId,String pushDesignLength,String pushCompletionLength) {
        super();
        this.pushPipeId = pushPipeId;
        this.pushDesignLength = pushDesignLength;
        this.pushCompletionLength = pushCompletionLength;
    }
    public String getPushPipeId() {
        return this.pushPipeId;
    }

    public void setPushPipeId(String pushPipeId) {
        this.pushPipeId = pushPipeId;
    }

    public String getPushDesignLength() {
        return this.pushDesignLength;
    }

    public void setPushDesignLength(String pushDesignLength) {
        this.pushDesignLength = pushDesignLength;
    }

    public String getPushCompletionLength() {
        return this.pushCompletionLength;
    }

    public void setPushCompletionLength(String pushCompletionLength) {
        this.pushCompletionLength = pushCompletionLength;
    }

    @Override
    public String toString() {
        return "LlPushPipe{" +
                "pushPipeId='" + pushPipeId + '\'' +
                ", pushDesignLength='" + pushDesignLength + '\'' +
                ", pushCompletionLength='" + pushCompletionLength + '\'' +
                '}';
    }
}
