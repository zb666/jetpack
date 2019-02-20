package com.example.mechrevo.myapplication.work;

import android.content.Intent;
import android.support.annotation.NonNull;
import androidx.work.Worker;

public class WorkA extends Worker {
    @NonNull
    @Override
    public WorkerResult doWork() {
        int savedDataA = getInputData().getInt("A", 0);
        return WorkerResult.SUCCESS;
    }


}
