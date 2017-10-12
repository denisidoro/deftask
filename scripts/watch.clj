(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'deftask.core
   :output-to "out/deftask.js"
   :output-dir "out"})
