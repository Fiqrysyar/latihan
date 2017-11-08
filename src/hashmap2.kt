fun main(args: Array<String>) {

    var map = HashMap<String, String>()
    map.put("nama_depan", "Akhmad")
    map.put("nama_tengah", "Khanif")
    map.put("nama_belakang", "Zyen")
    println(map.get("nama_depan"))

    map.put("nama_tengah", "Unisnu Jepara")
    // println(map.keys)
    for (k in map.keys) {
        println(k + "" + map.get(k))
    }

}