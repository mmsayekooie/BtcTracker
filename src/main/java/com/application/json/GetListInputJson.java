package com.application.json;

import com.fasterxml.jackson.annotation.JsonFormat;

public class GetListInputJson {
    @JsonFormat(pattern = "dd/MM/yyyy'T'hh:mm:ssZZZZ")
    private String t1;
    @JsonFormat(pattern = "dd/MM/yyyy'T'hh:mm:ssZZZZ")
    private String t2;

    public String getT1() {
        return t1;
    }

    public void setT1(String t1) {
        this.t1 = t1;
    }

    public String getT2() {
        return t2;
    }

    public void setT2(String t2) {
        this.t2 = t2;
    }
}
