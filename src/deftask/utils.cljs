(ns deftask.utils)

(defn indices
  [f coll]
  (keep-indexed #(when (f %2) %1) coll))

(defn first-index
  [f coll]
  (first (indices f coll)))

(defn map-keys
  [f m]
  (into {} (for [[k v] m] [(f k) v])))

(defn map-vals
  [f m]
  (into {} (for [[k v] m] [k (f v)])))

(defn namespaced
  [ns k]
  (->> k
       name
       (keyword ns)))

(defn unnamespaced
  [k]
  (-> k
      name
      keyword))

(defn assoc-if
  ([m k v]
   (-> m (cond-> v (assoc k v))))
  ([m k v & kvs]
   (let [ret (assoc-if m k v)]
     (if kvs
       (when (next kvs)
         (recur ret (first kvs) (second kvs) (nnext kvs)))
       ret))))

(defn tap
  [& args]
  (print args)
  (last args))
