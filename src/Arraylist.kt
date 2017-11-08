fun main(args: Array<String>) {
    var arraylist= ArrayList<String>()
    arraylist.add("Akhmad")
    arraylist.add("khanif")
    arraylist.add("zyen")
    arraylist.add("jepara")

    println("First name:"+ arraylist.get(0))

    println(" all element by object")
    for ( item in arraylist){
        println(item)
    }
}