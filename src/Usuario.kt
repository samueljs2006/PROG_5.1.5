sealed class Usuario(open val id: String, open val nombre: String)

data class Estudiante(override val id: String, override val nombre: String, val carrera: String) : Usuario(id, nombre)
data class Profesor(override val id: String, override val nombre: String, val departamento: String) : Usuario(id, nombre)
data class Visitante(override val id: String, override val nombre: String) : Usuario(id, nombre)

fun puedeTomarPrestado(usuario: Usuario, libro: Libro): String {
    return when (usuario) {
        is Estudiante -> "${usuario.nombre} puede tomar prestado el libro '${libro.titulo}' por 14 días."
        is Profesor -> "${usuario.nombre} puede tomar prestado el libro '${libro.titulo}' por 30 días."
        is Visitante -> "${usuario.nombre} no puede tomar prestado libros."
    }
}