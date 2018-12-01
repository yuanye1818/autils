package cn.yuanye1818.autils.compiler.annotation.permission;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface PermissionCheck {
    String[] value();

    boolean isForce() default true;
}
