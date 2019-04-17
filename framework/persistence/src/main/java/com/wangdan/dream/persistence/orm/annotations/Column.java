package com.wangdan.dream.persistence.orm.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    int displaySize() default 15;

    boolean isPrimaryKey() default false;

    boolean autoIncremental() default false;

    boolean notNull() default false;

    boolean unsigned() default false;

    String value() default "";
}
