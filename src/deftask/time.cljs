(ns deftask.time
  (:require [cljs-time.core :as time]
            [cljs-time.coerce :as time.coerce]
            [cljs-time.format :as time.format]))

(defn from-epoch-milliseconds
  [epoch-milliseconds]
  (time.coerce/from-long epoch-milliseconds))

(defn ^:export format
  [epoch-milliseconds format]
  (->> epoch-milliseconds
      time.coerce/from-long
      (time.format/unparse (time.format/formatter format))))
