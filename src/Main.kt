fun main() {
    val libro = Libro("Kotlin para principiantes", "Juan Pérez", 2021)
    val estudiante = Estudiante("E001", "Carlos Gómez", "Ingeniería de Software")
    val profesor = Profesor("P001", "María López", "Ciencias de la Computación")
    val visitante = Visitante("V001", "Luis Fernández")

    println(puedeTomarPrestado(estudiante, libro))
    println(puedeTomarPrestado(profesor, libro))
    println(puedeTomarPrestado(visitante, libro))
}
