#! /bin/bash

protoc --java_out src/main/scala src/main/protobuf/message.proto

protoc --java_out src/main/scala src/main/protobuf/person.proto