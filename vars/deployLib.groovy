def call(String type) {
    node{
        echo "Ejecutando en el nodo con argumentos: $type"
         if (arg1 == 'option1') {
            echo "Opción 1 seleccionada"
        } else {
            echo "Opción alternativa seleccionada"
        }
    }
}