MVVM-CleanArchitecture
=========================

此项目由 [Android-CleanArchitecture](https://github.com/android10/Android-CleanArchitecture)和MVVM-Android-CleanArchitecture(https://github.com/zhengxiaopeng/MVVM_Android-CleanArchitecture) fork 而来,
展现层(Presentation tier)重构成由 MVVM 模式实现，并去除 di(Dagger) 和 lambda，同时去除原项目中presentation对data层的跨层依赖。


Clean architecture
-----------------
![Clean Architecture](http://rocko-blog.qiniudn.com/MVVM_Android-CleanArchitecture-2.png)

Architectural approach
-----------------
![MVVM_Clean-Architecture 分层结构](http://rocko-blog.qiniudn.com/MVVM_Android-CleanArchitecture-3.png)

Architectural reactive approach
-----------------
![MVVM_Clean-Architecture put all 应用在一起](http://rocko-blog.qiniudn.com/MVVM_Android-CleanArchitecture-4.png)

Local Development
-----------------

Here are some useful Gradle/adb commands for executing this example:

 * `./gradlew clean build` - Build the entire example and execute unit and integration tests plus lint check.
 * `./gradlew installDebug` - Install the debug apk on the current connected device.
 * `./gradlew runUnitTests` - Execute domain and data layer tests (both unit and integration).
 * `./gradlew runAcceptanceTests` - Execute espresso and instrumentation acceptance tests.


License
--------
```

MIT License

Copyright (c) 2021 littlesix

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```