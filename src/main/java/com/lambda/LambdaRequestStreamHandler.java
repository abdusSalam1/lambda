package com.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import sun.misc.IOUtils;

import java.io.InputStream;
import java.io.OutputStream;

public class LambdaRequestStreamHandler implements RequestStreamHandler {
    public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) {
        try {
            String input = inputStream.toString();
            outputStream.write(("Hello World - " + input).getBytes());
        }
        catch (Exception ex){

        }
    }
}
