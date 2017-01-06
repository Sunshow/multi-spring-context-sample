package net.sunshow.sample.main.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * author: sunshow.
 */
public class ParentAnnotationContextFactory implements FactoryBean<ApplicationContext> {

    private ApplicationContext parent;

    private Class[] annotatedClasses;

    public ParentAnnotationContextFactory(ApplicationContext parent, Class... annotatedClasses) {
        this.parent = parent;
        this.annotatedClasses = annotatedClasses;
    }

    @Override
    public ApplicationContext getObject() throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.setParent(parent);
        context.register(annotatedClasses);
        context.refresh();
        return context;
    }

    @Override
    public Class<?> getObjectType() {
        return ApplicationContext.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
