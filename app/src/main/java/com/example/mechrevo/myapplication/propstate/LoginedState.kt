package com.example.mechrevo.myapplication.propstate

import android.content.Context
import android.widget.Toast

class LoginedState : IUserState {
    override fun forward(context: Context) {
        Toast.makeText(context, "登陆 转发完成", Toast.LENGTH_SHORT).show()

    }

    override fun comment(context: Context) {
        Toast.makeText(context, "登陆 评论完成", Toast.LENGTH_SHORT).show()
    }
}
