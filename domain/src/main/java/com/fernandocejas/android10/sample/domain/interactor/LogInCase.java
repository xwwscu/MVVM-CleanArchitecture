package com.fernandocejas.android10.sample.domain.interactor;

import android.content.Context;

import com.fernandocejas.android10.sample.domain.interactor.repository.UserDataRepository;
import com.fernandocejas.android10.sample.domain.interactor.repository.UserRepository;

import rx.Observable;

/**
 * Author: wenwu
 * Date: 2021/1/27 8:55 PM
 * Description:
 */
public class LogInCase extends UseCase {
    UserRepository userRepository;

    public LogInCase(Context appContext) {
        userRepository = new UserDataRepository(appContext);
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return userRepository.logIn();
    }
}
