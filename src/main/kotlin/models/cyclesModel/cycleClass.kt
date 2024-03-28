package models.cyclesModel

import java.util.*

public class cycleClass: Units() {
    val globalScanner = Scanner(System.`in`)
    val cycleList = mutableMapOf<List<String>, List<String>>()
    val cycleCollector = OutAndEntry()
    var count = 0


    fun promptCycle() {
        while (count < indicesMalist.size) {
            println("Digite a entrada:")
            val entryResponse = globalScanner.nextLine()
            cycleCollector.entry.add(entryResponse)
            println("Digite a saida:")
            val outResponse = globalScanner.nextLine()
            cycleCollector.out.add(outResponse)
            count++
        }
    }


    fun getEntryAndOut(){
        println("Entrada:")
        for ((element, index) in cycleCollector.entry.withIndex()) {
            println("$element and $index")
        }

        println("Saida:")
        for ((element, index) in cycleCollector.out.withIndex()) {
            println("$element and $index")
        }
    }

    fun addCycleInList(){
        cycleList[cycleCollector.entry] = cycleCollector.out
    }

    fun getCycleList(cycle: cycleClass) {
        for((index, element) in cycle.cycleList.keys.withIndex()){
            println("$index and $element")
        }

        for((index, element) in cycle.cycleList.values.withIndex()){
            println("$index and $element")
        }

    }

    public class Cycles {
        val cycles = mutableListOf<cycleClass>()
        var counter = 0
        init{
            startCycles()
        }

        fun getCyclesInfo(){
            cycles.forEachIndexed { index, cycle ->
                when(index) {
                    0 -> println("Primeiro Ciclo")
                    1 -> println("Segundo Ciclo")
                    2 -> println("Terceiro Ciclo")
                    else -> println("Ciclo ${index + 1}")
                }
                println(cycle.cycleCollector.entry)
                println(cycle.cycleCollector.out)
            }
        }
        fun startCycles(){

            val scanner = Scanner(System.`in`)
            println("Quantos ciclos seu teste demanda? MAX 3")
            val instancesQuantity = scanner.nextInt()

            if(instancesQuantity > 3){
                println("Maximo 3...")
                startCycles()
            } else {
                repeat(instancesQuantity){
                    cycles.add(cycleClass())
                }
            }

            for(ciclo in cycles){
                if (counter == 0) {
                    println("Primeiro")
                }
                if(counter == 1) {
                    println("Segundo Ciclo")
                }
                else if(counter == 2) {
                    println("Terceiro Ciclo")
                }
                ciclo.promptCycle()
                ciclo.addCycleInList()

                counter++

            }
        }

    }
}