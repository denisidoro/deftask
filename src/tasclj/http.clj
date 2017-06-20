(ns tasclj.http)

(defn request 
  ([method url]
   (request method url {}))
  ([method url params]
   (let [xhttp (js/XMLHttpRequest.)
         js-params (clj->js params)]
     (.open xhttp method url false)
     (.send xhttp js-params)
     (let [status (.-status xhttp)
           response-text (.-responseText xhttp)
           json (.parse js/JSON response-text)
           response (js->clj json :keywordize-keys true)]
       {:status status
        :body response}))))

(def GET (partial request "GET"))
(def POST (partial request "POST"))
(def PUT (partial request "PUT"))
(def DELETE (partial request "DELETE"))
