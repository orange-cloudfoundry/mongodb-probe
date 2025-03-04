Sample mongodb app.
Generated with Claude Sonet 3.5



./mvnw clean install
./mvnw spring-boot:build-image

#docker run -d -p 8080:8080 docker run -i spring-mongo-demo:0.0.1-SNAPSHOT
docker run -i spring-mongo-demo:0.0.1-SNAPSHOT
 


docker tag ${project.artifactId}:${project.version} your-username/${project.artifactId}:latest
docker push your-username/${project.artifactId}:latest