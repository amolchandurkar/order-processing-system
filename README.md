# order-processing-system
Microservice using (Java, Spring Boot, Kafka) with Clean Architecture Pattern
## Introduction to Domain-Driven Design
Domain-Driven Design offers solutions to common problem when building enterprise software
Strategic DDD vs Tactical DDD
Strategic DDD: Introduces boundaries for domain model. Single Bounded context per each domain
### What is a Domain? 
Operational area of your application. e.g;  Online food ordering
### Bounded Context: 
Central pattern in DDD. Boundary within a Domain
### Ubiquitous Language: 
Common language used by domain experts and developers
## Tactical DDD: Implementation patterns.
### Entities: 
Domain object with a unique identity. Embodies set of critical business rules.
### Aggregates: 
Group of Entity objects which always need to be in consistent state
### Aggregate Root (AR): 
Entry point Entity for an aggregate. All business operations should go through root.
An Aggregate should be referenced from outside through its root only. AR should have pure, side-effect free functions.
### Value Objects: 
Immutable objects without identity. Only value matters. Brings context to the value
### Domain Events: 
Decouple different domains. Describe things that happen and change the state of a domain.
Makes the system extendable. Domain event listeners runs in a different transaction than the event publishers
In  Domain-driven system, domain events are an excellent way of achieving eventual consistency. 
Any system or module that needs to update itself when something happens in another module or system    
can subscribe to the domain events coming from that system
### Domain Services: 
Business logic that cannot fit in the aggregate. Used when multiple aggregates required in 
business logic Can interact with other domain services
### Application Services: 
Allows the isolated domain to communicate with outside. Orchestrate transaction,
security, looking up proper aggregates and saving state changes of the domain to the database. Does not  
contain any business logic.
Domain event listeners are special kind of Application services that is triggered by domain events. Each   
domain event listener can have a separate domain service to handle business logic.
### Domain Driven Design 
"For most software projects, the primary focus should be on the domain and domain logic."
"Complex domain designs should be based on a model." 
"Domain-driven design is both a way of thinking and a set of priorities, aimed at accelerating 
 software projects that have to deal with complicated domains."
"LAYERED ARCHITECTURE is used in most systems today, under various layering schemes. 
 Many styles of development can also benefit from layering. However, domain-driven design requires 
 only one particular layer to exist."
"The domain model is a set of concepts. The "domain layer" is the manifestation of that model and 
 all directly related design elements. The design and implementation of business logic constitute 
 the domain layer. In a MODEL-DRIVEN DESIGN, the software constructs of the domain layer mirror the model concepts."

# Refrences
https://beanvalidation.org/2.0/spec/#constraintdeclarationvalidationprocess-methodlevelconstraints-inheritance
https://microservices.io/patterns/microservices.html
https://dzone.com/articles/design-patterns-for-microservices
https://docs.microsoft.com/en-us/azure/architecture/microservices/design/patterns
https://netflixtechblog.com/ready-for-changes-with-hexagonal-architecture-b315ec967749
https://dzone.com/articles/hexagonal-architecture-what-is-it-and-how-does-it
https://reflectoring.io/spring-hexagonal/




