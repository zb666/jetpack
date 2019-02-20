package com.example.mechrevo.myapplication.work;

import android.support.annotation.NonNull;
import androidx.work.Worker;

public class WorkB extends Worker {
    @NonNull
    @Override
    public WorkerResult doWork() {
        int savedDataB = getInputData().getInt("B", 1);
        return WorkerResult.SUCCESS;
    }


}
