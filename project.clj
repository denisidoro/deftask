(defproject deftask "0.1.0-SNAPSHOT"
  :description "Tasker Clojurescript wrapper"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.562"]
                 [com.andrewmcveigh/cljs-time "0.5.0"]]

  :url "http://example.com/FIXME"
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :plugins [[lein-npm "0.6.2"]]
  :npm {:dependencies [[source-map-support "0.4.0"]]}
  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target")
