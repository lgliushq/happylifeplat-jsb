package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

public class Senderinfowlbwmsstockinordernotifywl
        extends TaobaoObject {
    private static final long serialVersionUID = 8679584674213518862L;
    @ApiField("sender_address")
    private String senderAddress;
    @ApiField("sender_area")
    private String senderArea;
    @ApiField("sender_city")
    private String senderCity;
    @ApiField("sender_code")
    private String senderCode;
    @ApiField("sender_mobile")
    private String senderMobile;
    @ApiField("sender_name")
    private String senderName;
    @ApiField("sender_phone")
    private String senderPhone;
    @ApiField("sender_province")
    private String senderProvince;
    @ApiField("sender_town")
    private String senderTown;
    @ApiField("sender_zip_code")
    private String senderZipCode;

    public String getSenderAddress() {
        return this.senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderArea() {
        return this.senderArea;
    }

    public void setSenderArea(String senderArea) {
        this.senderArea = senderArea;
    }

    public String getSenderCity() {
        return this.senderCity;
    }

    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    public String getSenderCode() {
        return this.senderCode;
    }

    public void setSenderCode(String senderCode) {
        this.senderCode = senderCode;
    }

    public String getSenderMobile() {
        return this.senderMobile;
    }

    public void setSenderMobile(String senderMobile) {
        this.senderMobile = senderMobile;
    }

    public String getSenderName() {
        return this.senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderPhone() {
        return this.senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getSenderProvince() {
        return this.senderProvince;
    }

    public void setSenderProvince(String senderProvince) {
        this.senderProvince = senderProvince;
    }

    public String getSenderTown() {
        return this.senderTown;
    }

    public void setSenderTown(String senderTown) {
        this.senderTown = senderTown;
    }

    public String getSenderZipCode() {
        return this.senderZipCode;
    }

    public void setSenderZipCode(String senderZipCode) {
        this.senderZipCode = senderZipCode;
    }
}


