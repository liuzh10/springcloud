package com.liuzh10.test;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AssignableTypeFilter;

import java.util.Set;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassPathScanningCandidateComponentProvider provider = new ClassPathScanningCandidateComponentProvider(false);
        provider.addIncludeFilter(new AssignableTypeFilter(ParentService.class));
        Set<BeanDefinition> components = provider.findCandidateComponents("com/liuzh10/test");
        for (BeanDefinition component : components) {
            Class cls = Class.forName(component.getBeanClassName());
            System.out.println(cls.getName());
        }
    }
}
