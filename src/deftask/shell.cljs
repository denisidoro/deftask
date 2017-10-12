(ns deftask.shell
  (:refer-clojure :exclude [find sort cat])
  (:require [deftask.tasker :as tasker]
            [clojure.string :as str]))

(def ^:private ^:const wrap-cmd "bash /sdcard/Tasker/sh/wrap.sh")

(defn ^:private parse
  [cmd-output]
  (let [[code stdout stderr] (str/split cmd-output #"§§§")]
    {:code   code
     :stdout stdout
     :stderr stderr}))

(defn ^:export command
  [eval? cmd & args]
  (let [args         (if (seq args) args [])
        arg-str      (->> args (into [cmd]) (mapv #(str "\"" % "\"")) (str/join " "))
        full-arg-str (if eval? (str wrap-cmd " --eval " "'" arg-str "'") (str wrap-cmd " " arg-str))]
    (-> full-arg-str
        tasker/shell
        parse)))

(def unix-command (partial command false))

(def grep (partial unix-command "grep"))
(def find (partial unix-command "find"))
(def sed (partial unix-command "sed"))
(def awk (partial unix-command "awk"))
(def diff (partial unix-command "diff"))
(def sort (partial unix-command "sort"))
(def export (partial unix-command "export"))
(def xargs (partial unix-command "xargs"))
(def ls (partial unix-command "ls"))
(def pwd (partial unix-command "pwd"))
(def cd (partial unix-command "cd"))
(def ps (partial unix-command "ps"))
(def df (partial unix-command "df"))
(def kill (partial unix-command "kill"))
(def rm (partial unix-command "rm"))
(def cp (partial unix-command "cp"))
(def mv (partial unix-command "mv"))
(def cat (partial unix-command "cat"))
(def chmod (partial unix-command "chmod"))
(def chown (partial unix-command "chown"))
(def mkdir (partial unix-command "mkdir"))
(def ifconfig (partial unix-command "ifconfig"))
(def uname (partial unix-command "uname"))
(def whereis (partial unix-command "whereis"))
(def which (partial unix-command "which"))
(def whatis (partial unix-command "whatis"))
(def locate (partial unix-command "locate"))
(def tail (partial unix-command "tail"))
(def head (partial unix-command "head"))
(def less (partial unix-command "less"))
(def ping (partial unix-command "ping"))
(def date (partial unix-command "date"))
(def wget (partial unix-command "wget"))
(def curl (partial unix-command "curl"))
(def env (partial unix-command "env"))
