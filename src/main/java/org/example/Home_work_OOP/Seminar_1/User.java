package org.example.Home_work_OOP.Seminar_1;

public class User extends Basket {
    private String loginUser;
    private String password;


    public User(String[] buyTovar, String loginUser, String password) {
        super(buyTovar);
        this.loginUser = loginUser;
        this.password = password;
    }

    public User(String loginUser, String password) {
        this.loginUser = loginUser;
        this.password = password;
    }

    public User(String[] buyTovar) {
        super(buyTovar);
    }

    public User() {
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
