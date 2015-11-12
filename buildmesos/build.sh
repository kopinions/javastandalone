#!/bin/sh

curl -X POST http://52.76.134.79:8080/v2/apps -d @umsbuild.json -H "Content-type: application/json"

