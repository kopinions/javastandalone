#!/bin/sh

#curl -X POST http://54.254.139.175:8080/v2/apps -d @dockerregistry.json -H "Content-type: application/json"

curl -X POST http://52.76.134.79:8080/v2/apps -d @ums.json -H "Content-type: application/json"

