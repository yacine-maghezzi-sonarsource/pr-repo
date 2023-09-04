cmake_minimum_required(VERSION 3.9)
project(maven-basic-moralanguages)

set(CMAKE_CXX_STANDARD 17)

add_executable(maven-basic-moralanguages cpp-build-wrapper/src/HelloWorld.cpp)