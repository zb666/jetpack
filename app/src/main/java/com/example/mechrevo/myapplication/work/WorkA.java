package com.example.mechrevo.myapplication.work;

import android.support.annotation.NonNull;
import androidx.work.Data;
import androidx.work.Worker;

public class WorkA extends Worker {
    @NonNull
    @Override
    public WorkerResult doWork() {
        Data data = new Data.Builder().putString("WorkA", "WorkA_String").build();
        setOutputData(data);
        return WorkerResult.SUCCESS;
    }
}
