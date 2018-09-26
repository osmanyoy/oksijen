package com.kkb.spring.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyHealth implements HealthIndicator {

    public static class ResultObj {

        private String desc;
        private int    cause;

        public String getDesc() {
            return this.desc;
        }

        public void setDesc(final String descParam) {
            this.desc = descParam;
        }

        public int getCause() {
            return this.cause;
        }

        public void setCause(final int causeParam) {
            this.cause = causeParam;
        }

    }

    @Override
    public Health health() {
        ResultObj resultObjLoc = new ResultObj();
        resultObjLoc.setDesc("down oldu çünkü ben öyle istedim");
        resultObjLoc.setCause(100);
        return Health.down()
                     .withDetail("Sonuc",
                                 resultObjLoc)
                     .build();
    }

}
