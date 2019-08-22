package com.mindorks.bootcamp.learndagger.di.modules;

import android.content.Context;

import androidx.core.content.pm.PermissionInfoCompat;

import com.mindorks.bootcamp.learndagger.MyApplication;
import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.di.qualifier.DatabaseInfo;
import com.mindorks.bootcamp.learndagger.di.qualifier.NetworkInfo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ajay Deepak on 22-08-2019, 17:03
 *
 * Module class will provide the methods through which the dependency will be provided
 * to required classes
 */

@Module
public class ApplicationModule {

    private MyApplication application;

    public ApplicationModule(MyApplication application) {
        this.application = application;
    }

    @Provides
    Context provideContext(){
        return  application;
    }
    @DatabaseInfo
    @Provides
    String provideDbname(){
        return "abc";
    }
    @Provides
    Integer provideDbVersion(){
        return 1;
    }
    @NetworkInfo
    @Provides
    String provideApiKey(){
        return "xyz";
    }

    /*@Singleton
    @Provides // dagger will look for this annotation to build dependency
    NetworkService provideNetworkService(){
        return new NetworkService(application, "123");
    }

    @Singleton
    @Provides
    DatabaseService provideDatabaseService(){
        return new DatabaseService(application, "db", 1);
    }*/


}
