import com.rsk.Providers

fun main(args: Array<String>) {

    val providers = Providers()
    val allProviders = providers.getProviders()
     val it = allProviders.iterator()

    while (it.hasNext()) {
        val provider = it.next()
        println(provider.name)
        provider.forEach{key,value -> println("\tThe key is : $key and the value is : $value")}
    }
}

