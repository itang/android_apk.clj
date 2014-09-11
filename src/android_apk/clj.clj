(ns android-apk.clj
  (:import [net.erdfelt.android.apk AndroidApk])
  (:require [clojure.java.io :as io]))

(defn apk-info [from]
  (when-not (nil? from)
    (let [f (io/file from)]
      (when (.exists f)
        (let [apk (AndroidApk. f)]
          {:app-version (.getAppVersion apk)
           :package-name (.getPackageName apk)
           :app-version-code (.getAppVersionCode apk)
           :max-sdk-version (.getMaxSdkVersion apk)
           :min-sdk-version (.getMinSdkVersion apk)
           :target-sdk-version (.getTargetSdkVersion apk)})))))

(comment
  (apk-info "test/app-release-unsigned.apk")
  (apk-info "s")
  (apk-info "")
  (apk-info nil)
)
