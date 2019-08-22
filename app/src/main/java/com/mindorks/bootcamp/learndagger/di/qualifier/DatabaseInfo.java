package com.mindorks.bootcamp.learndagger.di.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Ajay Deepak on 22-08-2019, 19:17
 */

@Qualifier
@Retention(RetentionPolicy.SOURCE) // will be removed when compiling
public @interface DatabaseInfo {
}
