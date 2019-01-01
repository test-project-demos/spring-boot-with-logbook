package com.example.springbootwithlogbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.zalando.logbook.Correlation;
import org.zalando.logbook.HttpLogWriter;
import org.zalando.logbook.Precorrelation;

import java.io.IOException;

/**
 * @author zhixiao.mzx
 * @date 2019/01/01
 */
@Slf4j
@Configuration
public class SelfLogBookHttpLogWriter implements HttpLogWriter {
    @Override
    public void writeRequest(Precorrelation<String> precorrelation) throws IOException {}

    @Override
    public void writeResponse(Correlation<String, String> correlation) throws IOException {
        log.warn("{\"request\": {}, \"response\": {}}", correlation.getRequest(), correlation.getResponse());
    }
}
