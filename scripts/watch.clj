(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'tascler.core
   :output-to "out/tascler.js"
   :output-dir "out"})
