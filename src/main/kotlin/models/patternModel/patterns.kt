package models.patternModel

import java.util.*


open class Pattern(
    val id :String,
    val equipment: String,
    val fabricant: String,
    val serialNumber: String,
    val calibrationCertificate: String,
    val calibratorOrganization:String,
    val indicationTape: MutableList<String>,
    val minorDivided: String,
    val classes: String,
    val notSure: String,
    val patternCurve: MutableMap<String, String>,
    val periodicity: String,
    val dateOfLastCalibration: String,
    val dateOfNextCalibration:String,
    val status: String
) {
    class patternCreator{
        val patternList: MutableList<Pattern> = mutableListOf()
        fun getPatternList() {
            for (pattern in patternList) {
                println("**************************************************************")
                println("Identificação: ${pattern.id} \n" +
                        "Equipamento: ${pattern.equipment} \n" +
                        "Fabricante: ${pattern.fabricant} \n" +
                        "Numero de Serie: ${pattern.serialNumber} \n" +
                        "Certificado de Calibração: ${pattern.calibrationCertificate} \n" +
                        "Organização de Calibrador: ${pattern.calibratorOrganization}")

                println("Faixa de Indicação:")
                for (tape in pattern.indicationTape) {
                    println(tape)
                }
                println("Menor Divisão: ${pattern.minorDivided}  \n" +
                        "Classe: ${pattern.classes} \n" +
                        "Incerteza de Medição(%): ${pattern.notSure}")

                println("Curva do Padrão")
                for ((key, value) in pattern.patternCurve) {
                    println("$key: $value")
                }
                println("Período: ${pattern.periodicity} \n" +
                        "Data de Última Calibração: ${pattern.dateOfLastCalibration} \n" +
                        "Data de Próxima Calibração: ${pattern.dateOfNextCalibration} \n" +
                        "Status: ${pattern.status}")
                println("**************************************************************")
            }
        }

        fun createPattern() {
            val scanner = Scanner(System.`in`)
            println("Digite a identificação do seu padrão")
            val choice = scanner.nextLine()
            println("Que equipamento voce está usando? \n" +
                    "1.Manometro Digital \n" +
                    "2.ManoVacuômetro Digital \n" +
                    "3.Manômetro Analógico \n" +
                    "4. Outro")
            val equipmentchoice = scanner.nextInt()
            var equipmentfinalChoice = ""

            scanner.nextLine()

            when (equipmentchoice) {
                1 -> equipmentfinalChoice = "Manômetro Digital"
                2 -> equipmentfinalChoice = "ManoVacuômetro Digital"
                3 -> equipmentfinalChoice = "Manômetro Analógico"
                4 -> {
                    println("Digite o nome do equipamento:")
                    equipmentfinalChoice = scanner.nextLine()
                }
            }
            println("Escolha um fabricante: \n" +
                    "1.Zurich \n" +
                    "2.WIKA \n" +
                    "3.Outro")
            val manufacturer = scanner.nextInt()
            var fabricantChoice = ""
            scanner.nextLine()
            when (manufacturer) {
                1 -> fabricantChoice = "Zurich"
                2 -> fabricantChoice = "WIKA"
                3 -> {
                    println("Digite o nome do fabricante:")
                    fabricantChoice = scanner.nextLine()
                }
            }
            println(fabricantChoice)

            println("Digite o Número de Série:")
            val series = scanner.nextLine()

            println("Certificado de Calibração")
            val certification = scanner.nextLine()

            println("Escolha o orgão Calibrador: \n" +
                    "1.CTJ \n" +
                    "2.Outro")
            val calibrator = scanner.nextInt()
            var calibratorChoice = ""
            scanner.nextLine()
            when (calibrator) {
                1 -> calibratorChoice = "CTJ"
                2 -> {
                    println("Digite o nome do calibrador:")
                    calibratorChoice = scanner.nextLine()
                }
            }

            val indicationList: MutableList<String> = mutableListOf()

            println("Faixa de Indicação")
            println("De:")
            val from = scanner.nextLine()
            println("Até:")
            val to = scanner.nextLine()

            println("Escolha uma unidade: \n" +
                    "1.Bar \n" +
                    "2.kgf/cm² \n" +
                    "3. Outro")
            val unit = scanner.nextInt()
            var unitChoice = ""
            scanner.nextLine()
            when(unit){
                1 -> unitChoice = "Bar"
                2 -> unitChoice = "kgf/cm²"
                3 -> {
                    println("Digite a unidade:")
                    unitChoice = scanner.nextLine()
                }
            }

            indicationList.add(from)
            indicationList.add(to)
            indicationList.add(unitChoice)

            println("Digite a menor divisão:")
            val min = scanner.nextLine()

            println("Escolha a Classe: \n" +
                    "1.5A \n" +
                    "2.A3 \n" +
                    "3.Outro")

            val classe = scanner.nextInt()
            var classeChoice = ""
            scanner.nextLine()
            when(classe){
                1 -> classeChoice = "5A"
                2 -> classeChoice = "A3"
                3 -> {
                    println("Digite a classe:")
                    classeChoice = scanner.nextLine()
                }
            }

            println("Digite a Incerteza de Medição (%):")
            val incert = scanner.nextLine()

            val patternCurveMap: MutableMap<String, String> = mutableMapOf()

            println("Curva do Padrão")
            println("Digite o A:")

            val a = scanner.nextLine()
            println("Digite o B:")
            val b = scanner.nextLine()


            patternCurveMap.put("A", a)
            patternCurveMap.put("B", b)

            for((key, value) in patternCurveMap){
                println("$key -> $value")
            }

            println("Digite a Periocidade:")
            val period = scanner.nextLine()

            println("Data da Ultima Calibração:")
            val date = scanner.nextLine()

            println("Data da proxima calibração:")
            val nextDate = scanner.nextLine()

            println("Qual o Status: \n" +
                    "1.Calibrado \n" +
                    "2.Descalibrado \n" +
                    "3.Outro")

            val status = scanner.nextInt()
            var statusChoice = ""
            scanner.nextLine()
            when(status){
                1 -> statusChoice = "Calibrado"
                2 -> statusChoice = "Descalibrado"
                3 -> {
                    println("Digite o status:")
                    statusChoice = scanner.nextLine()
                }
            }

            patternList.add(Pattern(
                choice,
                equipmentfinalChoice,
                fabricantChoice,
                series,
                certification,
                calibratorChoice,
                indicationList,
                min,
                classeChoice,
                incert,
                patternCurveMap,
                period,
                date,
                nextDate,
                statusChoice
            ))



        }
    }



}





