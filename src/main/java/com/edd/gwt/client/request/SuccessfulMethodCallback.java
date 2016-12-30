package com.edd.gwt.client.request;

import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.MethodCallback;

import com.google.gwt.core.client.GWT;

import gwt.material.design.client.ui.MaterialToast;

@FunctionalInterface
public interface SuccessfulMethodCallback<T> extends MethodCallback<T> {

	@Override
	public default void onFailure(Method method, Throwable exception) {
		MaterialToast.fireToast(exception.getMessage(), "error_toast");
		GWT.log(exception.toString());
	}

}
