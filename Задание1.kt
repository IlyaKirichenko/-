import kotlinx.coroutines.*
suspend fun pressButton (n: Int): String{
    delay(800L)
    return "Кнопка $n нажата"
}
suspend fun getData(n:Int):String{
    delay(500L)
    return "Данные $n получены"
}
suspend fun main()= coroutineScope{
    println("Введите количество функций: ")
    val n = readLine()!!.toInt()
    if(n <= 0) {
        println("n должно быть больше 0")
    }
    else{
        var buttonRes =""
        var dataRes = ""
        for (i in 1..n) {
            launch {
                buttonRes += pressButton(i) + "\n"

            }
        }
        for (i in 1..n){
            launch {
                dataRes += pressButton(i) + "\n"

            }
        }
        delay(500L * n)
        println("\nРезультаты нажатий")
        println(buttonRes)
        println("\nРезультаты данных")
        println(dataRes)
        println("\nВсего выполнено: ${n*2} операций")
    }
}
