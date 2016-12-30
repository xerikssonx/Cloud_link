package com.edd.gwt.client.request;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.fusesource.restygwt.client.RestService;

import com.edd.gwt.common.model.Todo;


public interface TestRequest extends RestService {

	@GET
	@Path("test")
	public void test(SuccessfulMethodCallback<List<Todo>> callback);
}
