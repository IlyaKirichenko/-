import kotlinx.coroutines.*
suspend fun main()= coroutineScope<Unit>{
    launch{
        for(i in 0..5){
            println(i)
            delay(400L)
        }
    }
}