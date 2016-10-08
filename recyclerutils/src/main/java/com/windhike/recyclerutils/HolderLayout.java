package com.windhike.recyclerutils;

import android.support.annotation.LayoutRes;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Administrator on 2016/10/6 0006.
 */
@Documented
@Retention(RUNTIME)
@Target(ElementType.TYPE)
public @interface HolderLayout {
    @LayoutRes
    int value();
}
