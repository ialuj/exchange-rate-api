# exchange-rate-api
-- Basic API that shows exchange rates from a certain Provider.
-- Providers (BCI and BIM)
-- Database: uses H2 in Memory Database which the data is located on sql file (schema.sql)

1. Search Exchange Rates by Provider
   http:localhost:8080/api/v1/{providerName}/rates

2. Search Exchange Rates from all providers
   http:localhost:8080/api/v1/all/rates

Build and Deploy the API

 Technologies: Spring Boot API running on Java 8 JVM and using H2 Database which the data are base on schema.sql file located on the resources folder.
