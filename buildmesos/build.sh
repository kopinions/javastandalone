#!/bin/sh

curl -X POST http://192.168.50.4:8080/v2/apps -d @build.json -H "Content-type: application/json"
