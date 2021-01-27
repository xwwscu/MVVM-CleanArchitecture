package com.fernandocejas.android10.sample.domain.interactor.entity;

/**
 * Author: wenwu
 * Date: 2021/1/27 8:19 PM
 * Description:
 */
public class LogIn {
    public User user;
    public String token;
    public String phone;

    public LogIn() {

    }

    public LogIn(String token) {
        this.token = token;
    }
}
