(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:output-to "release/tasclj.js"
     :output-dir "release"
     :source-map "release/tasclj.js.map"
     :optimizations :simple
     :verbose true
     :externs ["externs/tasclj.js"]})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))
