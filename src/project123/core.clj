(ns project123.core (:require [clojure.math.numeric-tower :as math]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World! and the square root of five" (math/sqrt 5)))
  
(defn -main [name]
	(foo name))
