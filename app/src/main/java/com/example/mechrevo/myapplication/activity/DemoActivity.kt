package com.example.mechrevo.myapplication.activity

import android.annotation.SuppressLint
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.Observer
import android.content.Context
import android.content.Intent
import android.content.PeriodicSync
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.Constraints
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.work.*
import com.example.mechrevo.myapplication.R
import com.example.mechrevo.myapplication.adapter.RecyAdapter
import com.example.mechrevo.myapplication.bean.HisData
import com.example.mechrevo.myapplication.bean.HistoryData
import com.example.mechrevo.myapplication.decoration.LinearItemDecoration
import com.example.mechrevo.myapplication.layoutmanager.RyManager
import com.example.mechrevo.myapplication.sealed.DataClass
import com.example.mechrevo.myapplication.sealed.Expr
import com.example.mechrevo.myapplication.view.BeanView
import com.example.mechrevo.myapplication.work.CompressWorker
import com.example.mechrevo.myapplication.work.WorkA
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_demo.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.toast
import org.json.JSONObject

import java.lang.ref.WeakReference
import java.util.*

class DemoActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        private const val TAG = "DemoActivity"
    }

    val baseImpl: BaseImpl by lazy { BaseImpl(10) }

    @SuppressLint("EnqueueWork")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)


        val baseImpl = BaseImpl(10)

        val hisData = HistoryData("giftUrl")

        var a = if (1 > 2) 10 else 20

        val deri = Derived(baseImpl)
        deri.print()

        val result = Expr.Const(10.8)
        val eval = result.eval(result)
        Log.d("Selad", eval)
        val doubanStr = "{\"count\": 10,  \"title\": \"\\u8c46\\u74e3\\u7535\\u5f71Top250\"}"

        val doubanGson = Gson().fromJson<DataClass>(doubanStr, DataClass::class.java)
        Log.d("DouBan", doubanGson.toString() + "str：" + doubanGson.title + " int: " + doubanGson.count)

        testWhen(2)

        rv_list.setOnClickListener(this)
        rv_list.addAdapter(this)

        val myRule = androidx.work.Constraints.Builder()
            .setRequiresDeviceIdle(true)
            .setRequiresCharging(true)
            .build()

        val context = this

        //构建该任务
        val request = OneTimeWorkRequest
            .Builder(WorkA::class.java)
            .build()
        //观察该任务
        WorkManager.getInstance().getStatusById(request.id)
            .observe(context, android.arch.lifecycle.Observer<WorkStatus> { state ->
                if (state != null && state.state.isFinished) {
                    val adResult = state?.outputData?.getString("WorkA", "defalut")
                    Log.e("WorkA", adResult)
                }
            })
        //开始任务
        WorkManager.getInstance().enqueue(request)

        WorkManager.getInstance().beginWith(request)
    }


    fun RecyclerView.addAdapter(context: Context) = this.apply {
        val layoutManager = RyManager()
        val recyclerViewPool = RecyclerView.RecycledViewPool()
        val recyAdapter = RecyAdapter(context)
        rv_list.apply {
            setLayoutManager(layoutManager)
            setHasFixedSize(true)
            setRecycledViewPool(recyclerViewPool)
            adapter = recyAdapter
        }
        rv_list.addItemDecoration(LinearItemDecoration())
    }

    internal fun add(iAdd: IAdd) {
    }

    internal interface IAdd {
        fun add()
    }

    fun testWhen(int: Int) {
        when (int) {
            1 -> {
                System.out.print("111")
            }
            2 -> {
                System.out.print("222")
            }
            3 -> {
                System.out.print("333")
            }
        }
    }


    interface IBase {
        fun print()
    }

    class BaseImpl(var x: Int) : IBase {
        override fun print() {
            Log.d("BaseImpl", "委托类开始打印")
        }
    }

    override fun onResume() {
        super.onResume()
        val intent = Intent()
        val testOutSide = testOutSide(intent)
    }

    class Derived(baseImpl: BaseImpl) : IBase by baseImpl

    fun DemoActivity.say() {
        print(javaClass.simpleName)
    }

    fun testOutSide(intent: Intent): Intent = with(DemoActivity) {
        intent.putExtra("outside", "")
            .putExtra("age", 1)
    }


    fun openIntent() {

    }

}
