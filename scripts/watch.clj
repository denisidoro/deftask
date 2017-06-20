(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'tasclj.core
   :output-to "out/tasclj.js"
   :output-dir "out"})
