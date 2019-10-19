fun main(args:Array<String>){
    print("Enter your Array size:")
    var n= readLine()!!.toInt()

    var array=Array(n){0}
    for(i in 0 until n)
        array[i]= readLine()!!.toInt()

    print("Which number you want search? :")
    var key= readLine()!!.toInt()
    if(linearSearch(array,key)!=null)
        print("Found $key")
    else
        print("Not found")
}
/*
2,4,5,7,8
key=5
 */



fun linearSearch(arr:Array<Int>,key:Int):Int?{
    var n=arr.size

    for(i in 0 until n)
        if (arr[i] == key)
            return i



return null

}