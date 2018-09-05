(ns exercise4)

"Ejercicio 4."
"Fibonacci."

(defn fibonacci [x]
	(cond (= 0 x) 0
        (= 1 x) 1
        :else (+ (fibonacci (- x 1))
                 (fibonacci (- x 2))
              )
  )
)
