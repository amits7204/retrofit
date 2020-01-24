package com.example.retrofitresponse.retrofit.ptcpojo;

import java.util.List;

public class PtcRoot {

    private String result;

    private String code;

    private String api_version;

    private String language;

    private String forceupdate;

    private String isSegment;

    private List<Segment> segment;

    private String isPayment;

    private String paymentExpireDate;

    private List<String> isPromotin;

    private String votingPopupPath;

    private String newsUrl;

    private String newsUrl1;

    private String newsUrlcat1;

    private String newsRelated1;

    private String newsSearch;

    private String singlenews;

    private String audiogurbani;

    private String payment_type;

    private String key;

    private String secret;

    private Popup popup;

    public void setResult(String result){
        this.result = result;
    }
    public String getResult(){
        return this.result;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCode(){
        return this.code;
    }
    public void setApi_version(String api_version){
        this.api_version = api_version;
    }
    public String getApi_version(){
        return this.api_version;
    }
    public void setLanguage(String language){
        this.language = language;
    }
    public String getLanguage(){
        return this.language;
    }
    public void setForceupdate(String forceupdate){
        this.forceupdate = forceupdate;
    }
    public String getForceupdate(){
        return this.forceupdate;
    }
    public void setIsSegment(String isSegment){
        this.isSegment = isSegment;
    }
    public String getIsSegment(){
        return this.isSegment;
    }
    public void setSegment(List<Segment> segment){
        this.segment = segment;
    }
    public List<Segment> getSegment(){
        return this.segment;
    }
    public void setIsPayment(String isPayment){
        this.isPayment = isPayment;
    }
    public String getIsPayment(){
        return this.isPayment;
    }
    public void setPaymentExpireDate(String paymentExpireDate){
        this.paymentExpireDate = paymentExpireDate;
    }
    public String getPaymentExpireDate(){
        return this.paymentExpireDate;
    }
    public void setIsPromotin(List<String> isPromotin){
        this.isPromotin = isPromotin;
    }
    public List<String> getIsPromotin(){
        return this.isPromotin;
    }
    public void setVotingPopupPath(String votingPopupPath){
        this.votingPopupPath = votingPopupPath;
    }
    public String getVotingPopupPath(){
        return this.votingPopupPath;
    }
    public void setNewsUrl(String newsUrl){
        this.newsUrl = newsUrl;
    }
    public String getNewsUrl(){
        return this.newsUrl;
    }
    public void setNewsUrl1(String newsUrl1){
        this.newsUrl1 = newsUrl1;
    }
    public String getNewsUrl1(){
        return this.newsUrl1;
    }
    public void setNewsUrlcat1(String newsUrlcat1){
        this.newsUrlcat1 = newsUrlcat1;
    }
    public String getNewsUrlcat1(){
        return this.newsUrlcat1;
    }
    public void setNewsRelated1(String newsRelated1){
        this.newsRelated1 = newsRelated1;
    }
    public String getNewsRelated1(){
        return this.newsRelated1;
    }
    public void setNewsSearch(String newsSearch){
        this.newsSearch = newsSearch;
    }
    public String getNewsSearch(){
        return this.newsSearch;
    }
    public void setSinglenews(String singlenews){
        this.singlenews = singlenews;
    }
    public String getSinglenews(){
        return this.singlenews;
    }
    public void setAudiogurbani(String audiogurbani){
        this.audiogurbani = audiogurbani;
    }
    public String getAudiogurbani(){
        return this.audiogurbani;
    }
    public void setPayment_type(String payment_type){
        this.payment_type = payment_type;
    }
    public String getPayment_type(){
        return this.payment_type;
    }
    public void setKey(String key){
        this.key = key;
    }
    public String getKey(){
        return this.key;
    }
    public void setSecret(String secret){
        this.secret = secret;
    }
    public String getSecret(){
        return this.secret;
    }
    public void setPopup(Popup popup){
        this.popup = popup;
    }
    public Popup getPopup(){
        return this.popup;
    }

}
