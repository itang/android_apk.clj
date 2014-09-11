(ns android-apk.clj-test
  (:require [clojure.test :refer :all]
            [android-apk.clj :refer :all]))

(deftest apk-info-test
  (testing "apk-info"
    (is (= "1000" (:app-version-code (apk-info "test/app-release-unsigned.apk"))))
    (is (nil? (apk-info "app-release.apk")))
    (is (nil? (apk-info nil)))))

