package com.panyu.panyuprojectims.entity;
public class LlNewPipeLine {
    private String newPipeLineId;
    private String pipelineDesignLength;
    private String pipelineCompletionLength;
    public LlNewPipeLine() {
        super();
    }
    public LlNewPipeLine(String newPipeLineId,String pipelineDesignLength,String pipelineCompletionLength) {
        super();
        this.newPipeLineId = newPipeLineId;
        this.pipelineDesignLength = pipelineDesignLength;
        this.pipelineCompletionLength = pipelineCompletionLength;
    }
    public String getNewPipeLineId() {
        return this.newPipeLineId;
    }

    public void setNewPipeLineId(String newPipeLineId) {
        this.newPipeLineId = newPipeLineId;
    }

    public String getPipelineDesignLength() {
        return this.pipelineDesignLength;
    }

    public void setPipelineDesignLength(String pipelineDesignLength) {
        this.pipelineDesignLength = pipelineDesignLength;
    }

    public String getPipelineCompletionLength() {
        return this.pipelineCompletionLength;
    }

    public void setPipelineCompletionLength(String pipelineCompletionLength) {
        this.pipelineCompletionLength = pipelineCompletionLength;
    }

    @Override
    public String toString() {
        return "LlNewPipeLine{" +
                "newPipeLineId='" + newPipeLineId + '\'' +
                ", pipelineDesignLength='" + pipelineDesignLength + '\'' +
                ", pipelineCompletionLength='" + pipelineCompletionLength + '\'' +
                '}';
    }
}
