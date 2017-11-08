fun main(args: Array<String>) {
    fun main(args: Array<String>) {
        var arraylist= ArrayList<String>()
        arraylist.add("Akhmad")
        arraylist.add("khanif")
        arraylist.add("zyen")
        arraylist.add("jepara")

        println("First name:"+ arraylist.get(0))

        println(" all element by object")
        for ( item in arraylist) {
            println(item)
        }
    arraylist.set(0," unisnu jepara")

    println(" all element by index")
    for ( index in 0..arraylist.size-1){
        println(arraylist.get(index))
    }

        //search
        if (arraylist.contains("hussein")) {
            println("name is found")
        }else{
            println("name is not found")
        }
        }
}