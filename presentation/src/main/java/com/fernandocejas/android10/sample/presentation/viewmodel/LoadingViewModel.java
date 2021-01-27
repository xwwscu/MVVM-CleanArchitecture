package com.fernandocejas.android10.sample.presentation.viewmodel;

import android.view.View;

/**
 * Created by rocko on 15-11-5.
 */
public abstract class LoadingViewModel extends ViewModel {

	@BindView
	public void showLoading() {

	}

	@BindView
	public void showRetry() {

	}

	public abstract View.OnClickListener onRetryClick();
}
