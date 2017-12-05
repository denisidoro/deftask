(require '[cljs.build.api :as b])

(println "Building ...")

(let [start (System/nanoTime)]
  (b/watch "src"
    {:output-to "out/deftask.js"
     :output-dir "out"
     :optimizations :none
     :verbose false})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))