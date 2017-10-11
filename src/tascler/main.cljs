(ns tascler.main
  (:require [tascler.http :as http]
  			[tascler.shell :as sh]
  			[tascler.utils :as utils]
  			[tascler.tasker :as tasker]))

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
