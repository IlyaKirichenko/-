import kotlinx.coroutines.*
suspend fun pressButton (id: Int){
    delay(500L)
    println("Кнопка $id нажата")
}
suspend fun getData(id:Int){
    delay(800L)
    println("Данные $id получены")
}
suspend fun main()= coroutineScope{
    println("Введите количество функций: ")
    val n = readLine()!!.toInt()
if(n > 0)
{
    for (i in 1..n) {
        launch { getData(i) }
    }
    for (i in 1..n){
        launch { pressButton(i) }
    }
}
    else{
        println("n должно быть больше 0")
    }
}