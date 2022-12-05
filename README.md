This repository showcases a bug with Android Studio incorrectly showing type issue Java based Android application that
uses a Kotlin library

The bug:

There is a Kotlin based Android library (my_kotlin_lib in this repository) which has a nested interface. Check
TopInterface.Nested interfaace.

There is another class that implements that nested interface. Check SomeLibraryClassThatUsesNestedInterfaceAsParam

When we want to use this library in a Java based Android project, depending on how we import this library following
code will seem problematic or not.
 ```
final SomeLibraryClassThatUsesNestedInterfaceAsParam instanceIWantToUse =
                new SomeLibraryClassThatUsesNestedInterfaceAsParam();
        instanceIWantToUse.doSomethingWith(new NestedImplementation());
```

* When the library  is declared as a project dependency (implementation files('libs/my_kotlin_lib-debug
.aar')) Android Studio won't show any issue for this code
* When the library is declared as an AAR dependency (implementation files('libs/my_kotlin_lib-debug.aar'))
 Android Studio will show an error like below.

 ![Screenshot](/as_schreenshot.png)

 However there is no issue building and running the app.issue
 To see it yourself run the following command:

 ` ./gradlew appwithaardependencies:build`

  Expectation :Android Studio shouldn't show this as an issue:


  Android Studio info
`
  Android Studio Chipmunk | 2021.2.1 Patch 2
  Build #AI-212.5712.43.2112.8815526, built on July 10, 2022
  Runtime version: 11.0.12+0-b1504.28-7817840 x86_64
  VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
  macOS 12.6.1
  GC: G1 Young Generation, G1 Old Generation
  Memory: 16384M
  Cores: 16
  Registry: external.system.auto.import.disabled=true, ide.instant.shutdown=false
  Non-Bundled Plugins: Dart (212.5744), org.intellij.plugins.markdown (212.5457.16), com.thoughtworks.gauge (212.4746.52), org.jetbrains.kotlin (212-1.7.10-release-333-AS5457.46), io.flutter (70.0.2)
  `

