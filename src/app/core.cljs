(ns app.core
  (:require [foo.bar2]))

(defn main []
  (let [c (.. js/document (createElement "DIV"))]
    (js/foo)
    (aset c "innerHTML" "<p>i'm dynamically created</p>")
    (.. js/document (getElementById "container") (appendChild c))))
