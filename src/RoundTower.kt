class RoundTower(
    private val residents: Int,
    private var radius: Double,
    private var floors: Int = 2) : RoundHut(residents, radius) {

    override val buildingMaterial: String = "Stone"
    override val capacity: Int = this.floors * 4

    override fun floorArea(): Double {
        return super.floorArea() * this.floors
    }

}