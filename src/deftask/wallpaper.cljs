(ns deftask.wallpaper
  (:require [deftask.http :as http]
            [deftask.utils :as utils]
            [deftask.tasker :as tasker]))

(defn wallpaper-target
  [name]
  (str "/sdcard/Pictures/Wallpapers/" name))

(defn download-and-set
  [url name]
  (let [target (wallpaper-target (str name ".jpg"))]
    (http/download url target)
    (tasker/set-wallpaper target)))

(def ^:private ^:const bing-base "http://bing.com")
(def ^:private ^:const bing-entry-point "/HPImageArchive.aspx?format=js&idx=0&n=1")

(defn ^:export bing
  []
  (-> (str bing-base bing-entry-point)
      http/GET
      :body
      utils/json-str->cljk
      :images
      first
      :url
      (->> (str bing-base))
      (download-and-set "bing")))

(def ^:private ^:const reddit-base "https://www.reddit.com/r/")

(defn reddit
  [subreddit]
  (-> (str reddit-base subreddit "/top.json?limit=5")
      http/GET
      :body
      utils/json-str->cljk
      :data
      :children
      rand-nth
      :data
      :preview
      :images
      first
      :source
      :url
      (download-and-set subreddit)))

(def ^:export earthporn (partial reddit "EarthPorn"))
