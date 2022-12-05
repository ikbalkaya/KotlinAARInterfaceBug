package com.ablylabs.my_kotlin_lib

class SomeLibraryClassThatUsesNestedInterfaceAsParam {
    fun doSomethingWith(nested: TopInterface.Nested){
        nested.nestedMethod()
    }
}