abstract class Dwelling(private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int

    /**
     * Calculates the floor area of the dwelling.
     * Implemented by subclasses where shape is determined
     *
     * @return floor area
     */
    abstract fun floorArea(): Double

    /**
     * Checks whether there is room for another residents.
     *
     * @return ture if room has capacity, false otherwise
     */
    fun hasRoom(): Boolean {
        return this.capacity > this.residents
    }
}

fun main() {
    val cabin = SquareCabin(2, 4.8)
    val hut = RoundHut(2, 4.8)
    val tower = RoundTower(2, 4.8)

    with (cabin) {
        println("This is Square Cabin.")
        println("BuildingMaterial: [ ${buildingMaterial} ]")
        println("Capacity: [ ${capacity} ]")
        println("Floo area: [ ${floorArea()} ]")
        println("Has room: [ ${hasRoom()} ]")
    }

    with(hut) {
        println("This is Round Hut.")
        println("Building Material: [ ${buildingMaterial} ]")
        println("Capacity: [ ${capacity} ]")
        println("Floo area: [ ${floorArea()} ]")
        println("Max Carpet: [ ${calculatesMaxCarpetSize()} ]")
        println("Has room: [ ${hasRoom()} ]")
    }

    with(tower) {
        println("This is Round Hut.")
        println("Building Material: [ ${buildingMaterial} ]")
        println("Capacity: [ ${capacity} ]")
        println("Floo area: [ ${floorArea()} ]")
        println("Max Carpet: [ ${calculatesMaxCarpetSize()} ]")
        println("Has room: [ ${hasRoom()} ]")
    }
}