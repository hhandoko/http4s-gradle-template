[![License](https://img.shields.io/badge/license-Apache--2.0-brightgreen.svg)](LICENSE)

# http4s-gradle-template

`http4s-gradle-template` is a starter template for [http4s] with [Gradle] build system.

## Prerequisites

The only prerequisites is a Java 8+ SDK in path. Gradle build tool will be downloaded and setup on first run.

### sdkman

On macOS or Linux, it is recommended to use [sdkman] to manage the underlying Java SDK version used.

  1. Run `sdk env` on the project root to configure the Java SDK version

_Note: This repo uses Eclipse OpenJ9 Java distribution by default (as defined in `.sdkmanrc`)_

## Setup Steps

### Development mode via Gradle

  1. Run `./gradlew run` to start the application in development mode

Now you can visit it on [`localhost:8080`](http://localhost:8080) from your browser.

## Code Formatting

We follow [Google Java styleguide] for Java code formatting and style, and custom Scalafmt rule for Scala as found in
`.scalafmt.conf`.

  - Import the relevant configuration to your favourite IDE to auto-apply formatting during development time, or
  - Run `spotlessCheck` and `spotlessApply` prior to committing your code to apply auto-formatting

Scalafmt does not enforce import formatting order, so these rules should be manually-applied in the IDE.

## License

```
    Copyright (c) 2020 Herdy Handoko

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
```

`http4s-gradle-template` is released under the Apache Version 2.0 License. See the [LICENSE] file for further details.

[Google Java styleguide]: https://google.github.io/styleguide/javaguide.html
[Gradle]: https://gradle.org/
[http4s]: https://http4s.org/
[LICENSE]: https://github.com/hhandoko/http4s-gradle-template/blob/master/LICENSE.txt
[sdkman]: https://sdkman.io/
