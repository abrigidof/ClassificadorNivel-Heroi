fun calcularNivel(vitorias: Int, derrotas: Int): String {
    val saldoVitorias = vitorias - derrotas

    return when {
        vitorias < 10 -> "Ferro"
        vitorias in 11..20 -> "Bronze"
        vitorias in 21..50 -> "Prata"
        vitorias in 51..80 -> "Ouro"
        vitorias in 81..90 -> "Diamante"
        vitorias in 91..100 -> "Lendário"
        vitorias >= 101 -> "Imortal"
        else -> "Nível indefinido"
    }
}

fun main() {
    val herois = listOf("Gigante", "Cavalheiro", "Príncipe", "Zeus", "Zamborian", "Zion")

    for ((index, heroi) in herois.withIndex()) {
        println("${index + 1}. $heroi")
    }

    print("Selecione um herói pelo número: ")
    val opcaoHeroi = readLine()?.toIntOrNull()

    if (opcaoHeroi != null && opcaoHeroi > 0 && opcaoHeroi <= herois.size) {
        val vitorias = 75 // Substitua com a quantidade de vitórias do herói selecionado
        val derrotas = 25 // Substitua com a quantidade de derrotas do herói selecionado

        val nivel = calcularNivel(vitorias, derrotas)
        val saldoVitorias = vitorias - derrotas

        val heroiSelecionado = herois[opcaoHeroi - 1]

        println("O Herói $heroiSelecionado tem um saldo de $saldoVitorias vitórias e está no nível de $nivel")
    } else {
        println("Opção de herói inválida. Por favor, selecione um número válido.")
    }
}
