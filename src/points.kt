class Point (private var pointName : String , private var x : Int , private var y : Int) {
    private var cordinatX = x
    private var cordinatY = y
    override fun toString(): String {
        return "$pointName($x , $y)"
    }
    fun getLength(): Int {
        val lengthX = cordinatX * cordinatX
        val lengthY = cordinatY * cordinatY
        return lengthX + lengthY

    }

    override fun equals(other: Any?): Boolean {
        return getLength()=== getLength()
        if (getLength() >= getLength() ) return true
        if (getLength() <= getLength() ) return true

    }

    override fun hashCode(): Int {
        var result = pointName.hashCode()
        result = 31 * result + x
        result = 31 * result + y
        result = 31 * result + cordinatX
        result = 31 * result + cordinatY
        return result
    }

}





fun main () {

    val pointA = Point("A", 4, 2)
    val pointB = Point("B", 0, 2)
    println(pointA)
    println(pointB)
    val lengthPointA = pointA.getLength()
    val lengthPointB = pointB.getLength()
    println(lengthPointA)
    println(lengthPointB)
    if (pointA.getLength()>(pointB.getLength())) {
       println(true)
    } else {
        println(false)
    }

}