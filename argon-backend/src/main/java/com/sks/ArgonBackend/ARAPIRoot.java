package com.sks.ArgonBackend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/**
 * Setup our API. Expose it to Maven.
 */
@Api(name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(ownerDomain = "helloworld.example.com",
                ownerName = "helloworld.example.com",
                packagePath=""
        )
    )

/**
  * Add your first API methods in this class, or you may create another class. In that case, please
  * update your web.xml accordingly.
 **/
public class ARAPIRoot {

    /**
     * Method to simply return what the request sent.
     */
    @ApiMethod(name = "echo")
    public String echo(@Named("requestString") String requestString) {
        String responseString = requestString;
        return responseString;
    }

}
