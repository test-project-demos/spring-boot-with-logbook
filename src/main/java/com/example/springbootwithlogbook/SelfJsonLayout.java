package com.example.springbootwithlogbook;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.contrib.json.classic.JsonLayout;

import java.util.Map;

/**
 * @author zhixiao.mzx
 * @date 2019/01/03
 */
public class SelfJsonLayout extends JsonLayout {
    @Override
    public void addCustomDataToJsonMap(Map<String, Object> map, ILoggingEvent event) {
        StackTraceElement caller = event.getCallerData()[0];
        map.put("caller",
            String.format("%s#%s:%s", caller.getClassName(), caller.getMethodName(), caller.getLineNumber()));
    }
}
