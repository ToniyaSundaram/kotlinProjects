import com.rsk.Providers

fun main(args: Array<String>) {

    val provider = Providers()
    val details = provider.getallProviders()
    details.forEach (::println)

   getallProviders {
        key,value -> println("\t---The key is : $key and the value is : $value")
    }
}

fun getallProviders (fn: (String, String)->Unit) {
    val providers = Providers()
    val allProviders = providers.getProviders()
    val it = allProviders.iterator()

    while (it.hasNext()) {
        val provider = it.next()
        println(provider.name)
        provider.forEach{key,value -> fn(key.toString(),value.toString())}
    }
}



fun listProvidersInstance  () {
    val providers = Providers()
    val allProviders = providers.getProviders()
    val it = allProviders.iterator()

    while (it.hasNext()) {
        val provider = it.next()
        println(provider.name)
        provider.forEach{key,value -> println("\tThe key is : $key and the value is : $value")}
    }

}






