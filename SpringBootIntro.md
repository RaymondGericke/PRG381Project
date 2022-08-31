### What is the Sping Boot framework?
Spring Framework provides a dependency injection feature that lets objects declare their own dependencies that the Spring container automatically injects into them. This allows developers to create modular applications consisting of loosely coupled components that are ideal for microservices and distributed network applications.Spring Framework includes built-in support for many common application tasks, such as data binding, type conversion, validation, exception handling, resource and event management, internationalization, and more. 

The Spring Framework integrates with various Java EE technologies, such as RMI (Remote Method Invocation), AMQP (Advanced Message Queuing Protocol), Java Web Services, and others.This allows developers to create cross-platform Java EE applications that run in any environment.

### What Spring Boot adds to Spring Framework
### Autoconfiguration
Autoconfiguration means that applications are set up with recommended dependencies that you don't have to configure manually. Java Spring Boot comes with built-in autoconfiguration capabilities, which means it will automatically configure both the underlying Spring Framework and any third-party packages you might be using based on your settings.Even though you can override these defaults once the initialization is complete, this autoconfiguration feature enables you to start developing your Spring-based applications quickly and reduces the possibility of human errors. 

### Opinionated approach
Spring Boot takes an opinionated approach to adding and configuring starter dependencies, based on the needs of your project.Rather than requiring you to make all those decisions yourself, Spring Boot chooses which packages to install and which default values to use. This allows you to focus on your project's specific needs, while Spring Boot takes care of the rest.

During the startup process, when you select from a variety of starter dependencies known as Spring Starters that address common use cases, you can specify the requirements of your project. You can use Spring Boot Initializr without writing any code by completing a short web form.

For instance, the 'Spring Web' starter dependency enables you to quickly and easily create Spring-based web applications by adding all the required dependencies, including the Apache Tomcat web server, to your project. Another well-known startup dependency that automatically adds authentication and access-control functionality to your application is "Spring Security."

Over 50 Spring Starters are included in Spring Boot, and there are many more third-party starters available.


### Standalone programs
Spring Boot enables programmers to build ready-to-use applications. By integrating a web server like Tomcat or Netty inside your app during the startup phase, it specifically enables you to construct standalone applications that function independently, without relying on an external web server. As a result, by just selecting the Run command, you may run your program on any platform. To create apps without an embedded Web server, you can disable this capability.

### Spring Boot Aspect-Oriented Programming (AOP)
Programming paradigm known as AOP (Aspect-Oriented Programming) promotes modularity by enabling the division of the cross-cutting issue. The primary business reasoning is distinct from these cross-cutting concerns. Existing code can have extra behavior added to it without changing the code itself.

We can put these overarching concerns into practice with the aid of Spring's AOP framework.

We create common functionality in a single location using AOP. Without changing the class to which the new feature is being applied, we have complete freedom to specify how and where this capability is applied. Now, the cross-cutting issue can be divided into distinct classes called aspects.

Aspects have the following two advantages:
    -First, rather than being dispersed throughout the codebase, the logic for each concern is now in a single location.

    -Second, the business modules' code is limited to what is relevant to them. The aspect now has the secondary concern.
    The advice-giving parts are accountable for its implementation. At one or more join points, we can include an aspect's functionality into a program.

### Advantages of AOP
-It is entirely Java-based.
-The use of a unique compilation procedure is not necessary.
-Only method execution Join points are supported.
-There is just run time weaving offered.
-JDK dynamic proxy and CGLIB proxy are the two types of AOP proxy that are accessible.

### AOP vs OOP
AOP:                                                                            
 Aspect:A code unit that encapsulates pointcuts, advices, and attributes.
 Pointcut: It defines the set of access factors wherein recommendation is executed.
 Advice: It is an implementation of cross-reducing concerns.
 Waver: It constructs code (supply or item) with recommendation.Compiler: It converts supply code to item code.

OOP:
 Class: A code unit that encapsulates techniques and attributes.
 Method signature: It defines the access factors for the execution of technique bodies.
 Method bodies: It is an implementation of the enterprise common sense concerns.
 Compiler: It converts supply code to item code.