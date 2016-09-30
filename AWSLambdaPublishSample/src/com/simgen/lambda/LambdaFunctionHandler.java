package com.simgen.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<String, String> {

	  @Override
	    public String handleRequest(String input, Context context) {
	        context.getLogger().log("Input: " + input);
	        return "Function was invoked with input " + input;
	    }

}
