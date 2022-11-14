package com.aninfo.model;


import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idtrx;

    private Double amount;
    private Long account;

    public Transaction(){
    }

    public Transaction(Double amount,Long account) {
        this.amount = amount;
        this.account = account;
    }

    public Long getIdtrx() {
        return idtrx;
    }

    public void setIdtrx(Long idtrx) {
        this.idtrx = idtrx;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}