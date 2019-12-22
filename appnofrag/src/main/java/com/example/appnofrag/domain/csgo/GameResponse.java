package com.example.appnofrag.domain.csgo;

public class GameResponse {
    public Data data;

    public GameResponse(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
