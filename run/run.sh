#!/bin/sh

#curl -X POST http://54.254.139.175:8080/v2/apps -d @dockerregistry.json -H "Content-type: application/json"

curl -X POST http://192.168.50.4:8080/v2/apps -d @run.json -H "Content-type: application/json"

