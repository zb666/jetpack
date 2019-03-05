package com.example.mechrevo.myapplication.propstate;

import android.content.Context;

public class LoginContext {

    private static LoginContext sLoginContext = new LoginContext();

    private IUserState mUserState = new LogoutState();

    private static final String LOGOUT_STATE = "com.example.mechrevo.myapplication.propstate.LogoutState";
    //保存当前 登陆或者 登出的状态
    private IUserState mOriginalState;

    private LoginContext(){

    }

    public static LoginContext getInstance(){
        return sLoginContext;
    }

    public void setLoginState(IUserState userState) {
       mUserState = userState;
    }

    public void doComponent(Context context){
        mUserState.comment(context);
    }

    public void doForward(Context context){
        mUserState.forward(context);
    }

    public void resetState(){
        try {
            try {
                if (mOriginalState == null) {
                    mOriginalState = (IUserState) Class.forName(LOGOUT_STATE).newInstance();
                }
                //还原初始的状态
                setLoginState(mOriginalState);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
