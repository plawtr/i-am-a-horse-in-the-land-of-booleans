(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [something] 
(if something 
  true 
  false))

(defn abs [n]
(if (< n 0)
  (- n)
  n))

(defn divides? [divisor n]
(if (== (mod n divisor) 0)
  true 
  false))

(defn fizzbuzz [number]
(cond 
  (divides? 15 number) "gotcha!"
  (divides? 3 number) "fizz"
  (divides? 5 number) "buzz"
  :else ""))

(defn teen? [age] 
  (<= 13 age 19))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
  (number? x) (* x 2)
  (empty? x) nil
  (list? x) (* 2 (count x))
  (vector? x) (* 2 (count x))
  :else true))

(defn leap-year? [year]
  (cond
    (not (divides? 4 year)) false
    (not (divides? 100 year)) true
    (not (divides? 400 year)) false
    :else true))

; '_______'
