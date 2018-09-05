(ns exercise8)

"Ejercicio 8."
"Escribir una funcion (separador) que ddivida un array de elementos a partir de la posicion dada."

(defn enesimo [pos seq]
	(split-at pos seq)
)

;Tests
;(separador 3 [1 2 3 4 5 6] => [(1 2 3) (4 5 6)]
;(separador 1 [:a :b :c :d] => [(:a) (:b :c :d)]
;(separador 2 [[1 2] [3 4] [5 6]] => [([1 2] [3 4]) ([5 6])]
