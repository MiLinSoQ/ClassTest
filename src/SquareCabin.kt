class SquareCabin(
    private var residents: Int = 0,
    private var length: Double = 0.0
) : Dwelling(residents) {

    override val buildingMaterial: String = "Wood"
    override val capacity: Int = 6

    /**
     * calculates floor area for a square dwelling.
     *
     * @return floor area
     */
    override fun floorArea(): Double {
        return this.length * this.length
    }

}