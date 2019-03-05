package com.example.mechrevo.myapplication.statedesign

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.mechrevo.myapplication.R
import com.example.mechrevo.myapplication.propstate.LoginContext
import com.example.mechrevo.myapplication.propstate.LoginedState
import kotlinx.android.synthetic.main.activity_state.*

class StateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state)
        var loginContext = LoginContext.getInstance()

        tvPass.setOnClickListener {
            loginContext.setLoginState(LoginedState())
        }

        tvLoginOut.setOnClickListener {
            loginContext.doComponent(baseContext)
        }
        tvReset.setOnClickListener {
            loginContext.resetState()
        }
    }
}
