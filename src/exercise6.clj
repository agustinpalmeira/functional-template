(ns exercise6)

"Ejercicio 6."
"Escribir una funcion (ultimo) que devuelva el ultimo elemento de una secuencia de numeros."

(defn ultimo [seq]
	(last seq)
)

;Tests
;(ultimo [1 2 3 4 5]) => 5
;(ultimo '(5 4 3)) => 3
;(ultimo ["b" "c" "d"]) => "d"
