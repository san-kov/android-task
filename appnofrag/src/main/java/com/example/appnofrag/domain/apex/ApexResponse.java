package com.example.appnofrag.domain.apex;


public class ApexResponse {
    public Data data;

    public ApexResponse(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}

