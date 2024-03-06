data class Empleado(val id: Int, var nombre: String, var puesto: String)

class BaseDeDatos {
    fun guardarEmpleado(empleado: Empleado) {
        // Conexión a la base de datos
        println("Conectando a la base de datos...")
        // Lógica para guardar el empleado
        println("Empleado ${empleado.nombre} guardado en la base de datos")
    }

    fun eliminarEmpleado(empleado: Empleado) {
        // Conexión a la base de datos
        println("Conectando a la base de datos...")
        // Lógica para eliminar el empleado
        println("Empleado ${empleado.nombre} eliminado de la base de datos")
    }

}


class RealizarInformes(val id: Int, var nombre: String, var puesto: String){

    fun generarInformeEmpleado(empleado: Empleado) {
        // Generar un informe del empleado
        println("Generando informe para el empleado ${empleado.nombre}")
    }
}

fun main() {
    val empleado = Empleado(1, "Juan Pérez", "Desarrollador")
    val db = BaseDeDatos()
    db.guardarEmpleado(empleado)
    db.eliminarEmpleado(empleado)
    val informe = RealizarInformes(1, "Elia", "Front-End")
    informe.generarInformeEmpleado(empleado)
}

