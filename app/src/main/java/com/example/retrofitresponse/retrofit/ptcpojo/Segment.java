package com.example.retrofitresponse.retrofit.ptcpojo;

import java.util.List;

public class Segment {

    private Label label;

    private List<Content> content;

    public void setLabel(Label label){
        this.label = label;
    }
    public Label getLabel(){
        return this.label;
    }
    public void setContent(List<Content> content){
        this.content = content;
    }
    public List<Content> getContent(){
        return this.content;
    }

}
