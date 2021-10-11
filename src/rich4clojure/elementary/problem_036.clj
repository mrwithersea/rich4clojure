(ns rich4clojure.elementary.problem-036
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Let it Be =
;; By 4Clojure user: amalloy
;; Difficulty: Elementary
;; Tags: [math syntax]
;; 
;; Can you bind x, y, and z so that these are all true?
;; 
;; Note: You can't redefine `__` to solve this problem.
;; You will need to replace `__` in the `(tests ...)`
;; form.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 (let [x 7 y 3 z 1]
   (tests
    10 := (+ x y)
    4 := (+ y z)
    1 := z)))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/ed751b2bcfa34398e03ea9f77a4d12b6