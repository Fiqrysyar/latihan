fun main(args: Array<String>) {
    var map=HashMap<Int,String>()
    map.put(1,"Akhmad")
    map.put(2,"Khanif")
    map.put(1,"Zyen")
    println(map.get(33))

    map.put(33,"Unisnu Jepara")
    for (k in map.keys){
        println(map.get(k))
    }
}