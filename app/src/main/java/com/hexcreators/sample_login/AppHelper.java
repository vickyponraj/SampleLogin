package com.hexcreators.sample_login;

public class AppHelper {

    private static AppHelper instance = null;

    private String userName;
    private String password;

    public static AppHelper getInstance() {

        if (instance == null)
            instance = new AppHelper();

        return instance;
    }

    public String getUserName() {
        /*if (userName==null)
            setUserName("");*/
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        /*if(password == null)
            setPassword("");*/
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
