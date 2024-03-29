package com.mindorks.bootcamp.learndagger.data.remote;

import android.content.Context;

import com.mindorks.bootcamp.learndagger.di.qualifier.NetworkInfo;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Dummy class to simulate the actual NetworkService using Retrofit or OkHttp etc
 */

@Singleton // mentioning singleton here as it has constructor injection if not we have it in provides()
public class NetworkService {

    private Context context;
    private String apiKey;

    @Inject
    public NetworkService(Context context, @NetworkInfo String apiKey) {
        // do the initialisation here
        this.context = context;
        this.apiKey = apiKey;
    }

    public String getDummyData() {
        return "NETWORK_DUMMY_DATA";
    }
}
