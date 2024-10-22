package org.example

fun main() { //
    var opcion: Int? = null // Inicialización de la variable que almacenará la opción del menú.

    while (opcion != 0) { // Bucle que se ejecuta mientras la opción no sea 0.

        println("Menú:")
        println("1. Ejercicio 1")
        println("2. Ejercicio 2")
        println("3. Ejercicio 3")
        println("4. Ejercicio 4")
        println("5. Ejercicio 5")
        println("6. Ejercicio 6")
        println("7. Ejercicio 7")
        println("8. Ejercicio 8")
        println("9. Ejercicio 9")
        println("10. Ejercicio 10")
        println("11. Ejercicio Clase")
        println("0. Salir")

        print("Elige una opción: ")

        opcion = readLine()?.toIntOrNull() // Lee la entrada del usuario y la convierte a Int.

        // Estructura de control que ejecuta un bloque de código según la opción seleccionada.
        when (opcion) {
            1 -> {
                println("Ejecutando el Ejercicio 1...")
                Ejercicio1()
            }
            2 -> {
                println("Ejecutando el Ejercicio 2...")
                Ejercicio2()
            }
            3 -> {
                println("Ejecutando el Ejercicio 3...")
                Ejercicio3()
            }
            4 -> {
                println("Ejecutando el Ejercicio 4...")
                Ejercicio4()
            }
            5 -> {
                println("Ejecutando el Ejercicio 5...")
                Ejercicio5()
            }
            6 -> {
                println("Ejecutando el Ejercicio 6...")
                Ejercicio6()
            }
            7 -> {
                println("Ejecutando el Ejercicio 7...")
                Ejercicio7()
            }
            8 -> {
                println("Ejecutando el Ejercicio 8...")
                Ejercicio8()
            }
            9 -> {
                println("Ejecutando el Ejercicio 9...")
                Ejercicio9()
            }
            10 -> {
                println("Ejecutando el Ejercicio 10...")
                Ejercicio10()
            }
            11 -> {
                println("Ejecutando el Ejercicio 11...")
                EjercicioClase()
            }
            0 -> println("Saliendo")
            else -> println("Elige una opción válida")
        }
    }
}

// Ejercicio que se hizo en clase
fun EjercicioClase() {
    val name = "Héroe"
    val name2 = "Villano"

    val heroeMaxHp = 100
    val villanoMaxHp = 100
    val heroeDamage = 25
    val villanoDamage = 15

    var heroeHp = heroeMaxHp // Inicializa la vida actual del héroe.
    var villanoHp = villanoMaxHp // Inicializa la vida actual del villano.

    // Bucle que simula la batalla mientras ambos personajes tengan vida.
    while (heroeHp > 0 && villanoHp > 0) {
        // El héroe ataca al villano.
        villanoHp -= heroeDamage // Resta el daño del héroe a la vida del villano.
        if (villanoHp < 0) villanoHp = 0 // Asegura que la vida del villano no sea negativa.
        println("$name ataca a $name2 causando $heroeDamage de daño. Vida de $name2: $villanoHp")

        // Verifica la vida del villano.
        if (villanoHp == 0) {
            println("$name ha ganado la batalla!")
            break // Arregla el problema de que el cadáver del villano ataque xD
        }

        // El villano ataca al héroe.
        heroeHp -= villanoDamage // Resta el daño del villano a la vida del héroe.
        if (heroeHp < 0) heroeHp = 0 // Asegura que la vida del héroe no sea negativa.
        println("$name2 ataca a $name causando $villanoDamage de daño. Vida de $name: $heroeHp")

        // Verifica la vida del héroe.
        if (heroeHp == 0) {
            println("$name2 ha ganado la batalla!")
        }
    }
}


fun Ejercicio1() {
    println("Hola Mundo")
}

fun Ejercicio2() {
    val vida = 100
    println("La vida del personaje es $vida")
}

fun Ejercicio3() {
    val dañoPorAtaque = 5
    val cantidadAtaques = 10
    val dañoTotal = dañoPorAtaque * 5 * cantidadAtaques
    println("El daño total es $dañoTotal")
}

fun Ejercicio4() {
    var monedas = 0

    for (i in 1..10) {
        monedas += 5
        println("Paso $i: Tienes $monedas monedas") // Muestra la cantidad acumulada de monedas.
    }
}

