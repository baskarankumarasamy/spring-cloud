#!/bin/bash

ps -ef | grep spring-cloud-inegration-0.0.1-SNAPSHOT.jar | grep -v grep | awk '{print $2}' | xargs kill