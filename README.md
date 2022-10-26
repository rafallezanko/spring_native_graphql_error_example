# Example to receive exception when opening GraphQL websocket in spring native environment

# Just run
> ./gradlew nativeRun

# Failing error:
> Task :nativeRun FAILED
>  :: Spring Boot ::       (v3.0.0-SNAPSHOT)
> 
> 2022-10-26T22:00:04.509+02:00  INFO 20600 --- [           main] com.example.demo.DemoApplicationKt       : Starting AOT-processed DemoApplicationKt using Java 17.0.4 on mbpro-rafallezanko.local with PID 20600 (/Users/rafallezanko/Downloads/demo/build/native/nativeCompile/demo started by rafallezanko in /Users/rafallezanko/Downloads/demo)
> 2022-10-26T22:00:04.509+02:00  INFO 20600 --- [           main] com.example.demo.DemoApplicationKt       : No active profile set, falling back to 1 default profile: "default"
> 2022-10-26T22:00:04.542+02:00  INFO 20600 --- [           main] .b.a.g.r.GraphQlWebFluxAutoConfiguration : GraphQL endpoint HTTP POST /graphql
> 2022-10-26T22:00:04.544+02:00  WARN 20600 --- [           main] .r.c.ReactiveWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'webHandler': Error creating bean with name 'graphQlWebSocketEndpoint': Unsatisfied dependency expressed through method 'graphQlWebSocketEndpoint' parameter 0: Error creating bean with name 'graphQlWebSocketHandler': Instantiation of supplied bean failed
> 2022-10-26T22:00:04.544+02:00 ERROR 20600 --- [           main] o.s.boot.SpringApplication               : Application run failed
> 
> org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'webHandler': Error creating bean with name 'graphQlWebSocketEndpoint': Unsatisfied dependency expressed through method 'graphQlWebSocketEndpoint' parameter 0: Error creating bean with name 'graphQlWebSocketHandler': Instantiation of supplied bean failed
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:606) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:521) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:931) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:916) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:584) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.boot.web.reactive.context.ReactiveWebServerApplicationContext.refresh(ReactiveWebServerApplicationContext.java:66) ~[demo:3.0.0-SNAPSHOT]
>         at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:730) ~[demo:3.0.0-SNAPSHOT]
>         at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:432) ~[demo:3.0.0-SNAPSHOT]
>         at org.springframework.boot.SpringApplication.run(SpringApplication.java:308) ~[demo:3.0.0-SNAPSHOT]
>         at org.springframework.boot.SpringApplication.run(SpringApplication.java:1302) ~[demo:3.0.0-SNAPSHOT]
>         at org.springframework.boot.SpringApplication.run(SpringApplication.java:1291) ~[demo:3.0.0-SNAPSHOT]
>         at com.example.demo.DemoApplicationKt.main(DemoApplication.kt:13) ~[demo:na]
> Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'graphQlWebSocketEndpoint': Unsatisfied dependency expressed through method 'graphQlWebSocketEndpoint' parameter 0: Error creating bean with name 'graphQlWebSocketHandler': Instantiation of supplied bean failed
>         at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:365) ~[na:na]
>         at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArguments(BeanInstanceSupplier.java:281) ~[na:na]
>         at org.springframework.beans.factory.aot.BeanInstanceSupplier.get(BeanInstanceSupplier.java:209) ~[na:na]
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainInstanceFromSupplier(AbstractAutowireCapableBeanFactory.java:1225) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1210) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1157) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:561) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:521) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeansOfType(DefaultListableBeanFactory.java:662) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.context.support.AbstractApplicationContext.getBeansOfType(AbstractApplicationContext.java:1285) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.BeanFactoryUtils.beansOfTypeIncludingAncestors(BeanFactoryUtils.java:368) ~[na:na]
>         at org.springframework.web.reactive.DispatcherHandler.initStrategies(DispatcherHandler.java:120) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.web.reactive.DispatcherHandler.setApplicationContext(DispatcherHandler.java:115) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.context.support.ApplicationContextAwareProcessor.invokeAwareInterfaces(ApplicationContextAwareProcessor.java:109) ~[na:na]
>         at org.springframework.context.support.ApplicationContextAwareProcessor.postProcessBeforeInitialization(ApplicationContextAwareProcessor.java:85) ~[na:na]
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyBeanPostProcessorsBeforeInitialization(AbstractAutowireCapableBeanFactory.java:420) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1745) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:599) ~[demo:6.0.0-SNAPSHOT]
>         ... 15 common frames omitted
> Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'graphQlWebSocketHandler': Instantiation of supplied bean failed
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainInstanceFromSupplier(AbstractAutowireCapableBeanFactory.java:1236) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainFromSupplier(AbstractAutowireCapableBeanFactory.java:1210) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1157) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:561) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:521) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:254) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1375) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1295) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.aot.BeanInstanceSupplier.resolveArgument(BeanInstanceSupplier.java:348) ~[na:na]
>         ... 36 common frames omitted
> Caused by: java.lang.IllegalArgumentException: No JSON Encoder
>         at org.springframework.graphql.server.webflux.CodecDelegate.lambda$findJsonEncoder$5(CodecDelegate.java:77) ~[na:na]
>         at java.util.Optional.orElseThrow(Optional.java:403) ~[demo:na]
>         at org.springframework.graphql.server.webflux.CodecDelegate.findJsonEncoder(CodecDelegate.java:77) ~[na:na]
>         at org.springframework.graphql.server.webflux.CodecDelegate.<init>(CodecDelegate.java:61) ~[na:na]
>         at org.springframework.graphql.server.webflux.GraphQlWebSocketHandler.<init>(GraphQlWebSocketHandler.java:92) ~[demo:1.1.0-RC1]
>         at org.springframework.boot.autoconfigure.graphql.reactive.GraphQlWebFluxAutoConfiguration$WebSocketConfiguration.graphQlWebSocketHandler(GraphQlWebFluxAutoConfiguration.java:161) ~[demo:na]
>         at org.springframework.boot.autoconfigure.graphql.reactive.GraphQlWebFluxAutoConfiguration__BeanDefinitions$WebSocketConfiguration__BeanDefinitions.lambda$getGraphQlWebSocketHandlerInstanceSupplier$0(GraphQlWebFluxAutoConfiguration__BeanDefinitions.java:109) ~[na:na]
>         at org.springframework.util.function.ThrowingBiFunction.apply(ThrowingBiFunction.java:68) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.util.function.ThrowingBiFunction.apply(ThrowingBiFunction.java:54) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.aot.BeanInstanceSupplier.lambda$get$2(BeanInstanceSupplier.java:212) ~[na:na]
>         at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:59) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:47) ~[demo:6.0.0-SNAPSHOT]
>         at org.springframework.beans.factory.aot.BeanInstanceSupplier.invokeBeanSupplier(BeanInstanceSupplier.java:224) ~[na:na]
>         at org.springframework.beans.factory.aot.BeanInstanceSupplier.get(BeanInstanceSupplier.java:211) ~[na:na]
>         at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.obtainInstanceFromSupplier(AbstractAutowireCapableBeanFactory.java:1225) ~[demo:6.0.0-SNAPSHOT]
>         ... 48 common frames omitted
> 
