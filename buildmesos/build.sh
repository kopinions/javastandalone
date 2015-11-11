#!/bin/sh

curl -X POST http://54.254.139.175:8080/v2/apps -d @umsbuild.json -H "Content-type: application/json"

