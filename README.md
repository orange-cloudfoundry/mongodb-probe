# Your Project Name
![Build Status](https://github.com/poblin-orange/mongodb-probe/actions/workflows/maven.yml/badge.svg)

## Description


Sample mongodb app.
Generated with Claude Sonet 3.5


references:
- https://github.com/kokuwaio/helm-maven-plugin





./mvnw clean install
./mvnw spring-boot:build-image

#docker run -d -p 8080:8080 docker run -i spring-mongo-demo:0.0.1-SNAPSHOT
docker run -i spring-mongo-demo:0.0.1-SNAPSHOT
 


docker tag ${project.artifactId}:${project.version} your-username/${project.artifactId}:latest
docker push your-username/${project.artifactId}:latest