fun Ejercicio5() {
    print("Ingresa el nivel del personaje: ")
    val nivel = readLine()?.toIntOrNull() // Lee el nivel ingresado y lo convierte a Int.

    if (nivel != null) { // Verifica que el nivel no sea nulo.
        when {
            nivel < 10 -> println("Personaje principiante")
            nivel in 10..20 -> println("Personaje intermedio")
            nivel > 20 -> println("Personaje avanzado")
            else -> println("Nivel no válido")
        }
    } else {
        println("Entrada no válida. Por favor ingresa un número.")
    }
}

fun Ejercicio6() {

    val ataques = listOf(30, 55, 40, 70, 20)

    for (ataque in ataques) {
        val danioTotal = if (ataque > 50) {
            println("¡Golpe crítico!")
            ataque * 2 // Devuelve el daño crítico
        } else {
            ataque // Devuelve el daño normal
        }
        println("Daño infligido: $danioTotal")
    }
}

fun Ejercicio7() {

    println("Este es el mismo ejercicio que el caso 11 que hicimos en clase, para verlo pulsa el 11 :)")
}

fun Ejercicio8() {
    val inventario = mutableListOf<String>() // Crea una lista mutable para almacenar objetos en el inventario.
    var opcion: Int? = null

    while (opcion != 0) {  // Estructura de control que ejecuta según la opción seleccionada.

        println("Menú de Inventario:")
        println("1. Agregar objeto")
        println("2. Eliminar objeto")
        println("3. Mostrar objetos")
        println("0. Volver al menú principal")
        print("Elige una opción: ")

        opcion = readLine()?.toIntOrNull() // Lee la opción del usuario y la convierte a un número entero o null si la entrada no es válida.

        // Estructura de control que ejecuta según la opción seleccionada.
        when (opcion) {
            1 -> {
                print("Ingresa el nombre del objeto a agregar: ") //
                val objeto = readLine() //
                if (!objeto.isNullOrEmpty()) { // Verifica que el nombre no esté vacío.
                    inventario.add(objeto) // Agrega el objeto a la lista de inventario.
                    println("Añadido: $objeto")
                } else {
                    println("Por favor, proporciona un objeto para agregar.")
                }
            }

            2 -> {
                print("Ingresa el nombre del objeto a eliminar: ")
                val objeto = readLine()
                if (objeto != null && inventario.remove(objeto)) {
                    println("Eliminado: $objeto")
                } else {
                    println("El objeto no se encontró en el inventario.")
                }
            }

            3 -> {
                if (inventario.isEmpty()) {
                    println("El inventario está vacío.")
                } else {
                    println("Objetos en el inventario: ${inventario.joinToString(", ")}") // Muestra los objetos en el inventario.
                }
            }

            0 -> println("Volviendo al menú principal...")
            else -> println("Opción no válida. Usa 1, 2, 3 o 0.")
        }
    }
}

fun Ejercicio9() {
    val nombrePersonaje = "Héroe"
    var experiencia = 0
    var nivel = 1

    // Simula ganar batallas.
    for (i in 1..5) { // Simula 5 batallas.
        println("Batalla $i ganada!")
        experiencia += 50 // Aumenta la experiencia ganada.
        println("Experiencia actual: $experiencia") // Muestra la experiencia actual.

        if (experiencia >= 200) { // Verifica si la experiencia es suficiente para subir de nivel.
            nivel++
            experiencia -= 200 // Reinicia la experiencia después de subir de nivel.
            println("$nombrePersonaje ha subido al nivel $nivel!")
        }
    }

    println("$nombrePersonaje tiene $experiencia puntos de experiencia y está en el nivel $nivel.") // Muestra la experiencia y nivel final.
}

fun Ejercicio10() {
    val vidaEnemigo = 500
    val equipo = listOf(30, 45, 25, 60) // Lista de daños de cada miembro del equipo.
    var vidaRestante = vidaEnemigo // Inicializa la vida restante del enemigo.

    while (vidaRestante > 0) { // Bucle que se ejecuta mientras el enemigo tenga vida.
        val dañoTotal = equipo.sum() // Suma el daño de todos los miembros del equipo.
        vidaRestante -= dañoTotal // Resta el daño total a la vida del enemigo.
        println("El equipo ataca, causando un daño total de $dañoTotal. Vida restante del enemigo: $vidaRestante")
    }

    println("El enemigo ha sido derrotado!")
}