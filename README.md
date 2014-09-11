# android_apk.clj

A Clojure library designed to obtain basic information out of an Android APK file.

## Usage

```
> (require '[android-apk.clj :refer [apk-info]])

> (apk-info "test/app-release-unsigned.apk")
{:app-version "1.0", :package-name "com.example.myapplication", :app-version-code "1000", :max-sdk-version nil, :min-sdk-version "9", :target-sdk-version "20"}
```

## License

Copyright © 2014 itang

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
