package com.example.retrofitresponse.retrofit.ptcpojo;

public class Label {

    private String id;

    private String label;

    private String type;

    private String subtype;

    private String priority;

    private String designtype;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public String getLabel(){
        return this.label;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setSubtype(String subtype){
        this.subtype = subtype;
    }
    public String getSubtype(){
        return this.subtype;
    }
    public void setPriority(String priority){
        this.priority = priority;
    }
    public String getPriority(){
        return this.priority;
    }
    public void setDesigntype(String designtype){
        this.designtype = designtype;
    }
    public String getDesigntype(){
        return this.designtype;
    }

}
