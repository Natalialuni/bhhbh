package com.example.practicwork.torun
import com.example.practicwork.modal.Herbivores
import com.example.practicwork.modal.Predatory

fun main() {
    var listOfAnimals: List<String> = listOf("лошадь", "заяц", "тигр", "орел")
    var herbivores1 = Herbivores("лошадь", false)
    var herbivores2 = Herbivores("заяц", false)

    var predatory1 = Predatory("тигр", true)
    var predatory2 = Predatory("орел", true)

    var listOfHerbivores: List<Herbivores> = listOf(herbivores1, herbivores2)
    var listOfPredatory: List<Predatory> = listOf(predatory1, predatory2)

    println("У нас есть животные: $listOfAnimals")


    if (listOfHerbivores[0].eatMeat) (listOfHerbivores[1].eatMeat){
        println("${listOfHerbivores[0].type} ${listOfHerbivores[1].type}- не травоядные животные")
    } else {
        println("${listOfHerbivores[0].type} и ${listOfHerbivores[1].type} - травоядные животные")
    }


    if (listOfPredatory[0].eatMeat) (listOfPredatory[1].eatMeat){
            println("${listOfPredatory[0].type} ${listOfPredatory[1].type}- хищные животные")
        } else {
            println("${listOfPredatory[0].type} и ${listOfPredatory[1].type} - не хищные животные животные")
        }


            if (predatory1.eatMeat)
                println("${predatory1.type} - хищное животное")
            else println("${predatory1.type} - травоядное животное")

    if (predatory2.eatMeat)
        println("${predatory2.type} - хищное животное")
    else println("${predatory2.type} - травоядное животное")



//Это тут зачем?
        }

private operator fun Any.invoke(value: Any) {

}


   



