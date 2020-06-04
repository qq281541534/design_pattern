package com.theone.design.pattern.structural.proxy.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author: liuyu
 * @DateTime: 2020/5/25 15:17
 * @Description: 动态数据源
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }
}
