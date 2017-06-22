(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/build "src"
    {:output-to "release/tascler.js"
     :output-dir "release"
     :source-map "release/tascler.js.map"
     :optimizations :simple
     :verbose true
     :externs ["externs/tascler.js"]})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))
