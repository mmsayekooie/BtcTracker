package com.application.json;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class SaveInputJson {
    @JsonFormat(pattern = "dd/MM/yyyy'T'hh:mm:ssZZZZ")
    private Timestamp time;
    private double amount;

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount != 0)
            this.amount = amount;
    }
}
