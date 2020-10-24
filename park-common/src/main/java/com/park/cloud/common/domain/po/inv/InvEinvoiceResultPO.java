package com.park.cloud.common.domain.po.inv;

import java.util.Date;

public class InvEinvoiceResultPO {
    private Integer einvoiceResultid;

    private String einvoiceCode;

    private String fpqqlsh;

    private String fpDm;

    private String fpHm;

    private String kprq;

    private Integer kplx;

    private String czdm;

    private String jym;

    private String pdfFile;

    private String pdfUrl;

    private String returnMsg;

    private Date addTime;

    private String returnMessage;

    public Integer getEinvoiceResultid() {
        return einvoiceResultid;
    }

    public void setEinvoiceResultid(Integer einvoiceResultid) {
        this.einvoiceResultid = einvoiceResultid;
    }

    public String getEinvoiceCode() {
        return einvoiceCode;
    }

    public void setEinvoiceCode(String einvoiceCode) {
        this.einvoiceCode = einvoiceCode == null ? null : einvoiceCode.trim();
    }

    public String getFpqqlsh() {
        return fpqqlsh;
    }

    public void setFpqqlsh(String fpqqlsh) {
        this.fpqqlsh = fpqqlsh == null ? null : fpqqlsh.trim();
    }

    public String getFpDm() {
        return fpDm;
    }

    public void setFpDm(String fpDm) {
        this.fpDm = fpDm == null ? null : fpDm.trim();
    }

    public String getFpHm() {
        return fpHm;
    }

    public void setFpHm(String fpHm) {
        this.fpHm = fpHm == null ? null : fpHm.trim();
    }

    public String getKprq() {
        return kprq;
    }

    public void setKprq(String kprq) {
        this.kprq = kprq == null ? null : kprq.trim();
    }

    public Integer getKplx() {
        return kplx;
    }

    public void setKplx(Integer kplx) {
        this.kplx = kplx;
    }

    public String getCzdm() {
        return czdm;
    }

    public void setCzdm(String czdm) {
        this.czdm = czdm == null ? null : czdm.trim();
    }

    public String getJym() {
        return jym;
    }

    public void setJym(String jym) {
        this.jym = jym == null ? null : jym.trim();
    }

    public String getPdfFile() {
        return pdfFile;
    }

    public void setPdfFile(String pdfFile) {
        this.pdfFile = pdfFile == null ? null : pdfFile.trim();
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl == null ? null : pdfUrl.trim();
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg == null ? null : returnMsg.trim();
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage == null ? null : returnMessage.trim();
    }
}