# MongoDb probe app
![Build Status](https://github.com/poblin-orange/mongodb-probe/actions/workflows/maven.yml/badge.svg)

## Description


Sample mongodb app.
Based on spring boot + mongodb starter + opentelemetry starter.
Packaged as:
- a cloudfoundry compatible jar
- an OCI image
- a helm chart for convenient k8s deployment of the image with adapter config (mongodb uri, otel endpoint)



## references:
- https://github.com/kokuwaio/helm-maven-plugin
- https://opentelemetry.io/blog/2024/spring-starter-stable/
- https://opentelemetry.io/docs/languages/java/configuration/

## basic tests

chart values.yaml:

```
mongodb:
  uri: mongodb://databaseAdmin:yyyy.zzzz:27017,rs0-1-2e385b67-a1c9-4aa0-910d-b25dc99e9c5d.zzzz:27017,rs0-2-2e385b67-a1c9-4aa0-910d-b25dc99e9c5d.zzzz:27017/admin?replicaSet=rs0

otlp:
  serviceName: probe-for-mongodb
  tracing:
    endpoint: http://jaeger-collector-303ada4c-4478-49dd-b427-8c482bfc17b8.zzzz:443
    sampling:
      probability: 1.0

```


install OCI chart:

```

helm template oci://ghcr.io/poblin-orange/mongodb-probe/mongodb-probe --version 0.0.1 -f ./mongodb-probe-values.yaml  | kubectl apply -f -

``` 

testing probe REST API:
```

```

