package com.kkb.spring.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

public class MyCondition implements Condition {

    @Override
    public boolean matches(final ConditionContext contextParam,
                           final AnnotatedTypeMetadata metadataParam) {
        MultiValueMap<String, Object> allAnnotationAttributesLoc = metadataParam.getAllAnnotationAttributes(MyConditionAnno.class.getName());
        String firstLoc = (String) allAnnotationAttributesLoc.getFirst("test");
        String propertyLoc = contextParam.getEnvironment()
                                         .getProperty("kkb.condition.test");
        boolean equalsLoc = firstLoc.equals(propertyLoc);
        return equalsLoc;
    }

}
