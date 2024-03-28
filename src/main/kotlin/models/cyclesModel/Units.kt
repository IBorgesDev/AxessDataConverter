package models.cyclesModel

open class Units {


    // Instanciando Variaveis para listas.
    var a = 7.2
    val b = 3.2
    var psi1 = 0

    // Instanciando Listas e iniciando valores Necessarios
    val maList: MutableList<Double> = mutableListOf()
    val psiList: MutableList<Int> = mutableListOf()
    val mapList = mutableMapOf<Int, Double>()

    init {
        initializeList()
        createMap()
    }

    private fun initializeList(){
        maList.add(4.0)


        //Iteradores das Listas
        while (psi1 <= 10000) {
            psiList.add(psi1)
            psi1 += 2000
        }

        while (a < 20.0) {
            maList.add(a)
            a += b

        }
        maList.add(20.0)
    }

    private fun createMap(){
        for (i in psiList.indices) {
            mapList[psiList[i]] = maList.getOrElse(i) { 0.0 }
        }
    }



    // Instancias de Indices de lista
    val indicesMalist = mapList.values.toList()
    val indicesPsiList = mapList.keys.toList()

    //Função que retorna lista



    fun GetMapList(){
        println("MAP LIST:")
        for ((key, value) in mapList) {
            println("Chave:$key -> Valor:$value")
        }
    }

    fun GetIndexesMaList(){
        for ((index, element) in maList.withIndex()) {
            println("$index and $element")
        }
    }

    fun GetIndexesPsiList(){
        for ((index, element) in psiList.withIndex()) {
            println("$index and $element")
        }
    }
}
