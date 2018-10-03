package com.kkb.spring.appevent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListenerOld implements ApplicationListener<MyAppEvent> {

    private final Logger logger = LoggerFactory.getLogger(MyEventListenerOld.class);

    @Override
    public void onApplicationEvent(final MyAppEvent eventParam) {
        if (this.logger.isDebugEnabled()) {
            this.logger.debug(eventParam.toString());
        }

        System.out.println(eventParam);
    }

}
