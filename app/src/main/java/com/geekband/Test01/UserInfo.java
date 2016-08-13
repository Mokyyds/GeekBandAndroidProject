package com.geekband.Test01;

import java.io.Serializable;

/**
 * Function:
 * Create date on 15/10/30.
 *
 * @author Conquer
 * @version 1.0
 */
public class UserInfo implements Serializable{

    private String mUserName;
    private int mAge;

    public UserInfo(String userName, int age) {
        mUserName = userName;
        mAge = age;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int age) {
        mAge = age;
    }
}
