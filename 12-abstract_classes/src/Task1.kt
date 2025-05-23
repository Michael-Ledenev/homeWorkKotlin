/*
Сделать класс Figure, из предыдущего урока абстрактным, перенести объявление функции area и length в него,
оставив реализацию полиморфной для классов Rectangle и Round
Для этого предварительно скопируйте сюда код классов, который вы написали в предыдущей задаче

Для этой задачи есть видео с разбором.
*/
fun main() {
    val result1 = Rectangle("red",10.7, 74.1)
    val result2 = Round("red",10.7)

    println(result1.area())
    println(result1.length())
    println(result1.isSquare())

    println(result2.area())
    println(result2.length())
}


abstract class Figure(val color: String) {
    var x: Int = 0
    var y: Int = 0

    fun moveLeft(step: Int) {x += step}
    fun moveRight(step: Int) {x -= step}
    fun moveDown(step: Int) {y += step}
    fun moveUp(step: Int) {y -= step}

    abstract fun area(): Double
    abstract fun length(): Double
}

class Rectangle(color: String, val width: Double, val height: Double) : Figure(color) {

    override fun area(): Double {return width * height}
    override fun length(): Double {return 2 * (width + height)}

    fun isSquare(): Boolean {return width == height}

}

class Round(color: String, val radius: Double) : Figure(color) {

    override fun area(): Double {return (Math.PI * radius * radius)}
    override fun length(): Double {return (2 * Math.PI * radius)}

}
