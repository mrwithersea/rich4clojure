(ns rich4clojure.elementary.problem-003
  (:require [hyperfiddle.rcf :refer [tests]]
            [clojure.string :as string]))

;; = Intro to Strings =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; 
;; Clojure strings are Java strings. This means that you
;; can use any of the Java string methods on Clojure
;; strings.

(def __ string/upper-case)

(comment
  
  )

(tests
 (__ "hello world") := (.toUpperCase "hello world"))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/a9e56d5eec902a5e74c4261f3ed3b0ed