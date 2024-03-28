



import models.cyclesModel.Units
import models.cyclesModel.cycleClass
import models.patternModel.Pattern

fun main() {
   // Documentação de como usar os ciclos
    // Os ciclos são uma classe com funções de uso facil
    // cada ciclo tem que ter um prompt, então comece instanciando a classe
    // (ex: val cycle1 = cycleClass())
    // pra usar o prompt use a função imbutida na class chamada promptCycle
    // somente assim o ciclo pode comecar e pode salvar qualquer valor atribuido a ele
    // depois de inicar o promptCycle, use o comando addCycleInList
    // addCycleInList Atribui todos os valores informados a lista num map
    // getCycleList retorna o map com valor e chave, sendo entrada a chave e saida o value.
    // GetEntryAndOut tem o mesmo significado que o getCycleList porem ele somente retorna
    // as listas em si, não o map, entao Entry e out são listas seperadas, faceis de acessar, porem não é uma boa pratica reutilizar diretamente da lista, pelo fato da necessidade de informar uma chave de indice, aumentando o codigo e diminuido a praticidade

    val units = Units()
    units.GetMapList()
    val cycle = cycleClass()
//    cycle.promptCycle()
//    cycle.addCycleInList()
//    cycle.getCycleList(cycle)

    val cycleclass = cycleClass.Cycles()
    cycleclass.getCyclesInfo()
    val creator = Pattern.patternCreator()
    creator.createPattern()
    creator.getPatternList()















}


