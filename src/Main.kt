class Empleado(val id: Int, var nombre: String, var puesto: String) {
    fun guardarEmpleado() {
        // Conexión a la base de datos
        println("Conectando a la base de datos...")
        // Lógica para guardar el empleado
        println("Empleado $nombre guardado en la base de datos")
    }

    fun eliminarEmpleado() {
        // Conexión a la base de datos
        println("Conectando a la base de datos...")
        // Lógica para eliminar el empleado
        println("Empleado $nombre eliminado de la base de datos")
    }
}

class RealizarInformes(val id: Int, var nombre: String, var puesto: String){

    fun generarInformeEmpleado() {
        // Generar un informe del empleado
        println("Generando informe para el empleado $nombre")
    }
}

fun main() {
    val empleado = Empleado(1, "Juan Pérez", "Desarrollador")
    empleado.guardarEmpleado()
    empleado.eliminarEmpleado()
    val informe = RealizarInformes(1, "Elia","Front-End")
    informe.generarInformeEmpleado()
}