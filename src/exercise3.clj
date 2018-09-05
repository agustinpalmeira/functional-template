(ns exercise3)

"Ejercicio 3"
"Escriba una funcion que dado un mapa y una key retorne true si la key vale nil
o false si vale otra cosa."

(defn mapa-key-nula [mapa key]
  (println (mapa key))
  (if (= (mapa key) nil) true false)
)

"Tests:"
"(def mapa {:a nil :b 1 :c 2})"
"(mapa-key-nula mapa :a)"
"(mapa-key-nula mapa :b)"
"(mapa-key-nula mapa :c)"
