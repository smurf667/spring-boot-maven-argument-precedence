# Spring Boot Maven plugin - argument precedence?

According to https://docs.spring.io/spring-boot/docs/current/maven-plugin/reference/htmlsingle/#goals-run-parameters-details-commandlineArguments

> Arguments from the command line that should be passed to the application. Use spaces to separate multiple arguments and make sure to wrap multiple values between quotes. When specified, takes precedence over #arguments.

This is not really what I expect

	mvn spring-boot:run -Dspring-boot.run.arguments="--hello=world"

I get

```
[INFO] --- spring-boot-maven-plugin:2.7.4:run (default-cli) @ demo ---
[INFO] Attaching agents: []
Arguments: [--oh_hello=there]

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.4)
```

But I [expect](src/main/java/com/example/demo/DemoApplication.java#L12) `Arguments: [--hello=world]`.

I would say putting `<arguments>` into `pom.xml` means you **cannot override on the comand line**. This seems wrong.
