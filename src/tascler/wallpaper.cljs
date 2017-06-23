(ns tascler.wallpaper
  (:require [tascler.core :as core]
            [tascler.http :as http]))

(def ^:private bing-wallpaper-url
  "https://crossorigin.me/http://www.bing.com/HPImageArchive.aspx?format=js&idx=0&n=1")

(defn ^:export set-bing-wallpaper
  []
  (http/request {:url bing-wallpaper-url
                 :on-success #(do
                                (-> % str core/flash)
                                (core/exit))}))
