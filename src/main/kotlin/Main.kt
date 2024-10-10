package org.example

fun main() {

    var opcion: Int? = null

    while (opcion != 0) {

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

        opcion = readLine()?.toIntOrNull()

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

            else -> println("Elije una opción válida")
        }
    }
}

fun EjercicioClase() {

    val name = "Héroe"
    val name2 = "Villano"

    val heroeMaxHp = 100
    val villanoMaxHp = 100
    val heroeDamage = 25
    val villanoDamage = 15

    var heroeHp = heroeMaxHp
    var villanoHp = villanoMaxHp

    while (heroeHp > 0 && villanoHp > 0) {


        // Héroe ataca al Villano
        villanoHp -= heroeDamage
        if (villanoHp < 0) villanoHp = 0
        println("$name ataca a $name2 causando $heroeDamage de daño. Vida de $name2: $villanoHp")

        // Verificar si el Villano ha caído
        if (villanoHp == 0) {
            println("$name ha ganado la batalla!")
            break
        }

        // Villano ataca al Héroe
        heroeHp -= villanoDamage
        if (heroeHp < 0) heroeHp = 0
        println("$name2 ataca a $name causando $villanoDamage de daño. Vida de $name: $heroeHp")

        // Verificar si el Héroe ha caído
        if (heroeHp == 0) {
            println("$name2 ha ganado la batalla!")
        }
    }
}

fun Ejercicio1(){
    println("Hola Mundo")
}

fun Ejercicio2(){

}

fun Ejercicio3(){

}

fun Ejercicio4(){

}
fun Ejercicio5(){

}
fun Ejercicio6(){

}
fun Ejercicio7(){

}
fun Ejercicio8(){

}
fun Ejercicio9(){

}
fun Ejercicio10(){

}
