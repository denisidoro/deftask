(ns deftask.main
  (:require [deftask.http :as http]
  			[deftask.shell :as sh]
  			[deftask.utils :as utils]
  			[deftask.tasker :as tasker]))

(def ^:private bing-target "/sdcard/Pictures/Wallpapers/bing.jpg")

(defn ^:export bing
	[]
	(-> (http/GET "bing.com/HPImageArchive.aspx?format=js&idx=0&n=1")
		:body
		JSON.parse
		utils/js->cljk
		:images
		first
		:url
		(->> (str "http://bing.com"))
		(http/download bing-target))
	(tasker/set-wallpaper bing-target))
