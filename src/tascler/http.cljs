(ns tascler.http)

(def ^:private method-map
  {:get "GET"
   :post "POST"
   :put "PUT"
   :delete "DELETE"})

(defn parse-response
  [xhttp]
  (let [status (.-status xhttp)
        ready-state (.-readyState xhttp)
        response-text (.-responseText xhttp)]
    (if (< 0 status 400)
      (let [json (.parse js/JSON response-text)
            response (js->clj json :keywordize-keys true)]
        {:response response
         :status status
         :ready-state ready-state})
      {:status status
       :ready-state ready-state})))

(defn request
  [{:keys [method url on-success on-error parser body]
    :or {method :get on-success #() on-error #() parser parse-response}}]
  (let [xhttp (js/XMLHttpRequest.)
        js-body (clj->js body)
        method-str (get method-map method "GET")]
    (.open xhttp method-str url true)
    (aset xhttp "onload" #(-> xhttp parser on-success))
    (aset xhttp "onerror" #(-> xhttp parser on-error))
    (.send xhttp body)))
