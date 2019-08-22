package com.mindorks.bootcamp.learndagger.di.modules;

import android.app.Activity;
import android.content.Context;

import androidx.core.content.PermissionChecker;

import com.mindorks.bootcamp.learndagger.data.local.DatabaseService;
import com.mindorks.bootcamp.learndagger.data.remote.NetworkService;
import com.mindorks.bootcamp.learndagger.ui.MainActivity;
import com.mindorks.bootcamp.learndagger.ui.MainViewModel;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ajay Deepak on 22-08-2019, 17:48
 */

@Module
public class ActivityModule {

    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    Context provideContext(){
        return activity;
    }


}
