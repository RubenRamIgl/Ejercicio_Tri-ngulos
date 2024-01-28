class Rectangulo(val base: Double, val altura: Double) {

    init {
        require(base > 0 && altura > 0) { "La base y la altura deben ser mayores que 0" }
    }

    fun calcularArea(): Double {
        return base * altura
    }

    fun calcularPerimetro(): Double {
        return 2 * (base + altura)
    }

    override fun toString(): String {
        return "Rectángulo(base=$base, altura=$altura)"
    }
}

fun main() {
    val r1 = Rectangulo(5.0, 8.0)
    val r2 = Rectangulo(3.0, 6.0)
    val r3 = Rectangulo(7.0, 10.0)

    println(r1)
    println(r2)
    println(r3)

    println("Área de r1: ${r1.calcularArea()}")
    println("Perímetro r1: ${r1.calcularPerimetro()}")
    println("Área de r2: ${r2.calcularArea()}")
    println("Perímetro de r2: ${r2.calcularPerimetro()}")
    println("Área de r3: ${r3.calcularArea()}")
    println("Perímetro de r3: ${r3.calcularPerimetro()}")
}
