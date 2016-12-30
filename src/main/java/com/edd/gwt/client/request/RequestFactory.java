package com.edd.gwt.client.request;

import org.fusesource.restygwt.client.Resource;
import org.fusesource.restygwt.client.RestServiceProxy;

import com.google.gwt.core.client.GWT;

public class RequestFactory {

	public static final TestRequest testRequest = GWT.create(TestRequest.class);

	
	
	
	static {
		Resource apiResource = new Resource("/api");
		((RestServiceProxy) testRequest).setResource(apiResource);
	}

}
