package com.kkb.spring.appevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.stereotype.Component;

@Component
public class AppEventRunner implements CommandLineRunner {

    @Autowired
    private ApplicationEventMulticaster aem;

    @Override
    public void run(final String... argsParam) throws Exception {
        MyAppEvent appEventLoc = new MyAppEvent();
        appEventLoc.setCause(100);
        appEventLoc.setMessage("Message test");
        appEventLoc.setError(false);
        this.aem.multicastEvent(appEventLoc);

    }

}
