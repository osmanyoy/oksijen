package com.kkb.spring.appevent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppEventListener {

    @EventListener(classes = MyAppEvent.class)
    public void handleEvent(final MyAppEvent appEventParam) {
        System.out.println("Handle Event : " + appEventParam);
    }

}
