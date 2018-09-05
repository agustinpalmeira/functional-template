(ns exercise7)

"Ejercicio 7."
"Escribir una funcion (enesimo) que devuelva el enesimo elemento de una secuencia."

(defn enesimo [pos seq]
	(nth seq pos)
)

;Tests
;(enesimo 2 '(4 5 6 7)) => 6
;(enesimo 0 [:a :b :c] => :a
;(enesimo 1 [1 2 3 4] => 2
;(enesimo 2 '([1 2] [3 4] [5 6]) => [5 6]
