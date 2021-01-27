package com.fernandocejas.android10.sample.presentation.viewmodel;

import android.content.Context;

import com.fernandocejas.android10.sample.domain.interactor.DefaultSubscriber;
import com.fernandocejas.android10.sample.domain.interactor.LogInCase;
import com.fernandocejas.android10.sample.domain.interactor.UseCase;
import com.fernandocejas.android10.sample.domain.interactor.entity.LogIn;

/**
 * Author: wenwu
 * Date: 2021/1/27 8:59 PM
 * Description:
 */
public class LogInViewModel {
    UseCase logInCase;

    public LogInViewModel(Context context) {
        logInCase = new LogInCase(context);
    }
    public void logIn() {
        logInCase.execute(new DefaultSubscriber<LogIn>() {

            @Override
            public void onNext(LogIn logIn) {
                super.onNext(logIn);
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
            }

            @Override
            public void onCompleted() {
                super.onCompleted();
            }
        });
    }
}
