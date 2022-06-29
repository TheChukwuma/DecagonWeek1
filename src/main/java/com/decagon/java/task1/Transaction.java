package com.decagon.java.task1;

import java.util.Date;

public class Transaction {
    double amount;
    Date timestamp;
    String note = "";

    Transaction(double amount, Date timestamp, String note){
        this.amount = amount;
        this.timestamp = new Date();
        this.note = note;
    }

    public String getSummaryLine() {
        if (this.amount>=0){
            return String.format("%s : $(%.02f) : %s", this.timestamp.toString(),
                    this.amount, this.note);
        }else {return String.format("%s : $(%.02f) : %s", this.timestamp.toString(),
                this.amount, this.note);}
    }
}
