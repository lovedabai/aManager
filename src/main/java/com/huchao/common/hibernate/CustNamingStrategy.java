package com.huchao.common.hibernate;

import org.hibernate.cfg.ImprovedNamingStrategy;
import org.hibernate.cfg.NamingStrategy;


@SuppressWarnings("serial")
public class CustNamingStrategy extends ImprovedNamingStrategy implements
    NamingStrategy {

    @Override
    public String columnName(String columnName) {
        return addUnderscores(columnName).toLowerCase();
    }

    @Override
    public String tableName(String tableName) {
        return addUnderscores(tableName).toLowerCase();
    }

    @Override
    public String classToTableName(String className) {
        return "hc_"+tableName(className);
    }

    @Override
    public String propertyToColumnName(String propertyName) {
        return addUnderscores(propertyName).toLowerCase();
    }
}
