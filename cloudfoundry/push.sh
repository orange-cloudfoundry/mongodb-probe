#!/bin/sh
cf push -f app.yaml  -p ../target/mongodb-probe-0.0.1-SNAPSHOT.jar

