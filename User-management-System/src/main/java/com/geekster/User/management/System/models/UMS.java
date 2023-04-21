package com.geekster.User.management.System.models;

public class UMS {
    private String UserId;
    private String Name;
    private String UserName;
    private String Address;
    private String Phone_Number;

    public UMS(String userId, String name, String userName, String address, String phone_Number) {
        this.UserId = userId;
        this.Name = name;
        this.UserName = userName;
        this.Address = address;
        this.Phone_Number = phone_Number;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    public String getUserId() {
        return UserId;
    }

    public String getName() {
        return Name;
    }

    public String getUserName() {
        return UserName;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public String getId() {
        return UserId;
    }
}
