(ns deftask.conversion)

(defn any->str [s]
  (cond
    (string? s) s
    (keyword? s) (name s)
    :else (str s)))

(defn any->edn-str [value]
  (with-out-str (pr value)))

(defn clj->json [data]
  (.stringify js/JSON (clj->js data)))

(defn js->cljk
  [js]
  (js->clj js :keywordize-keys true))

(defn json->cljk
  [json]
  (when-not (= json "undefined")
    (try
      (js->cljk (.parse js/JSON json))
      (catch js/Error _ nil))))
