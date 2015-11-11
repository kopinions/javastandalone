#!/bin/sh

curl -X POST http://54.251.190.73:8080/v2/apps -d @umsbuild.json -H "Content-type: application/json"

