package com.alibaba.otter.canal.client.adapter.phoenix.test.sync;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.otter.canal.client.adapter.phoenix.PhoenixAdapter;
import com.alibaba.otter.canal.client.adapter.phoenix.test.TestConstant;
import com.alibaba.otter.canal.client.adapter.support.DatasourceConfig;
import com.alibaba.otter.canal.client.adapter.support.OuterAdapterConfig;

public class Common {

    public static PhoenixAdapter init() {
        DatasourceConfig.DATA_SOURCES.put("defaultDS", TestConstant.dataSource);

        OuterAdapterConfig outerAdapterConfig = new OuterAdapterConfig();
        outerAdapterConfig.setName("phoenix");
        outerAdapterConfig.setKey("oracle1");
        Map<String, String> properties = new HashMap<>();
        properties.put("jdbc.driveClassName", "oracle.jdbc.OracleDriver");
        properties.put("jdbc.url", "jdbc:oracle:thin:@127.0.0.1:49161:XE");
        properties.put("jdbc.username", "mytest");
        properties.put("jdbc.password", "m121212");
        outerAdapterConfig.setProperties(properties);

        PhoenixAdapter adapter = new PhoenixAdapter();
        adapter.init(outerAdapterConfig, null);
        return adapter;
    }
}
