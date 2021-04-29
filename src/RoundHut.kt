import kotlin.math.PI

open class RoundHut(
    private var residents: Int,
    private var radius: Double) : Dwelling(residents) {

    override val buildingMaterial: String = "Straw"
    override val capacity: Int = 6

    /**
     * Calculates floor area for a round dwelling.
     *
     * @return floor area.
     */
    override fun floorArea(): Double {
        return PI * this.radius * this.radius
    }

    /**
     * Calculates the max length for a square carpet that fits the circular floor.
     *
     * @return length of carpet.
     */
    fun calculatesMaxCarpetSize() : Double {
        val diameter = 2 * this.radius
        return (diameter * diameter / 2)
    }

}